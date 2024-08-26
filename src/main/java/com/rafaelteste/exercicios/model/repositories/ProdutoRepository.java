package com.rafaelteste.exercicios.model.repositories;

import com.rafaelteste.exercicios.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository <Produto, Integer> {

}
