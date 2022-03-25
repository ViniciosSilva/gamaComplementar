package application;

import java.util.Scanner;

import entities.ContaCorrente;
import entities.ContaEspecial;
import entities.GerenciarConta;

public class Program {

	static GerenciarConta gc = new GerenciarConta();

	public static void menu() {
		System.out.println("Sistema banc�rio");
		System.out.println();
		System.out.println("(1) - Criar nova conta corrente:");
		System.out.println("(2) - Criar nova conta especial:");
		System.out.println("(3) - Exibir informa��es de uma conta:");
		System.out.println("(4) - Depositar:");
		System.out.println("(5) - Sacar:");
		System.out.println("(6) - Excluir uma conta:");
		System.out.println("(0) - Sair:");
		System.out.print("Sua op��o: ");
	}

	public static void adicionarCc(int numero) {
		ContaCorrente cc = new ContaCorrente(numero);

		gc.adicionar(cc);
	}

	public static void adicionarCEspecial(int numero, double limite) {
		ContaEspecial cEspecial = new ContaEspecial(numero, limite);
		gc.adicionar(cEspecial);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		do {
			menu();

			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("Informe um n�mero para a nova conta: ");
				int numero = sc.nextInt();
				adicionarCc(numero);
				break;
			case 2:
				System.out.print("Informe um n�mero para a nova conta especial: ");
				numero = sc.nextInt();
				System.out.print("Informe um valor de limite: ");
				double limite = sc.nextDouble();
				adicionarCEspecial(numero, limite);
				break;
			case 3:
				System.out.print("Informe o n�mero da conta para buscar: ");
				numero = sc.nextInt();
				System.out.println();
				System.out.println(gc.exibir(numero));
				System.out.println();
				break;
			case 4:
				System.out.print("Informe o n�mero da conta que receber� o dep�sito: ");
				numero = sc.nextInt();
				System.out.print("Qual o valor do dep�sito? ");
				double valor = sc.nextDouble();
				gc.depositar(numero, valor);
				break;
			case 5:
				System.out.println("Qual o n�mero da conta?");
				numero= sc.nextInt();
				System.out.print("Qual o valor de saque?");
				valor= sc.nextDouble();
				gc.sacar(numero, valor);
				break;
			case 6:
				System.out.println("Informe o n�mero da conta que ser� apagada:");
				numero = sc.nextInt();
				gc.remover(numero);
				break;
			case 0:
				System.out.println("Obrigado por usar nosso servi�os");
				opcao = 0;
				break;
			default:
				System.out.println("Op��o inv�lida");
			}
		} while (opcao != 0);
		sc.close();
	}
}