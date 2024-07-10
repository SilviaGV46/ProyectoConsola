
package misrc;

import java.util.Scanner;

public class Expresiones_validar_estatura {

    public static void main(String[] args) {
        // 1.72     1.05    2.10    "[0-2]{1}--REPETIR SOLO UNA VEZ, PARA EL PUNTO PONEMOS \\.[0-9] {2}" 
        Scanner sc = new Scanner(System.in);
        //1. DECLARAR VARIABLES
        String estatura_texto;
        String patron = "[0-2]{1}\\.[0-9]{2}";
        //2. ENTRADA
        System.out.print("Ingrese su estatura? ");
        estatura_texto = sc.next();
        //VALIDAR ENTRADA
        if(estatura_texto.matches(patron)) {
            System.out.println("Estatura válida");
            
        }else {
            System.out.println("Estatura invalida");
        }
      
    }
    
}
