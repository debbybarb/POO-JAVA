import java.util.ArrayList;
import java.util.Collections;

public class Ex1 {
	public static void main (String[] args) {
		ArrayList<String> carros = new ArrayList<String> ();
		carros.add("Volvo");
		carros.add("BMW");
		carros.add("Ford");
		carros.add("Mazda");
		Collections.sort(carros); //ordena carro
		for (String i : carros) {
			System.out.println(i);
		}
	}
}
