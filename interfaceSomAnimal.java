interface Animal {
  public void somAnimal(); //metodo em interface não tem corpo declarado
  public void dormir();  //metodo em interface não tem corpo declarado
}

class Porco implements Animal { //implements para "chamar" interface
  public void somAnimal() {  //declara corpo do método aqui
    System.out.println("O porco faz: oinc oinc!");
  }
  public void dormir() { //declara corpo do método aqui
    System.out.println("Zzzz...");
  }
}

class Main { 
  public static void main(String[] args) {
    Porco meuPorco = new Porco(); //cria objeto meuPorco na classe Porco
    meuPorco.somAnimal(); //atribui ao objeto o método somAnimal
    meuPorco.dormir();  //atribui ao objeto o método dormir
  }
}
