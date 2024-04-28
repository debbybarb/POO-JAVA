
public class Main4 {

	public static void main(String[] args) {
		int idade;
		double salario;
		String nome;
		char sexo;
		
		idade = 23;
		salario = 00.00;
		nome = "Débora Barbosa";
		sexo = 'F';
		
		System.out.println("A funcionária " + nome + ", sexo " + sexo + ", ganha " + String.format("%.2f", salario) + " e tem " + idade + " anos.");
	}

}
