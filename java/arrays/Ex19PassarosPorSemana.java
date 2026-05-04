/*
 Exercicio 19 - Analise de dados em array
 Objetivo: somar valores por semanas (2 semanas)
 */

import java.util.*;

public class Ex19PassarosPorSemana {
    public static void main(String[] args) {
      int[] passarosPorDia = {2, 5, 0, 7, 4, 1, 3, 0, 2, 5, 0, 1, 3, 1};
      
      int totalPassaros = 0; //inicializar pra nao pegar sem querer qualquer valor que possa esta no lixo da memoria
      int passarosPrimeiraSemana = 0; //idem
      int passarosSegundaSemana = 0; //idem
      
      for (int i = 0; i < 14; i++){
        totalPassaros += passarosPorDia[i];
      }
      System.out.println("Total: " + totalPassaros); //34 passaros observados durante as duas semanas
      
      for (int i = 0; i < 7; i++){
        passarosPrimeiraSemana = passarosPrimeiraSemana + passarosPorDia[i];
      }
      System.out.println("Semana 1: " + passarosPrimeiraSemana); //22 passaros observados na primeira semnana
      
      for (int i = 7; i < 14; i++){ //começa na posição 7 pra conseguir pegar a partir do indice 7 até o 13, tendo a seg semana
        passarosSegundaSemana = passarosSegundaSemana + passarosPorDia[i];
      }
      System.out.println("Semana 2: " + passarosSegundaSemana); // 12 passaros observados na segunda semana
    }
}
