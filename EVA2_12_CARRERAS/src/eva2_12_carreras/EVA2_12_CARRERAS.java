
package eva2_12_carreras;

import java.util.Scanner;

public class EVA2_12_CARRERAS {

    public static void main(String[] args) {
        // TODO code application logic here
        String carrera;
        Scanner input = new Scanner(System.in);
        System.out.println("INGRESA LAS SIGLAS DE TU CARRERA: ");
        carrera = input.nextLine();
        switch(carrera){
            case "ISC": System.out.println("Ingenieria en sistemas computacionales");
            break;
            case "INF": System.out.println("Ingenieria Informatica");
            break;
            case "IND": System.out.println("Ingenieria industrial");
            break;
            case "IDI": System.out.println("Ingenieria en diseño industrial");
            break;
            case "LA": System.out.println("Licenciatura en administracion");
            break;
            case "IGE": System.out.println("Ingenieria en gestion empresarial");
            break;
            case "ARQ": System.out.println("Arquitectura");
            break;
            default: // SIEMPRE ES LA ULTIMA INSTRUCCION (PERO ES OPCIONAL)
                System.out.println("No exite la carrera que pides o no es una busqueda valida");
        }
    }
    
}
