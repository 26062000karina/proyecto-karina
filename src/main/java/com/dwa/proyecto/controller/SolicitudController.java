package com.dwa.proyecto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dwa.proyecto.modelo.Solicitudasesorias;
import com.dwa.proyecto.servicios.SolicitudServicio;


@Controller
public class SolicitudController {
	
	@Autowired
	private SolicitudServicio ServicioSolici;

	@GetMapping("/asesorias/listarsolicitudes")
	public String listar(Model modelo)
	{
		Iterable<Solicitudasesorias> solicitudes = ServicioSolici.listadoSoli();
		if(solicitudes!=null && solicitudes.iterator().hasNext())
		{
			modelo.addAttribute("soli", solicitudes);
		}
		else
		{
			modelo.addAttribute("error", "Aun no hay solicitudes registradas...");
		}
		return "asesorias/listarsolicitudes";
	}
	
	@GetMapping("/asesorias/solicitud")
	public String agregar(Model model)
	{
		model.addAttribute("soliasesoria", new Solicitudasesorias());
		return "asesorias/solicitud";
	}
	
	@PostMapping("/asesorias/solicitud")
	public String agregar(Model modelo, @ModelAttribute Solicitudasesorias soli)
	{
		boolean res= ServicioSolici.agregar(soli);
		if(res)
		{
			return "redirect:/asesorias/listar";
		}
		modelo.addAttribute("error", ServicioSolici.getMensaje());
		return "/asesorias/solicitud";
	}
	
}