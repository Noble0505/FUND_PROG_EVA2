package eva2_22_ciclos_anidados;

import java.util.Scanner;

public class EVA2_22_CICLOS_ANIDADOS {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int nume;
        System.out.println("Ingresa un numero");
        nume = input.nextInt();
        for(int i = 1; i <= nume; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i = nume; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
    
}
