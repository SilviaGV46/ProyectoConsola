
package TRIANGULO;


import java.util.Scanner;

public class Principal_triangulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.DECLARACION VARIABLES
        double base, altura, area;
        //2.ENTRADA
        System.out.print("Ingresar base? ");
        base = sc.nextDouble();
        System.out.print("Ingresar altura? ");
        altura = sc.nextDouble();
        //CREAR UN OBJETO
        TRIANGULO triangulo1 = new TRIANGULO(base,altura);//CONSTRUCTO
        
       //System.out.println(triangulo.toString());
        System.out.println(triangulo1.toString());
        System.out.println(triangulo1.area());
        
        
        TRIANGULO triangulo2 = new TRIANGULO();
        triangulo2.setBase(8);
        triangulo2.setAltura(2);
        
        System.out.println(triangulo2.area());
        
      
      
    }
    
}
