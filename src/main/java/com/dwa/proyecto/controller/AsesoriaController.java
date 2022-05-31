
package com.dwa.proyecto.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dwa.proyecto.modelo.Asesoria;
import com.dwa.proyecto.servicios.AsesoriaServicio;

@Controller
public class AsesoriaController {
	@Autowired
	private AsesoriaServicio asesoriaServicio;
	
	
	@GetMapping("/asesorias/listar")
	public String listar(Model modelo)
	{
		Iterable<Asesoria> asesorias = asesoriaServicio.listarAsesorias();
		if(asesorias!=null && asesorias.iterator().hasNext())
		{
			modelo.addAttribute("replicas", asesorias);
		}
		else
		{
			modelo.addAttribute("error", "Aun no hay asesorias registradas...");
		}
		return "asesorias/listar";
	}
	
	
	
	
	@GetMapping("/asesorias/agregar")
	public String agregar(Model model)
	{
		model.addAttribute("asesorias", new Asesoria());
		return "asesorias/agregar";
	}
	
	@PostMapping("/asesorias/agregar")
	public String agregar(Model modelo, @ModelAttribute Asesoria soli)
	{
		boolean res= asesoriaServicio.agregar(soli);
		if(res)
		{
			return "redirect:/asesorias/listar";
		}
		modelo.addAttribute("error", asesoriaServicio.getMensaje());
		return "asesorias/agregar";
	}
	
		
}


