package meuPacote1a4;

public class Empresa {
	String nome;
	String cidade;
	String estado;
	int cep;
	int tel;
	int cgc;
	
	public Empresa() {
		nome = "";
		cidade = "";
		estado = "";
		cep = 0;
		tel = 0;
		cgc = 0;
	}
	
	public Empresa(String nome, String cidade, String estado, int cep, int tel, int cgc) {
		this.nome = nome;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.tel = tel;
		this.cgc = cgc;
	}
	
	public String toString() {
		return "Empresa [nome: "+nome+"cidade: "+cidade+"estado: "+estado+"cep: "+cep+"telefone: "+tel+"cgc: "+cgc+"]";
		
	}
}

class Restaurante extends Empresa {
	String tipoDeComida;
	double precoMedio;
	int numeroDeMesas;
	int capacidade;
	
	public Restaurante() {
		super();
		tipoDeComida = "";
		precoMedio = 0;
		numeroDeMesas = 0;
		capacidade = 0;
	}
	
	public Restaurante (String nome, String cidade, String estado, int cep, int tel, int cgc, String tipoDeComida, double precoMedio, int numeroDeMesas, int capacidade) {
		super(nome, cidade, estado, cep, tel, cgc);
		this.tipoDeComida = tipoDeComida;
		this.precoMedio = precoMedio;
		this.numeroDeMesas = numeroDeMesas;
		this.capacidade = capacidade;
	}
	
	public String toString() {
		return super.toString()+"Restaurante [Tipo de comida: "+tipoDeComida+" Preço médio: "+precoMedio+"Números de mesa: "+numeroDeMesas+" Capacidade: "+capacidade+"]";
	}
}
class RestauranteAQuilo extends Restaurante {
	double pesoQuilo;
	String adicionais;
	
	public RestauranteAQuilo () {
		super();
		pesoQuilo = 0;
		adicionais ="";
	}
	
	public RestauranteAQuilo (String tipoDeComida, double precoMedio, int numeroDeMesas, int capacidade, double pesoQuilo, String adicionais) {
		super("", "", "", 0, 0, 0, tipoDeComida, precoMedio, numeroDeMesas, capacidade);
		this.pesoQuilo = pesoQuilo;
		this.adicionais = adicionais;
	}
	public String toString() {
		return super.toString()+"Restaurante a quilo[Peso KG: "+pesoQuilo+" Adicionais: "+adicionais+"]";
	}
}