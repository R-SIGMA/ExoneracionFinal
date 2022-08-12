package com.idat.webserv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.webserv.model.Profesor;
import com.idat.webserv.service.ProfesorService;

@Controller
@RequestMapping("/api/v1/profesor")
public class ProfesorController {
	
	@Autowired
	private ProfesorService serv;
	
	@GetMapping("/listar")
	public @ResponseBody List<Profesor> listar(){
		return serv.listar();
	}
	
	@GetMapping("/listar/{id}")
	public @ResponseBody Profesor obtener(@PathVariable Integer id) {
		return serv.obtenerId(id);
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Profesor profesor) {
		serv.guardar(profesor);
	}
	
	@PutMapping("/actualizar")
	public @ResponseBody void actualizar(@RequestBody Profesor profesor) {
		serv.editar(profesor);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public @ResponseBody void eliminar(@PathVariable Integer id) {
		serv.eliminar(id);
	}

}
