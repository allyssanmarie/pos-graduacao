/*
 Exercicio - Matriz 3x3
 Objetivo: preencher e imprimir uma matriz usando for aninhado
 */

import java.util.*;

public class Ex18MatrizSimples {
    public static void main(String[] args) {

        int[][] dados = new int[3][3]; // linhas e colunas

        // Preenchendo a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                dados[i][j] = j;
            }
        }

        // Imprimindo a matriz formatada
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(dados[i][j] + " ");
            }
            System.out.println(); // quebra de linha a cada linha
        }
    }
}
