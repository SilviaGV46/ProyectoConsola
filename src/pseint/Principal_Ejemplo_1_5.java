
package pseint;

import java.util.Scanner;

public class Principal_Ejemplo_1_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //DECLARAR VARIABLES
        int num, cua, cub;
        //ENTRADA
        System.out.print("INGRESAR NUMERO? ");
        num = sc.nextInt();
        //PROCESO
        cua = (int)Math.pow(num,2);
        cub = (int) Math.pow(num, 3);
        //SALIDA
        System.out.println("CUADRADO: " + cua);
        System.out.println("CUBO: " + cub);
        
    }
    
    public static void versionEstructurada() {
        
    }
    
}
