class Animal {
  public void somAnimal() {
    System.out.println("O animal faz um som");
  }
}

class Porco extends Animal {
  public void somAnimal() {
    System.out.println("O porco faz : oinc oinc");
  }
}

class Cachorro extends Animal {
  public void somAnimal() {
    System.out.println("O chachorro faz: au au");
  }
}

class Main {
  public static void main(String[] args) {
    Animal meuAnimal = new Animal();
    Animal meuPorco = new Porco();
    Animal meuCachorro = new Cachorro();
    
    meuAnimal.somAnimal();
    meuPorco.somAnimal();
    meuCachorro.somAnimal();
  }
}
