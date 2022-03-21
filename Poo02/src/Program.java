import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a hora minuto e segundo");
		int hora = sc.nextInt();
		int minuto = sc.nextInt();
		int segundo = sc.nextInt();
		Relogio relogio = new Relogio(hora, minuto, segundo);

		System.out.println(relogio);

		sc.close();
	}

}
