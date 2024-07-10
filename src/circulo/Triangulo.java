
package circulo;

import circulo.Libreria;
import java.util.Scanner;


public class Triangulo {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. DECLARACION VARIABLES
        double base, altura;
        //2. ENTRADA
        System.out.print("Ingrese base? ");
        base = sc.nextDouble();
         System.out.print("Ingrese altura? ");
        altura = sc.nextDouble();
        //3. PROCESO
        base = Math.PI * Math.pow(base, 2);
        altura = 2 * Math.PI * altura;
        //4. SALIDA
        System.out.println("Area     : " + Libreria.redondear(base));
        System.out.println("Perimetro: " + Libreria.redondear(altura));
    }
    
}

/*
TRIANGULO
-----------------
ENTRADA: base, altura
SALIDA: area, perimetro 

PROCESO

*/