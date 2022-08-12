package com.idat.webserv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "alumno")
public class Profesor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProfesor;
	private String nombre;
	private String apellido;
	private Integer edad;
	private String especialidad;
	private String fechaContrato;
	
}
