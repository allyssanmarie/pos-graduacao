//String Métodos//
import java.util.*;

public class Main {
  public static void main(String[] args) {
    String valor = "Descomplica - Java";
    
    //verificar se uma sequência de caracteres ou um elemento específico está presente em uma String, neste caso está verificando "Java"
    System.out.println(valor.contains("Java"));
    //número de caracteres em uma String / tamanho da string
    System.out.println(valor.length());
    //verifica se string está vazia
    System.out.println(valor.isEmpty()); // false
    
    System.out.println(valor); //só imprime a variável
    
    String texto = "Programação";
    // Pega parte da string
    System.out.println(texto.substring(2, 4)); //pega do indice 2 até o 3
    //tudo em maiusculo
    System.out.println(texto.toUpperCase()); // PROGRAMAÇÃO
    //tudo em minusculo
    System.out.println(texto.toLowerCase()); // programação
    //retorna a posição (índice) da primeira ocorrência de um caractere ou sub-string especificado
    System.out.println(texto.indexOf("a")); // índice 5
    
    //comparar conteúdo
    String a = "Java";
    String b = "java";
    System.out.println(a.equals(b)); // false
    
    //ignora maiuscula/minuscula e compara 
    System.out.println(a.equalsIgnoreCase(b)); // true
    
    //remove espaços das pontas
    String palavra = "  Java  ";
    System.out.println(palavra.trim()); // "Java"
    //substitui caracteres
    System.out.println(palavra.replace("v", "p")); // Japa
    //junta strings
    System.out.println(palavra.concat("é legal")); // Java é legal
    
    System.out.printf("\nnumero: %.2f", 10.50); //printf = exibir textos e variáveis no console de forma formatada

  }
}
