interface PrimeiraInterface {
  public void meuMetodo();
}

interface SegundaInterface {
  public void meuOutroMetodo();
}

class ClasseDemonstracao implements PrimeiraInterface, SegundaInterface {
  public void meuMetodo() {
    System.out.println("Pipipi popoppo...");
  }
  
  public void meuOutroMetodo() {
    System.out.println("Outro pipipi popopo...");
  }
}

class Main {
  public static void main(String[] args) {
    ClasseDemonstracao meuObj = new ClasseDemonstracao();
    meuObj.meuMetodo();
    meuObj.meuOutroMetodo();
  }
}
  
