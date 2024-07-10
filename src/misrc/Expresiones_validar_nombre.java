
package misrc;

import java.util.Scanner;


public class Expresiones_validar_nombre {

    public static void main(String[] args) {
        // LUIS, MIGUEL, CARMEN     [a-zA-Z] // [A-Z]{1}[a-z]+
        Scanner sc = new Scanner(System.in);
        //1.DECLARAR VARIABLES
        String nombre;
        String patron = "[A-Z]{1}[a-záéíóúñÑ]+";
        //2.ENTRADA
        System.out.println("Ingrese su nombre? ");
        nombre = sc.nextLine();
        //VALIDAR LA ENTRADA
        if(nombre.matches(patron)) {
            System.out.println("Nombre válido: " + nombre);
        }else {
            System.out.println("Nombre inválido: " + nombre);
        
        }  
    }
    
}
    
