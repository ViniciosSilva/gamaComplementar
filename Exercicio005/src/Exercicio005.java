import java.util.Scanner;

public class Exercicio005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int n = -1;
int soma = 0;
		while(n!=0) {
			System.out.print("Digite um número para somar ou 0 para sair:  ");
			n = sc.nextInt();
			soma+=n;
		}
		
		System.out.println("A soma dos números digitados foi: "+soma);
		sc.close();
	}

}
