
package eva2_14_ciclo_for_2;

import java.util.Scanner;


public class EVA2_14_CICLO_FOR_2 {

  
   public static void main(String[] args) {
      // TODO code application logic here
      int noCalifas;
      int sumaCalifas = 0;
      Scanner input = new Scanner(System.in);
      System.out.println("Introduce el numero de calificaciones");
      noCalifas = input.nextInt();
      for(int i = 1; i <= noCalifas; i++){
         System.out.println("Introduce la calificacion: ");
      //sumatoria de calificaciones
      //ACUMULADORES
      int califa = input.nextInt();
      //sumaCalifas = sumaCalifas + califa;
      sumaCalifas += califa;
      }
      // el promedio es sumaCalifas/noCalifas, pero ambos son enteros
      //y dividir enteros en java da como resultado un entero, sin decimales
      double promedio = sumaCalifas / (noCalifas * 1.0);
      System.out.println("El promedio es" +promedio);
   }
   
}
