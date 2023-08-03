package com.matrix.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matrix.cursomc.domain.Pedido;

@Repository
public interface PedidoRepositoy extends JpaRepository<Pedido, Integer> {

}
