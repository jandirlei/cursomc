package com.matrix.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matrix.cursomc.domain.Pagamento;

@Repository
public interface PagamentoRepositoy extends JpaRepository<Pagamento, Integer>{

}
