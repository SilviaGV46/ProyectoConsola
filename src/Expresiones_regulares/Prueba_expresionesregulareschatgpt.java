
package Expresiones_regulares;

import java.util.Random;
public class Prueba_expresionesregulareschatgpt {

    public static void main(String[] args) {
     
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789=#&%";
        int longitud = 8;
        String password = generarPassword(caracteres, longitud);

        System.out.println("Contraseña generada: " + password);

        if (validarPassword(password)) {
            System.out.println("La contraseña es válida.");
        } else {
            System.out.println("La contraseña es inválida: contiene solo letras.");
        }
    }

    public static String generarPassword(String caracteres, int longitud) {
        Random random = new Random();
        StringBuilder password = new StringBuilder(longitud);

        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            password.append(caracteres.charAt(index));
        }

        return password.toString();
    }

    public static boolean validarPassword(String password) {
        // Verificar 
        return false;
       
        // Verificar 
    }
}
    

