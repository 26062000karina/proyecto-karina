
package com.dwa.proyecto.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwa.proyecto.modelo.Asesoria;

@Service
public class AsesoriaServicio {
	@Autowired
	private RepoAsesoria repoeje;
	
	private String Mensaje;
	
	public String getMensaje()
	{
		return Mensaje;
	}
	
	public void setMensaje(String mensaje) 
	{
		Mensaje= mensaje;
	}
	
	public boolean agregar(Asesoria u)
	{
		try
		{
			repoeje.save(u);
			this.Mensaje= "Datos de la Asesoria fueron almacenados con exito";
			return true;
		}
		catch(Exception e)
		{
			this.Mensaje= "Error al registrar la solicitud";
			return false;
		}
	}
	
	
	public Iterable<Asesoria> listarAsesorias()
	{
		try
		{
			this.Mensaje="";
			return repoeje.listadoAsesorias();
		}
		catch (Exception e)
		{
			this.Mensaje= e.getMessage();
			return null;
		}
	}
}
