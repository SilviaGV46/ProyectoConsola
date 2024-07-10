
package pseint;

import java.util.Scanner;


public class Principal_Ejemplo_1_3 {

    public static void main(String[] args) {
      versionPOO1();
    }
    public static void versionEstructurada()  {
        Scanner sc = new Scanner(System.in);
        // declarar variables
        int a,b;
        double r;
        //entrada
        System.out.print("INGRESAR A? ");
        a =sc.nextInt();
        System.out.print("INGRESAR B? ");
        b =sc.nextInt();
        //proceso
        r = Math.pow((a+b),2)/3;
        //salida
        System.out.printf("RESULTADO: %.2f", r);
    }
    public static void versionPOO1() {
        Ejemplo_1_3 objeto = new Ejemplo_1_3();
        objeto.entrada();
        objeto.imprimirResultado();
    }
}
