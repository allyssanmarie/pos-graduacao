//Entrada de dados com Scanner//

import java.util.Scanner;

public class Ex02EntradaDadosScanner {
  public static void main(String[] args) {
    System.out.println("Informe seu nome:");
    String palavra; // variável pra receber o nome.
    Scanner entrada = new Scanner(System.in); // criando objeto
    palavra = entrada.next(); // next() pra conseguir pegar o conteúdo que o usuário digitou.
    System.out.printf("Palavra = Nome: %s", palavra); // %s = string /funciona como um "placeholder" que será substituído por um valor de texto no momento da execução
  }
}
