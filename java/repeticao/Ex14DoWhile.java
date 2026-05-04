import java.util.*;

public class Ex14DoWhile {
    public static void main(String[] args) {
      int opcao;
      
      do{
        System.out.println("Digite um valor qualquer ou 99 para sair.");
        Scanner entrada = new Scanner(System.in); //pega o valor que o usuario digitou
        opcao = entrada.nextInt(); // e guarda este valor na variavel opcao
      }while(opcao != 99);
    }
}
