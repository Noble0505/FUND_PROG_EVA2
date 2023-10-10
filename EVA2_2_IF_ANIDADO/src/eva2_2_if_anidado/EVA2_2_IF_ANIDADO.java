
package eva2_2_if_anidado;
import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA2_2_IF_ANIDADO {

    public static void main(String[] args) {
        // TODO code application logic here
        int valor1, valor2;
        Scanner input = new Scanner(System.in);
        System.out.println("introduce el valor #1");
        valor1 = input.nextInt();
        System.out.println("introduce el valor #2");
        valor2 = input.nextInt();
        if (valor1 > valor2)/*VERDAD */ {               /*CONCATENAR*/  
            System.out.println("El valor mas grande es " + valor1);
        } else { /*FALSO, EL VALOR1 NO ES MAS GRANDE QUE EL VALOR 2
                   if ANIDADO: UN IF DENTRO DE OTRO IF*/     
            /*= ES ASIGNACION
              == ES COMPÁRACION*/
            if (valor1 == valor2)/*VERDAD*/ {
                System.out.println("Ambos numeros son " + valor1);
            } else {
                System.out.println("El numero mayor es " + valor2 + " y el mas pequeño es " + valor1);
            }
        
    }   
   }
}