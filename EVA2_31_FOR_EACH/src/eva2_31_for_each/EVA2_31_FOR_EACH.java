
package eva2_31_for_each;

public class EVA2_31_FOR_EACH {
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arreglo[i] = (int)(Math.random() * 100);            
        }
        
        for (int valor : arreglo) {
            System.out.print("["+ valor + "]");   
        } 
        String cadenas[] = new String[5];
        cadenas[0] = "Hola";
        cadenas[1] = " ";
        cadenas[2] = "Mundo";
        cadenas[3] = " ";
        cadenas[4] = "!!!!";
        System.out.println("");
        for (String cade : cadenas) {
            System.out.print(cade);
            
        }
    }
    
}
