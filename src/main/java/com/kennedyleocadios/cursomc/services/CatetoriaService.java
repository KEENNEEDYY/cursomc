package com.kennedyleocadios.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kennedyleocadios.cursomc.domain.Categoria;
import com.kennedyleocadios.cursomc.repositories.CategoriaRepository;
import com.kennedyleocadios.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CatetoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: "+id+", Tipo: " + Categoria.class.getName()));
	}

}
