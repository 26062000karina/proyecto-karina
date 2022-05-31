package com.dwa.proyecto.servicios;
import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dwa.proyecto.modelo.Asesoria;

public interface RepoAsesoria extends CrudRepository<Asesoria, Integer>{
	@Query(value = "SELECT * FROM asesoria", nativeQuery = true)
	ArrayList<Asesoria> listadoAsesorias();
}