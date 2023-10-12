
package eva2_5_oraciones;

import java.text.DecimalFormat;

public class EVA2_5_ORACIONES {
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat df = new DecimalFormat("#.0000");
 
        int var1, var2 ;
        double resu;
        
        var1 = 100;
        var2 = 200;
        
        //operador +
        // SUMA
        resu = var1 + var2;
        System.out.println("SUMA");
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("RESULTADO de var1 mas var2= " + resu);
        
         //RESTA    
        resu = var1 - var2;
        System.out.println("RESTA");
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("RESULTADO de var1 menos var2= " + resu);
        
        //MULTIPLICACION  
        resu = var1 * var2;
        System.out.println("MULTIPLICACION");
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("RESULTADO de var 1 por var2= " + resu);
        
         //DIVISION 
         //OJO: El tipo de dato es importante, si quieren 
         //el resultado de una division, hay que manejarlo flotante
         //si lo manejan entero, les dara el # de veces que cabe el
         // divisor en el dividendo (de forma entera)
         var1=15;
         var2=7;
        resu = var1 / var2;
        System.out.println("DIVISION");
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("RESULTADO de var1 entre var2= " + resu);
        
        //DIVISION FLOTANTE
        double resuExacto;
        resuExacto = var1 / var2;
        System.out.println("DIVISION FLOTANTE");
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2);
        System.out.println("RESULTADO de var1 entre var2= " + resuExacto);
        
        double var2F = 7;
        resuExacto = var1 / var2F;
        System.out.println("DIVISION EXACTA (¿SERÁ?: )");
        System.out.println("Var1 = " + var1);
        System.out.println("Var2 = " + var2F);
        System.out.println("RESULTADO de var1 entre var2F= " +df.format(resuExacto));
        
        int cifra= 7;
        double cifraDouble = 7.0;
        
        double division = 100/10; //SE TOMA EL DIVISOR COMO ENTERO
        //double division = 100 / 10.0; //SE TOA EL DIVISOR COMO FLOTANTE
        
        //PRESEDENCIA DE OPERACIONES:
        /*PRIORIDAD:
               Agrupamientos()
              */
        int a = 5, b= 3, c = 2;
        int resultado = (a * b) + (a - c) * (b - a); //(15)+(3)*(-2) //15 - 6 = 9
        System.out.println("RESULTADO PRECEDENCIA: " + resultado);
        
        //POTENCIAS Y RAICES:
        double potencia;
        potencia = Math.pow(100, 2);
        System.out.println("POTENCIA: " + potencia);
        
    }
    
}
