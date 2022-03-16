import java.util.Scanner;

public class Exercicio004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um valor para a taboada");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println(n+" X "+i+" = "+ (n*i));
		}
		sc.close();
	}

}
