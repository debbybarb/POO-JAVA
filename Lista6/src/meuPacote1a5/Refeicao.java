package meuPacote1a5;
import java.util.ArrayList;

interface ItemDeRefeicao {
	static final String[] verduras ={"alface", "agrião", "rúcula", "acelga", "espinafre"}; 
	static final String[] proteinas ={"carne", "leite", "ovo", "peixe", "frango"}; 
	static final String[] carboidrato ={"mel", "arroz", "massas", "pão", "cereal"}; 
	static final String[] frutas ={"maça", "pera", "melancia", "uva", "laranja"}; 
	static final String[] sobremesas ={"pudim", "brownie", "bolo", "torta", "brigadeiro"}; 
}

abstract class Refeicao implements ItemDeRefeicao {
	String[] prato= new String[5];
	
	public abstract void montaLanches();
	
	public abstract void montaAlmoco();
	
	public abstract void montaJantar();
	
		public String toString() {
		return "Refeição: "+prato[0]+", "+prato[1]+", "+prato[2]+", "+prato[3]+" e "+prato[4];
	    }
}

class RefeicaoVegetariana extends Refeicao {
	
	public void montaLanches () {
		  prato[0]=null;
		  prato[1]=null;
		  prato[2]=null;
		  prato[3]=ItemDeRefeicao.frutas[(int)Math.random()%ItemDeRefeicao.frutas.length];
		  prato[4]=ItemDeRefeicao.sobremesas[(int)Math.random()%ItemDeRefeicao.sobremesas.length];	
	}
	

	
	public void montaAlmoco() {
		  prato[0]=ItemDeRefeicao.verduras[(int)Math.random()%ItemDeRefeicao.verduras.length];
		  prato[1]=null;
		  prato[2]=ItemDeRefeicao.carboidrato[(int)Math.random()%ItemDeRefeicao.carboidrato.length];
		  prato[3]=ItemDeRefeicao.frutas[(int)Math.random()%ItemDeRefeicao.frutas.length];
		  prato[4]=ItemDeRefeicao.sobremesas[(int)Math.random()%ItemDeRefeicao.sobremesas.length];	
	}
	
	public void montaJantar() {
		  prato[0]=ItemDeRefeicao.verduras[(int)Math.random()%ItemDeRefeicao.verduras.length];
		  prato[1]=null;
		  prato[2]=ItemDeRefeicao.carboidrato[(int)Math.random()%ItemDeRefeicao.carboidrato.length];
		  prato[3]=ItemDeRefeicao.frutas[(int)Math.random()%ItemDeRefeicao.frutas.length];
		  prato[4]=ItemDeRefeicao.sobremesas[(int)Math.random()%ItemDeRefeicao.sobremesas.length];	
	}
}

class RefeicaoCompleta extends Refeicao {
	
	public void montaLanches() {
		prato[0]=null;
		prato[1]=null;
		prato[2]=null;
		prato[3]=ItemDeRefeicao.frutas[(int)Math.random()%ItemDeRefeicao.frutas.length];
		prato[4]=ItemDeRefeicao.sobremesas[(int)Math.random()%ItemDeRefeicao.sobremesas.length];
	}
	
	public void montaAlmoco() {
		prato[0]=ItemDeRefeicao.verduras[(int)Math.random()%ItemDeRefeicao.verduras.length];
		prato[1]=ItemDeRefeicao.proteinas[(int)Math.random()%ItemDeRefeicao.proteinas.length];
		prato[2]=ItemDeRefeicao.carboidrato[(int)Math.random()%ItemDeRefeicao.carboidrato.length];
		prato[3]=ItemDeRefeicao.frutas[(int)Math.random()%ItemDeRefeicao.frutas.length];
		prato[4]=ItemDeRefeicao.sobremesas[(int)Math.random()%ItemDeRefeicao.sobremesas.length];
		
	}
	
	public void montaJantar() {
		prato[0]=ItemDeRefeicao.verduras[(int)Math.random()%ItemDeRefeicao.verduras.length];
		prato[1]=ItemDeRefeicao.proteinas[(int)Math.random()%ItemDeRefeicao.proteinas.length];
		prato[2]=ItemDeRefeicao.carboidrato[(int)Math.random()%ItemDeRefeicao.carboidrato.length];
		prato[3]=ItemDeRefeicao.frutas[(int)Math.random()%ItemDeRefeicao.frutas.length];
		prato[4]=ItemDeRefeicao.sobremesas[(int)Math.random()%ItemDeRefeicao.sobremesas.length];
	}
	
	public void montaChurrasco() {
		prato[0]=ItemDeRefeicao.verduras[(int)Math.random()%ItemDeRefeicao.verduras.length];
		prato[1]=ItemDeRefeicao.proteinas[(int)Math.random()%ItemDeRefeicao.proteinas.length];
		prato[2]=ItemDeRefeicao.carboidrato[(int)Math.random()%ItemDeRefeicao.carboidrato.length];
		prato[3]=null;
		prato[4]=ItemDeRefeicao.sobremesas[(int)Math.random()%ItemDeRefeicao.sobremesas.length];
	}
}