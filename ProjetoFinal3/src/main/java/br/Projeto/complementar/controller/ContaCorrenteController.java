package br.paduan.spring02.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.paduan.spring02.dao.ContaCorrenteDAO;
import br.paduan.spring02.model.ContaCorrente;

@RestController
@CrossOrigin("*") // solicitações podem vir de qualuqer origem
public class ContaCorrenteController {

    @Autowired // injeção de dependência: JPA criar a classe e o objeto
    private ContaCorrenteDAO dao;

    @GetMapping("/contacorrente")
    public ResponseEntity<ArrayList<ContaCorrente>> obterTodos() {
        ArrayList<ContaCorrente> lista = (ArrayList<ContaCorrente>) dao.findAll();  //lista todos

        if (lista != null) {
            return ResponseEntity.ok(lista); // ok - status 200
        } else {
            return ResponseEntity.notFound().build(); // status 404
        }
    }

    @GetMapping("/conta/{numero}") // 'id' é o nome do parâmetro
    public ResponseEntity<ContaCorrente> obterContaPorNumero(@PathVariable int numero){
        contaCorrente = ContaCorrenteDAO.findById(numero).orElse(null);  //busca  a conta pela chave primária

        if (ContaCorrente) != null) {
            return ResponseEntity.ok(contaCorrente);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

