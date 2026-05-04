/*
 Exercicio 16 - Metodo(funçao) soma
 Soma dois numeros inteiros
 Conceito: métodos, parâmetros e retorno de valor
 */

import java.util.*;

public class Ex16MetodoSomar { //classe Main
    
    public static int somar (int a, int b){ //retorna um valor int, somar = nome do método, parâmetros = int a, int b, assinatura = somar(int, int)
      return a + b;
    }
    public static void main(String[] args) { 
      int total = somar(10, 50);
      System.out.println("Resultado da soma: " + total);
    }
}
