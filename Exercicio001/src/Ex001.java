import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		double n1 = sc.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		double n2 = sc.nextDouble();
		
		System.out.printf("A média foi: %.2f", (n1+n2)/2);
		sc.close();
	}

}
