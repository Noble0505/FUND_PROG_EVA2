
package eva2_30_cubo;

public class EVA2_30_CUBO {

    public static void main(String[] args) {
        // TODO code application logic here
                //3 dimensiones --> cubo
        int cubo[][][] = new int [3][4][5];
        
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length ; k++) {
                    cubo[i][j][k] = (int)(Math.random() * 100);
                }
            }
        }
        for (int i = 0; i < cubo.length; i++) {
            for (int j = 0; j < cubo[i].length; j++) {
                for (int k = 0; k < cubo[i][j].length ; k++) {
                    System.out.print("[" +cubo[i][j][k]+ "]");
                }
                System.out.println("");
            }
            System.out.println("");
            System.out.println("");
        }
        
    }
    
}
