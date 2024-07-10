
package misrc;

import java.util.Scanner;


public class Conversiones { //abre 1

   
    public static void main(String[] args) { //abre 2
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese número real? ");
        String numero = sc.next();
        
        double cuadrado = Math.pow(Double.parseDouble(numero), 2); //expresion comun para conversiones 
        System.out.println("Cuadrado: " + cuadrado);
       
    } //cierra 2
    
} // cierra 1
