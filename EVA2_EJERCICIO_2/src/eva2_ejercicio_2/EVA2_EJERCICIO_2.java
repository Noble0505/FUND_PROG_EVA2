
package eva2_ejercicio_2;

import java.util.Scanner;
//Ejercicio: Solicitar al usuario dos números enteros positivos, imprimir todos los números
//pares entre ellos.
public class EVA2_EJERCICIO_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int nume1, nume2;
        System.out.println("Introduce el primer numero");
        nume1 = input.nextInt();
        System.out.println("Introduce el segundo numero");
        nume2 = input.nextInt();
        for(int i = nume1; i <= nume2; i++){
           
            if(i % 2 != 0)
                continue;
            System.out.print(i + " - ");
    }
    }
    
}
