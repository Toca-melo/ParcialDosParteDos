package com.co.zamora.usuarios.model.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Alumno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String nombre;
	private String apellido;
	private String email;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date createAt;
	
	
	@PrePersist
	private void prePersiste() {
		this.setCreateAt(new Date());
	}
	
	public Alumno(Long Id, String nombre, String apellido, String email, Date createAt) {
		this.Id = Id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.createAt = createAt;
	}
	
	public Alumno() {
		
	}
	
	public String ToString() {
		return this.Id + this.nombre + this.apellido + this.email + this.createAt;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
}
