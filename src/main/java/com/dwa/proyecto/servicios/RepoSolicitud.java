package com.dwa.proyecto.servicios;


import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.dwa.proyecto.modelo.Solicitudasesorias;

public interface RepoSolicitud extends CrudRepository<Solicitudasesorias, Integer>{
	@Query(value = "SELECT * FROM solicitudasesorias", nativeQuery = true)
	ArrayList<Solicitudasesorias> listadoSoli(); 
}
