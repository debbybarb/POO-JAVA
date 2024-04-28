import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, i, x, soma;
		
		System.out.print("Quantos números serão digitados? ");
		N =sc.nextInt();
		
		soma = 0;
		for (i = 1; i <= N; i++) {
			System.out.print("Digite um número: ");
			x = sc.nextInt();
			soma = soma + x;
		}
		System.out.println("SOMA = " + soma);
		sc.close();
	}

}
