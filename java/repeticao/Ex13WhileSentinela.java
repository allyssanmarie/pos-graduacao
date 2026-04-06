import java.util.*;

public class Ex13WhileSentinela {
    public static void main(String[] args) {
      int opcao = 0; //inicializa a variavel
      Scanner entrada = new Scanner(System.in); // fora do loop

      while (opcao != 99){ //teste no inicio
        System.out.println("Digite um valor qualquer e 99 para sair"); //Sentinela = valor de parada
        opcao = entrada.nextInt();
      }

      entrada.close(); // boa prática
    }
}
