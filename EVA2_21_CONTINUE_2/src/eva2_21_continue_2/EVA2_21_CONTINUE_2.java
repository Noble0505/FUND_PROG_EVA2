package eva2_21_continue_2;

public class EVA2_21_CONTINUE_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = 1; i < 15; i++){
            //MODULE --> %  
            if(i % 2 != 0)
                continue;
            System.out.print(i + " - ");
        }
    }
    
}
