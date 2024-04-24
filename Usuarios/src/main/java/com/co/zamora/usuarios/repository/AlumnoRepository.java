package com.co.zamora.usuarios.repository;

import org.springframework.data.repository.CrudRepository;

import com.co.zamora.usuarios.model.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long>{
	
}
