
package misrc;

import java.util.Scanner;


public class Error_Semantico {

    
    public static void main(String[] args) {
       //INGRESAR GRADOS CENTIGRADOS Y CONVERTIRLOS A Farenheit
       Scanner sc = new Scanner(System.in);
       //1. DECLARAR VARIABLES
       double f, c;
       //2. ENTRADA
       System.out.println("Ingresar grados centigrados? ");   //Se puede invertir y poner Farenheit
       c = sc.nextDouble();
       //3. PROCESO
       f = (c + 9/5) + 32;
       //4. SALIDA
       System.out.println("Farenheit: " + f);  //Se puede invertir y poner centigrados
        
      // System.out.println("Ingresar grados farenheit? ");
      //  f = sc.nextDouble();
      //  c = (f - 32) * (5/9); error semantico
      // c = (f - 32) * (5/9.0); esta seria correcta no es lo mismo 45 que 45.0 para que declare los puntos decimales
      //  c = (f - 32) * 5/9;
      // System.out.println("Centigrados: " + c);
    }
    
}
