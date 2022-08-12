package com.idat.webserv.service;

import java.util.List;

import com.idat.webserv.model.Profesor;

public interface ProfesorService {

	public void guardarProfesor(Profesor profesor);
	public void editarProfesor(Profesor profesor);
	
	public void eliminarProfesor(Integer id);
	
	public List<Profesor> listarProfesor();
	public Profesor obtenerProfesorId(Integer id);
}
