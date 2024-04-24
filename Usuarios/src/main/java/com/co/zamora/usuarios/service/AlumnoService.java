package com.co.zamora.usuarios.service;

import java.util.Optional;

import com.co.zamora.usuarios.model.entity.Alumno;

public interface AlumnoService {
	public Iterable<Alumno> findAll();
	public Optional<Alumno> findById(Long id);
	public Alumno save(Alumno alumno);
	public void deleteByid (Long id);
}
