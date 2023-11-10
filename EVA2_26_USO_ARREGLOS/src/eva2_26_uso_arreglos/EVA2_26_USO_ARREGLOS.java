package eva2_26_uso_arreglos;

import java.util.Scanner;

public class EVA2_26_USO_ARREGLOS {

    public static void main(String[] args) {
        // TODO code application logic here
        String[] platillos = new String[10];
        platillos[0] = "Tacos";
        platillos[1] = "Tortas de lomo";
        platillos[2] = "Tortas ahogadas";
        platillos[3] = "Tamales";
        platillos[4] = "Tripitas";
        platillos[5] = "Huevos con tocino";
        platillos[6] = "Pizza";
        platillos[7] = "Frijoles refritos";
        platillos[8] = "Chile colorado";
        platillos[9] = "Hamburguesa";
        double[] precio = {20, 50, 60, 56, 67, 55, 100, 40, 70, 80};
        System.out.println("------MENÚ------");
        for (int i = 0; i < platillos.length; i++) {
          System.out.println(i+ " - " + platillos[i] + ": $" + precio[i]);
        }
        int opc, cant;
        Scanner input = new Scanner(System.in);
        System.out.println("¿Que quieres ordenar?");
        opc = input.nextInt();
        System.out.println("¿Cuantas ordenes quieres?");
        cant = input.nextInt();
        System.out.println("El costor de tu pedido es: "+ (cant*precio[opc]));
    }
    
}
