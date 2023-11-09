package eva2_23_arreglos;

public class EVA2_23_ARREGLOS {

    public static void main(String[] args) {
        // TODO code application logic here
        // DECLARAR EL ARREGLO = CREACION DEL ARREGLO
        int[] arreglo = new int [10];
        // COMO SE USA, EL ACCESO ES POR INDICES
        // EL PRIMER ELEMENTO DEL ARREGLO ESTA EN LA POSICION 0 (CERO)
        // ULTIMO ELEMTO ES N - 1, N ESL EL TAMAÑO DEL ARREGLO
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        
        System.out.println(arreglo[9]);
        String[] arregloCade = new String[5];
        arregloCade[0] = "hola";
        arregloCade[1] = " ";
        arregloCade[2] = "mundo";
        arregloCade[3] = " ";
        arregloCade[4] = "cruel";
        System.out.print(arregloCade[0]);
        System.out.print(arregloCade[1]);
        System.out.print(arregloCade[2]);
        System.out.print(arregloCade[3]);
        System.out.print(arregloCade[4]);
    } 
    
}
