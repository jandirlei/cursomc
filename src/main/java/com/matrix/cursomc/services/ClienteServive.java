package com.matrix.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matrix.cursomc.domain.Cliente;
import com.matrix.cursomc.repositories.ClienteRepository;
import com.matrix.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteServive {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = clienteRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException ("Objeto não encontrado! Id: " + id
				+ ",Tipo: " + Cliente.class.getName()));
		}

}
