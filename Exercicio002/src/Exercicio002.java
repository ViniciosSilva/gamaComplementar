import java.util.Scanner;

public class Exercicio002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o valor do salario bruto?");
		double salarioBruto = sc.nextDouble();

		System.out.print("Informe o valor da presta��o: ");
		double prestacao = sc.nextDouble();

		if (prestacao > salarioBruto / 100 * 30) {
			System.out.println("N�o altorizado");
		} else {
			System.out.println("consedido");
		}
		sc.close();
	}
}
