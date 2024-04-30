package meuPacote5a13;

public class Motor {
	float consumo;
	int potencia;
	
	public Motor() {
		consumo = 0;
		potencia = 0;
	}
	public Motor(float consumo, int potencia) {
		this.consumo = consumo;
		this.potencia = potencia;
	}
	
	public String toString() {
		return "Motor[Consumo: "+consumo+", Potência: "+potencia+"]";
	}
}

class MotorCombustao extends Motor {
	float oleoLitros; 
	
	public MotorCombustao() {
		super();
		oleoLitros = 0;
	}
	public MotorCombustao (float consumo, int potencia, float oleoLitros) {
		super(consumo, potencia);
		this.oleoLitros = oleoLitros;
	}
	public void trocarOleo (float litros, float oleoLitros, float capacidadeLitros) {
	}
	
	public String toString() {
		return super.toString()+ "Motor combustão: [Óleo (litro): " + oleoLitros +"]";
	}
}

class MotorEletrico extends MotorCombustao {
	float capacidadeDaBateria;
	float watts;
	
	public void carregarBateria(float watts) {
	}

	public String toString() {
		return super.toString()+ "[Motor elétrico: Capacidade da bateria: "+watts+"]";
	}
}

class Veiculo extends MotorEletrico {
	float pesoKg;
	float velocMax;
	float preco;
	int eixos;
	int rodas;
	float aceleracao;
	
	public Veiculo() {
		super();
		pesoKg=0;
		velocMax=0;
		preco=0;
		eixos=0;
		rodas=0;
		aceleracao=0;
	}
	
	public Veiculo (float pesoKg, float velocMax, float preco, int eixos, int rodas, float aceleracao) {
		super();
		this.pesoKg=pesoKg;
		this.velocMax=velocMax;
		this.preco=preco;
		this.eixos=eixos;
		this.rodas=rodas;
		this.aceleracao=aceleracao;
	}
	
	public void acelerar(float aceleracao, char parar) {
	}
	
	public String toString() {
		return super.toString()+"Veículo [Peso: "+pesoKg+" kg, Velocidade máxima: "+velocMax+", preço: "+preco+", eixos: "+eixos+", rodas: "+rodas+", aceleração: "+aceleracao+"]";
	}
}

class CarroPasseio extends Veiculo {
	String cor;
	String modelo;
	
	public CarroPasseio () {
		super();
		cor= "";
		modelo="";
	}
	public CarroPasseio (String cor, String modelo) {
		super(0, 0, 0, 0, 0, 0);
		this.cor=cor;
		this.modelo=modelo;
	}
	
	public String toString() {
		return super.toString()+"Carro de Passei [Cor: "+cor+", modelo: "+modelo+"]";
	}
}

class CarroPasseioEletrico extends Veiculo {
	String cor;
	String modelo;
	
	public CarroPasseioEletrico () {
		super();
		cor="0";
		modelo="0";
	}
	public CarroPasseioEletrico (String cor, String modelo) {
		super(0, 0, 0, 0, 0, 0);
		this.cor=cor;
		this.modelo=modelo;
	}
	
	public String toString() {
		return super.toString()+"Carro de passeio elétrico[Cor: "+cor+", modelo: "+modelo+"]";
	}
}
class Caminhao extends Veiculo {
	float pesoCarga;
	float alturaMax;
	float comprimento;
	
	public Caminhao () {
		super();
		pesoCarga=0;
		alturaMax=0;
		comprimento=0;
	}
	
	public Caminhao(float pesoCarga, float alturaMax, float comprimento) {
		super(0, 0, 0, 0, 0, 0);
		this.pesoCarga=pesoCarga;
		this.alturaMax=alturaMax;
		this.comprimento=comprimento;
	}
	
	public String toString() {
		return super.toString()+"Caminhão[Peso da Carga: "+pesoCarga+", altura máxima: "+alturaMax+", comprimento: "+comprimento+"]";
	}
}

class BicicletaEletrica extends Veiculo {
	public String toString() {
		return super.toString()+"Bicicleta elétrica: ";
	}
}