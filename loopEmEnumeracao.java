enum Nivel {
  BAIXO, 
  MEDIO,
  ALTO
}

public class Main {
  public static void main(String[] args) {
    for (Nivel minhaVar : Nivel.values()) {
      System.out.println(minhaVar);
    }
  }
}
