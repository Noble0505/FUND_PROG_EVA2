
package eva2_10_califas_eua;

import java.util.Scanner;


public class EVA2_10_CALIFAS_EUA {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa tu calificacion del 1 al 100"); 
        califa = input.nextInt();
        
        if((califa >= 0) && (califa <= 100)){
           if ((califa >= 90)&& (califa <= 100))
                System.out.println("A");
          else if ((califa >= 80)&& (califa <= 89))
                System.out.println("B");
          else if ((califa >= 70)&& (califa <= 79))
                System.out.println("C");
          else if ((califa >= 60)&& (califa <= 69))
                System.out.println("E");
          else if (califa < 60)
                System.out.println("F");
    }else
        System.out.println("Es un valor que no puedo procesar");
    }
    
}
