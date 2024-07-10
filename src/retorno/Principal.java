package retorno;

import calculadora.Calculadora;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        {
            int[] vector = retornarVector();//llamamos al vector
            for (int numero : vector) {
                System.out.println(numero);
            }
        }
        System.out.println("bloque1");
        {
            int[] vector = {4, 5, 6};
            System.out.println(Arrays.toString(vector));
        }
        System.out.println("bloque2");
        {
            int[] vector = {lucia, elena, laura};
            System.out.println(Arrays.toString(vector));
            for (String texto : vector) {
                System.out.println(texto + " " + texto.length() + " " + texto.toUpperCase());
                System.out.println("bloque3");
            }
            {
                int[] vector = {4, 5, 6};
                System.out.println(Arrays.toString(vector));
            }

            {
                String[] vector = retornarVector2();
                System.out.println(Arrays.toString(vector));
                for (String texto : vector) {
                    System.out.println(texto + " " + texto.length() + " " + texto.toUpperCase());
                }
            }
            
           System.out.println("bloque4");
           {
                Calculadora c = retornoObjeto1();
                c.setNumero1(5);
                c.setNumero2(6);
                c.setOperador("+");
                Calculadora.cabecera();
                c.cuerpo(1);
                
                
           }
            System.out.println("bloque5");
            {
              System.out.println("Ingrese un entero?");
              int numero = getEntero();  // sc.nextInt();
              
            }
        }

        //String z = "Hola".toUpperCase();
        //int x = 5;
        //Double x = new Double(1.72);
        /*
        //TIPOS DE DATOS PRIMITIVOS
        int
        double
        String
        boolean 
        
        //TIPODS DE DATOS OBJETOS
        Calculadora
        Triangulo
        int[]-- vector
         */
    }

    public static int[] retornarVector() { //llamamos al vector 
        int[] vector = {1, 3, 5}; //nos retorna el vector
        return vector;

    }
    public static Calculadora retornoObjeto1() {
        return new Calculadora();  
    }
    public static Calculadora retornoObjeto2() {
        Calculadora c = new Calculadora();
        return c;
    }
    public static int retornoValor1() {
        return 5;
    }
     public static int retornoValor2() {
         int numero = 5;
         return numero;
     }
     public static int getEntero() {
         Scanner sc = new Scanner(System.in);
         int entero = sc.nextInt();
         return entero;
     }
}
