package com.dwa.proyecto.servicios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dwa.proyecto.modelo.Alumno;

public interface RepoAlumno  extends CrudRepository<Alumno, Integer>{
	@Query(value= "SELECT * FROM alumno WHERE id= ?1 AND contrasena= ?2", nativeQuery= true)
	Alumno validar(String id, String claveacceso);

}