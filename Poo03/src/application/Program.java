package application;

import entities.Funcionario;
import entities.FuncionarioSenior;

public class Program {

	public static void main(String[] args) {
		Funcionario func = new Funcionario("Roberto", 10, 100.0);
		FuncionarioSenior fs = new FuncionarioSenior("Tiago", 10, 200, 500);

		System.out.println(func);
		System.out.println();

		System.out.println(fs);

	}
}