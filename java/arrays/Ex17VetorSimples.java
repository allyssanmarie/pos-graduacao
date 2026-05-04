/*
 Exercicio - Vetor simples
 Objetivo: entender criação e acesso de array
 */

import java.util.*;

public class Ex17VetorSimples {
    public static void main(String[] args) {
      int[] dados = new  int[5];
      
      dados[2] = 9;
      dados[3] = 7;
      dados[0] = 0;
      
      System.out.println(dados[0]); //0
      System.out.println(dados[2]); //9
      System.out.println(dados[3]); //7
      System.out.println(dados[4]); //0
    }
}
