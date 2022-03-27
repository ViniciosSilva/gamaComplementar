package br.paduan.spring02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // esta classe será persistida no BD
@Table(name = "contaCorrente")
public class ContaCorrente {

	@Id // este atributo será uma chave primária na tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // os números serão gerados sequenciais (1, 2, 3, ...)
	@Column(name = "numero") // nome da coluna no BD
	private int numero;

	@Column(name = "saldo")
	private double saldo;

	public ContaCorrente() {
	}

	public ContaCorrente(int numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void sacar(double valor) {
		if(saldo>=valor) {
			saldo-=valor;
		}

}
