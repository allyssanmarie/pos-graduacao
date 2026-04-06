//Estrutura de Múltipla Escolha (switch)/ Cadastro

import java.util.*;

public class Ex10Switch {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in); //pra ter a entrada
      System.out.println("Escolha uma opção");
      System.out.println("1 - Cadastrar Aluno: ");
      System.out.println("2 - Cadastrar Notas: ");
      System.out.println("3 - Listar Alunos e Nota: ");
      
      int numero = entrada.nextInt();
      
      switch (numero) {
        case 1:
          System.out.println("Vamos cadastrar aluno: ");
        break;
        case 2:
          System.out.println("Vamos cadastrar nota: ");
        break;
        case 3: 
          System.out.println("Listar alunos");
        break;
        default:
          System.out.println("O número é inválido.");
        
      }
    }
}
