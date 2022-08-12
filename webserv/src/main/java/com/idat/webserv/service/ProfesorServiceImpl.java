package com.idat.webserv.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.webserv.model.Profesor;
import com.idat.webserv.repository.ProfesorRepository;

@Service
public class ProfesorServiceImpl implements ProfesorService
{
	@Autowired
	public ProfesorRepository rep;

	@Override
	public void guardar(Profesor profesor) {
		rep.save(profesor);
	}

	@Override
	public void editar(Profesor profesor) {
		rep.saveAndFlush(profesor);
	}

	@Override
	public void eliminar(Integer id) {
		rep.deleteById(id);
	}

	@Override
	public List<Profesor> listar() {
		return rep.findAll();
	}

	@Override
	public Profesor obtenerId(Integer id) {
		return rep.findById(id).orElse(null);
	}
	
}
