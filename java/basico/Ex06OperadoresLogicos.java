import java.util.*;

public class Ex06OperadoresLogicos {
    public static void main(String[] args) {
      int a, b;
      a = 4;
      b = 8;
      System.out.println(a > b); //maior
      
      System.out.println(b >= a); //maior ou igual
      
      System.out.println(b < 10); //menor
      
      System.out.println(a > b || b == 8); //OR  
      
      System.out.println(a > b && b == 8); // AND
      
      System.out.println(!true); //NOT
    }
}
