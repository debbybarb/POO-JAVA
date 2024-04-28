enum Nivel {
  BAIXO, 
  MEDIO,
  ALTO
}

public class Main {
  public static void main(String[] args) {
    Nivel minhaVar = Nivel.MEDIO;
    
    switch(minhaVar) {
      case BAIXO:
        System.out.println("Nível baixo");
        break;
      case MEDIO:
        System.out.println("Nível médio");
        break;
      case ALTO:
        System.out.println("Nível alto");
        break;
    }
  }
}
