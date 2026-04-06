import java.util.*;

public class Ex04OperadoresAritmeticos {
  public static void main(String[] args) {
    double numA, numB, total;

    numA = 8;
    numB = 3;

    total = numA - numB;
    System.out.println(total);//5

    total = numA + numB;
    System.out.println(total); //11

    total = numA * numB;
    System.out.println(total); //24

    total = numA / numB;
    System.out.printf("Total: %.2f\n", total); // f -> float/double /Total: 2.67

    total = numA % 2; // resto da divisao 8/2
    System.out.println(total); //0

    total = numA % 3; //resto da divisao 8/3
    System.out.println(total); //2

    total = numA + numB * 8 / 2 - numB; 
    System.out.println(total); //17
  }
}
