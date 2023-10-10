
package eva2_3_modulo;

import java.util.Scanner;

public class EVA2_3_MODULO {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int valor1;
        System.out.println("Introduce el numero a evaluar");
        valor1 = input.nextInt();
        int residuo;
        
        // / --> division
        // % --> modulo
        // 
        // 5 / 2 = 2.5
        // 5 % 2 = 1
        // 6 / 2 = 3
        // & % 2 = 0
        residuo = valor1 % 2;
        if (residuo == 0) {
            System.out.println("El Numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}

