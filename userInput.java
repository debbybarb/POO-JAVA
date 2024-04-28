import java.util.Scanner; //importa classe Scanner

class Main {
  public static void main(String[] args) {
    Scanner meuObj = new Scanner(System.in); //cria um objeto de Scanner
    String userName;
    
    System.out.println("Insira seu nome de usuário: "); //onde usuário escreve nome e dá Enter
    userName = meuObj.nextLine(); //lê input do usuário
    
    System.out.println("Nome de usuário é: " + userName); //imprime nome do usuário 
  }
