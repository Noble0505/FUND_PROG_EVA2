
package eva2_ejercicio_1;
//Ejercicio: Solicitar al usuario dos números enteros positivos, imprimir todos los números
//entre ellos en orden ascendente.

import java.util.Scanner;

public class EVA2_EJERCICIO_1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int nume1, nume2;
        System.out.println("Introduce el primer numero");
        nume1 = input.nextInt();
        System.out.println("Introduce el segundo numero");
        nume2 = input.nextInt();
        for(int i = nume1; i <= nume2; i++){
            System.out.print(i + " - ");
    }
    }
    
}
