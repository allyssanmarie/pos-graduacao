//ex com estr condicional//

import java.util.Scanner;
import java.util.Random;

public class Ex11JogoAdivinha {
    public static void main(String[] args) {
      Random gerador = new Random();
      int numAleatorio = gerador.nextInt(10); //num aleatorio entre 0 e 100
      
      Scanner entrada = new Scanner(System.in); //cria obj que permite ler dados digitados pelo usuário no teclado.
      System.out.println("Adivinhe o numero que estou pensando...");
      int numero = entrada.nextInt(); //pega o num inteiro e guarda dentro da variavel numero
      
      if (numero == numAleatorio){
        System.out.printf("Eba, você acertou! O numero que estou pensando é %d.", numAleatorio);
      }
      else {
        System.out.printf("Oh no, você errou, o numero que eu pensei é %d.", numAleatorio);
      }
    }
}
