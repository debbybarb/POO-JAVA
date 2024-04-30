package meuPacote5a13;
import meuPacote5a13.*;

public class Teste {
	public static void main(String[] args) {
		Motor motor=new Motor(20.0f, 100);
		System.out.println("Dados do motor: ");
		System.out.println(motor.toString());
		
		MotorCombustao motorCombustao=new MotorCombustao(20.0f, 100, 50.0f);
		motorCombustao.trocarOleo(5,2,100);
		System.out.println("Troca de óleo em litros: ");
		System.out.println(motorCombustao.toString());
		
		MotorEletrico motorEletrico=new MotorEletrico();
		motorEletrico.carregarBateria(20.0f);
		System.out.println("Watts para carregamento da bateria: ");
		System.out.println(motorEletrico.toString());
		
		Veiculo veiculo=new Veiculo(0, 0, 0, 0, 0, 0);
		veiculo.acelerar(20.0f, 's');
		System.out.println("Aceleração do veículo: ");
		System.out.println(veiculo.toString());
		
		CarroPasseio carroPasseio=new CarroPasseio("rosa", "atual");
		System.out.println("Características do carro de passeio: ");
		System.out.println(carroPasseio.toString());
		
		CarroPasseioEletrico carroPasseioEletrico=new CarroPasseioEletrico("roxo", "bts");
		System.out.println("Características do carro de passeio elérico: ");
		System.out.println(carroPasseioEletrico.toString());
		
		Caminhao caminhao=new Caminhao(30.0f, 15.0f, 5.0f);
		System.out.println("Dados do caminhão: ");
		System.out.println(caminhao.toString());
		
		BicicletaEletrica bicicletaEletrica=new BicicletaEletrica();
		System.out.println("Bicicleta Elétrica: ");
		System.out.println(bicicletaEletrica.toString());
	}
}