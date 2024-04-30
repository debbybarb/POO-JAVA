package meuPacote1a5;
import meuPacote1a5.*;

public class Nutricionista {
	public static void main(String[] args) {
		
		RefeicaoVegetariana lanche=new RefeicaoVegetariana();
		lanche.montaLanches();
		System.out.println("Lanche Vegetariano: ");
		System.out.println(lanche.toString());
		
		RefeicaoVegetariana almoco=new RefeicaoVegetariana();
		almoco.montaAlmoco();
		System.out.println("Almoço Vegetariano: ");
		System.out.println(almoco.toString());
		
		RefeicaoVegetariana jantar=new RefeicaoVegetariana();
		jantar.montaJantar();
		System.out.println("Jantar Vegetariano: ");
		System.out.println(jantar.toString());
		
		RefeicaoCompleta lanchecomp=new RefeicaoCompleta();
		lanchecomp.montaLanches();
		System.out.println("Lanche completo: ");
		System.out.println(lanchecomp.toString());
		
		RefeicaoCompleta almococomp=new RefeicaoCompleta();
		almococomp.montaAlmoco();
		System.out.println("Almoço completo: ");
		System.out.println(almococomp.toString());
		
		RefeicaoCompleta jantarcomp=new RefeicaoCompleta();
		jantarcomp.montaJantar();
		System.out.println("Jantar completo: ");
		System.out.println(jantarcomp.toString());
		
		RefeicaoCompleta churras=new RefeicaoCompleta();
		churras.montaChurrasco();
		System.out.println("Churrasco completo: ");
		System.out.println(churras.toString());
		
		
	}
}