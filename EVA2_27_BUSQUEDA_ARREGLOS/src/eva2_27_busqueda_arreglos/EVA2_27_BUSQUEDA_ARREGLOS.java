package eva2_27_busqueda_arreglos;

import java.util.Scanner;

public class EVA2_27_BUSQUEDA_ARREGLOS {
    public static void main(String[] args) {
        // TODO code application logic here
        // CREAR UN ARREGLO DE 15 ELEMENTOS
        int[] arreglo = new int[15];
        //LLENARLO CON VALORES ALEATORIOS ENTRE 0 Y 99
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("¿Que número buscas?");
        num = input.nextInt();
        //BUSQUEDA SECUENCIAL (POR FUERZA BRUTA)
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == num)/*valor encontrado*/ {
                System.out.println("Valor encontrado en la posicion: " + i);
                break;
            }
            
        }
    }
    
}
