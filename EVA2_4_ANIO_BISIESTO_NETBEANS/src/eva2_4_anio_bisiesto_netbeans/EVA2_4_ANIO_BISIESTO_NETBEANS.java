
package eva2_4_anio_bisiesto_netbeans;

import java.util.Scanner;

public class EVA2_4_ANIO_BISIESTO_NETBEANS {

    public static void main(String[] args) {
        // TODO code application logic here
        int year, residuo;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce el año");
        year = input.nextInt();
        residuo = year % 4;
        if (residuo == 0) {
            residuo = year % 100;
            if (residuo > 0) {
                System.out.println("es año bisiesto");
            } else {
                residuo = year % 400;
                if (residuo == 0) {
                    System.out.println("es año bisiesto");
                } else {
                    System.out.println("no es año bisiesto");
                }
            }
        } else {
            System.out.println("no es año bisiesto");
        }
    }    
}