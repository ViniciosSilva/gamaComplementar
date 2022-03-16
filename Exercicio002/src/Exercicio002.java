import java.util.Scanner;

public class Exercicio002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o valor do salario bruto?");
		double salarioBruto = sc.nextDouble();

		System.out.print("Informe o valor da prestação: ");
		double prestacao = sc.nextDouble();

		if (prestacao > salarioBruto / 100 * 30) {
			System.out.println("Não altorizado");
		} else {
			System.out.println("consedido");
		}
		sc.close();
	}
}
