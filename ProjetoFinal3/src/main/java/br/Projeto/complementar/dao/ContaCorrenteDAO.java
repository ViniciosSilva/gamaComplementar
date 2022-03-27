package br.paduan.spring02.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.paduan.spring02.model.ContaCorrente;

/*

CRUD - Create Read Update Delete
Utilizar o JPA para as operações básicas no BD

*/

public interface ContaCorrenteDAO extends CrudRepository<ContaCorrente, Integer> {
    public ArrayList<ContaCorrente> findByNumeroLike(Integer numero);

}
