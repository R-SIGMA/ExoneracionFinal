package com.idat.webserv.service;

import java.util.List;

import com.idat.webserv.model.Profesor;

public interface ProfesorService {

	public void guardar(Profesor profesor);
	public void editar(Profesor profesor);
	
	public void eliminar(Integer id);
	
	public List<Profesor> listar();
	public Profesor obtenerId(Integer id);
}
