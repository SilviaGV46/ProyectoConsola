
package misrc;

import java.util.Scanner;

public class Grados_Sexagesimales {

   
    public static void main(String[] args) {
        //CANVERTIR GRADOS SEXAGESIMALES A RADIANES
        Scanner sc = new Scanner(System.in);
        //1. DECLARAR VARIABLES
        double s, r;
        //2. ENTRADA
        System.out.print("Ingresar grados sexagesimales? ");
        s = sc.nextDouble();
        //3. PROCESO
        //r =s * Math.PI / 180;  
        r = Math.toRadians(s);   //otra opcion 
        //3. SALIDA
        System.out.println("Radianes: " + r);
        
      
    }
    
}
