package com.idat.webserv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.webserv.model.Profesor;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {

}
