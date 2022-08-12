package com.idat.webserv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.webserv.model.Profesor;
import com.idat.webserv.repository.ProfesorRepository;

public class ProfesorServiceImpl implements ProfesorService
{
	@Autowired
	public ProfesorRepository rep;

	@Override
	public void guardarProfesor(Profesor profesor) {
		Profesor p = new Profesor();
		p.setIdProfesor(profesor.getIdProfesor());
		p.setNombre(profesor.getNombre());
		p.setApellido(profesor.getApellido());
		p.setFechaContrato(profesor.getFechaContrato());
		p.setEspecialidad(profesor.setFechaContrato(p));
		rep.save(p);
		
	}

	@Override
	public void editarProfesor(Profesor profesor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarProfesor(Integer id) {
		rep.deleteById(id);
		
	}

	@Override
	public List<Profesor> listarProfesor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profesor obtenerProfesorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
