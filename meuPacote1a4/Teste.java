package meuPacote1a4;
import meuPacote1a4.Empresa;
import meuPacote1a4.Restaurante;
import meuPacote1a4.RestauranteAQuilo;

public class Teste {
	public static void main (String[] args) {
		Empresa empresa = new Empresa("Minha empresa: ", "Minha Cidade: ", "Meu Estado: ",  12345678,  00000000,  00000);
		System.out.println("Dados da minha empresa: ");
		System.out.println(empresa.toString());
		
		Restaurante restaurante = new Restaurante("Nome do Restaurante: ", "Cidade do Restaurante: ", "Estado do restaurante: ", 12345678, 00000000, 00000 , "Tipo de comida: " , 30.50, 20, 100);
		System.out.println("Dados do restaurante: ");
		System.out.println(restaurante.toString());
		
		RestauranteAQuilo restauranteAQuilo = new RestauranteAQuilo("Comida por quilo", 20.40, 20, 100, 2.50, "Bebida e sobremesa");
		System.out.println("Dados do restaurante a quilo: ");
		System.out.println(restauranteAQuilo.toString());
	}
	
}