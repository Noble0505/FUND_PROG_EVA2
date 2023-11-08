
package eva2_ejercicio_3;

import java.util.Scanner;

public class EVA2_EJERCICIO_3 {
//Ejercicio: Solicitar un número al usuario e imprimir la sumatoria de todos los números desde
//el 1 hasta el número que introdujo el usuario.
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
        int nume1,total=0;
        System.out.println("Introduce el primer numero");
        nume1 = input.nextInt();
        for(int i = 1; i <= nume1; i++){
           total+=i;
            
    }System.out.print("La sumatoria total del 1 al "+nume1+ " es: " +total+ "");
    }
    
}
