//Estrutura de repetição com for//

import java.util.*;

public class Ex12ForLoop {
    public static void main(String[] args) {
      // Loop crescente
      for (int cont = 0; cont < 10; cont++){ //variavel de inicio ; cond de parada; incremento;
        System.out.printf("oi, contagem %d.\n",cont);
      }
      // Loop decrescente
      for (int x = 0; x > -11; x--){ //x > -11? sim, itera x = x-1 == -1...
        System.out.printf("teste x = %d.\n", x);
      }
      
    }
}
