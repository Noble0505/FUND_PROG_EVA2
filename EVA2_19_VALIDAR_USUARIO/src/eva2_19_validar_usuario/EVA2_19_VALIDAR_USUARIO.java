package eva2_19_validar_usuario;

import java.util.Scanner;

public class EVA2_19_VALIDAR_USUARIO {
    final static String NOMBRE_USUARIO = "Admin";
    final static String PASSWORD = "Admin";
    public static void main(String[] args) {
        // TODO code application logic here
        String usuario, password;
        Scanner input = new Scanner(System.in);
        
        do{
            System.out.println("Ingresa el usuario");
            usuario = input.nextLine();
            System.out.println("Ingresa la contraseña");
            password = input.nextLine();
        }while(!usuario.equals(NOMBRE_USUARIO) || !password.equals(PASSWORD));
        System.out.println("ACCESO CONCEDICO. BIENVENIDO");
    }
    
}
