import java.util.Scanner;

class Ex1 { 
	public static void main(String[] args) {
		Scanner meuObj = new Scanner(System.in);
		System.out.println("Digite nome, idade e saláro: ");
		String nome = meuObj.nextLine();
		int idade = meuObj.nextInt();
		double salario = meuObj.nextDouble();
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
	}
}
