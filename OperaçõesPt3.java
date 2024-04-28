import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x, soma;
		
		soma = 0;
		System.out.print("Digite o primeiro número: ");
		x = sc.nextInt();
		
		while (x != 0) {
			soma = soma + x;
			System.out.print("Digite outro número: ");
			x = sc.nextInt();
		}
		System.out.println("SOMA = " + soma);
		sc.close();
	}

}
