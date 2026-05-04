/*
 Ex: Tabuada completa (0 a 10)
 Conceito: estrutura de repetição aninhada (for dentro de for)
 */

import java.util.*;

public class Ex15TabuadaCompleta {
    public static void main(String[] args) {
      for (int i = 0; i <= 10; i++){
        for (int j = 0; j<= 10; j++){
          System.out.println(i + " x " + j + " = " + i * j); // i X j = i * j
        }
        
        System.out.println(); // separa as tabuadas
      }
    }
}
