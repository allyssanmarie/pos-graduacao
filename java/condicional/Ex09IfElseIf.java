// Exercício: Estrutura condicional com múltiplas condições (aninhada)//

import java.util.*;

public class Ex09IfElseIf {
    public static void main(String[] args) {
      int nota = 1;
      
      if (nota >= 5) {
        System.out.println("Aprovado");
      }
      
      else if (nota >= 3 && nota < 5) {
        System.out.println("Exame");
      }
      
      else {
        System.out.println("Reprovado");
      }
    }
}
