
package eva2_11_tallas;

import java.util.Scanner;

public class EVA2_11_TALLAS {

    public static void main(String[] args) {
        // TODO code application logic here
         int talla;
        Scanner input = new Scanner(System.in);
        System.out.println("INGRESA el numero de tu talla : ");
        talla = input.nextInt();
        switch(talla){
            case 29: System.out.println("Tu talla es pequeña (small)");
            break;
            case 42: System.out.println("Tu talla es mediana (medium)");
            break;
            case 44: System.out.println("Tu talla es largo (large)");
            break;
            case 48: System.out.println("Tu talla es extra largo (xlarge)");
            break;
            default: // SIEMPRE ES LA ULTIMA INSTRUCCION (PERO ES OPCIONAL)
                System.out.println("El número de talla no es una talla válida");
        }
    }
    
}
