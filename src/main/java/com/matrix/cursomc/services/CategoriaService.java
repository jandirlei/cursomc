 package com.matrix.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matrix.cursomc.domain.Categoria;
import com.matrix.cursomc.repositories.CategoriaRepository;
import com.matrix.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService  {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria find(Integer id) {
			Optional<Categoria> obj = categoriaRepository.findById(id);
		
			return obj.orElseThrow(() -> new ObjectNotFoundException ("Objeto não encontrado! Id: " + id
					+ ",Tipo: " + Categoria.class.getName()));
			}
	
	
//	public Categoria buscar(Integer id) {
//		Categoria obj = categoriaRepository.findOne(id);
//		
//		if (obj == null) {
//			throw  new ObjectNotFoundException ("Objeto não encontrado! Id: " + id
//				+ ",Tipo: " + Categoria.class.getName());
//		}
//		return obj;
//	}
}
