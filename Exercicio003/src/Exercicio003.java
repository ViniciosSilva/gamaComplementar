import java.util.Scanner;

public class Exercicio003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<=n; i++) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
