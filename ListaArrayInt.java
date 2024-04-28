import java.util.ArrayList;

public class Ex1 {
	public static void main (String[] args) {
		ArrayList<Integer> meusNumeros = new ArrayList<Integer>();
		meusNumeros.add(10);
		meusNumeros.add(15);
		meusNumeros.add(20);
		meusNumeros.add(25);
		for (int i : meusNumeros) {
			System.out.println(i);
		}
	}
}
