
package eva2_2_if;

import java.util.Scanner;

public class EVA2_2_IF {

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args) {
      // TODO code application logic here
      Scanner input = new Scanner(System.in);
      int califa;
      System.out.println("Introduce la calificacion: ");
      califa = input.nextInt();
      
      if (califa >= 70) { // ESTO SE EJECUTA SI ES VERDADERO
            System.out.println("Tu calificacion es: " + califa + ".  ¡¡Felicidades!!, aprobaste!!");
        } else { //ESTO SE EJECUTA SI ES FALSO
            System.out.println("Tu calificacion es: " + califa + ".  Lo siento, reprobaste :c");
        }
        System.out.println("fin del codigo ya vete a tu casa a dormir chamaco meao");
   }

        
}
