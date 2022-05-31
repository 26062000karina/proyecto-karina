package com.dwa.proyecto.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwa.proyecto.modelo.Alumno;
@Service
public class AlumnoServicio {
	@Autowired
	private RepoAlumno repousu;
	private String Mensaje;
	
	public String getMensaje()
	{
		return Mensaje;
	}
	
	public void setMensaje(String mensaje) 
	{
		Mensaje = mensaje;
	}
	
	public boolean validar(String id, String clave)
	{
		Alumno usr= repousu.validar(id,clave);
		if(usr !=null)
		{
			return true;
		}
		Mensaje= "Datos de acceso incorrecto";
		return false;
	}
	
	public boolean agregar(Alumno u)
	{
		try
		{
			repousu.save(u);
			this.Mensaje= "Registro Exitoso";
			return true;
		}
		catch(Exception e)
		{
			this.Mensaje= "Error al registrar la cuenta" + e.getMessage() + e.getStackTrace();
			return false;
		}
	}
}