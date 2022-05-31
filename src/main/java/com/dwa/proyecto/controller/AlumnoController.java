
package com.dwa.proyecto.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dwa.proyecto.modelo.Alumno;
import com.dwa.proyecto.servicios.AlumnoServicio;

@Controller
public class AlumnoController {
	
	@Autowired
	private AlumnoServicio servicioAlumno;

	
	@GetMapping(path= {"/alumno/validar", "/"})
	public String validar()
	{
		return "alumno/validar"; 
	}
	
	@PostMapping("/alumno/validar")
	public String validar(@RequestParam("id")String id, @RequestParam("contrasena") String contrasena, Model modelo)
	{
		boolean res = servicioAlumno.validar(id, contrasena);
		if(res)
		{
			return "redirect:/asesorias/listar";
		}
		modelo.addAttribute("error", servicioAlumno.getMensaje());
		modelo.addAttribute("id", id);
		modelo.addAttribute("contrasena", contrasena);
		return "alumno/validar";
	}
	
	@GetMapping("/alumno/agregar")
	public String agregar(Model model)
	{
		model.addAttribute("alumno", new Alumno());
		return "alumno/agregar";
	}
	
	@PostMapping("/alumno/agregar")
	public String agregar(Model modelo, @ModelAttribute Alumno soli)
	{
		boolean res= servicioAlumno.agregar(soli);
		if(res)
		{
			return "redirect:/asesorias/listar";
		}
		modelo.addAttribute("error", servicioAlumno.getMensaje());
		return "alumno/agregar";
	}
	
	
	
}