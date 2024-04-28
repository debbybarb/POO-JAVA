import java.util.Locale;
import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.forLanguageTag("pt-BR"));
		Scanner sc = new Scanner(System.in);
		
		double C, F;
		char resp;
		
		do {
			System.out.println("Digite a temperatura em Celsius: ");
			C = sc.nextDouble();
			F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)?");
			resp = sc.next().charAt(0);
		} while (resp == 's');
		
		sc.close();
	}

}
