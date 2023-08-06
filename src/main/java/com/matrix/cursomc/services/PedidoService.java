package com.matrix.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matrix.cursomc.domain.Pedido;
import com.matrix.cursomc.repositories.PedidoRepositoy;
import com.matrix.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepositoy pedidoRepositoy;
	
	public Pedido find(Integer id) {
		Optional<Pedido> obj = pedidoRepositoy.findById(id);
	
		return obj.orElseThrow(() -> new ObjectNotFoundException ("Objeto não encontrado! Id: " + id
				+ ",Tipo: " + PedidoRepositoy.class.getName()));
		}
}
