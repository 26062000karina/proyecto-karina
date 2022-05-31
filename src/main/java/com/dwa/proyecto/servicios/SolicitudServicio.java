package com.dwa.proyecto.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwa.proyecto.modelo.Solicitudasesorias;
@Service
public class SolicitudServicio {
	@Autowired
	private RepoSolicitud repoSolicitud;
	
	private String Mensaje;
	
	public String getMensaje()
	{
		return Mensaje;
	}
	
	public void setMensaje(String mensaje) 
	{
		Mensaje= mensaje;
	}
	
	public boolean agregar(Solicitudasesorias u)
	{
		try
		{
			repoSolicitud.save(u);
			this.Mensaje= "Datos de la solicitud fueron almacenados con exito";
			return true;
		}
		catch(Exception e)
		{
			this.Mensaje= "Error al registrar la solicitud";
			return false;
		}
	}
	
	public Iterable<Solicitudasesorias> listadoSoli()
	{
		try
		{
			this.Mensaje="";
			return repoSolicitud.listadoSoli();
		}
		catch (Exception e)
		{
			this.Mensaje= e.getMessage();
			return null;
		}
	}
}
