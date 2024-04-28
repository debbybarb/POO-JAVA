import java.util.Locale;
import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.forLanguageTag("pt-BR"));
		Scanner sc = new Scanner(System.in);
		
		int N, i;
		
		System.out.print("Quantos números você vai digitar? ");
		N = sc.nextInt();
		
		double[] vet = new double [N];
		
		for (i = 0; i < N; i++) {
			System.out.print("Digite um número: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.println("\nNÚMEROS DIGITADOS: ");
		for (i = 0; i < N; i++) {
			System.out.println(String.format("%.1f", vet[i]));
		}
		
		sc.close();
	}

}
