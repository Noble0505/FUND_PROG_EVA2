package eva_18_do_while;

import java.util.Scanner;

public class EVA_18_DO_WHILE {

    public static void main(String[] args) {
        // TODO code application logic here
        int nume;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Intenta adivinar el numero: ");
            nume= input.nextInt();
            
        }while(nume != 100);
        System.out.println("ADIVINASTE");
    }
    
}
