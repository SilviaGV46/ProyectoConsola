
package Unidades_informaticas;

import java.util.Scanner;


public class Principal_conversiones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        //1.DECLARAR VARIABLES
        double cantidad;
        int opcioni, opcionf, saltos;
        int[] posiciones = new int [9];// posiciones del 0 al 8
        //String patron = ""
      
        System.out.println("(1). BYTE");
        System.out.println("(2). KILO BYTE");
        System.out.println("(3). MEGA BYTE");
        System.out.println("(4). GIGA BYTE");
        System.out.println("(5). TERA BYTE");
        System.out.println("(6). PENTA BYTE");
        System.out.println("(7). EXA BYTE");
        System.out.println("(8). ZETTA BYTE");
        System.out.println("(9). YOTTA BYTE");
        
          System.out.println("Ingrese unidad de partida? ");
          opcioni = sc.nextInt(); 
          System.out.println("Ingrese unidad de llegada? ");
          opcionf = sc.nextInt(); 
          System.out.println("Ingrese cantidad? ");
          cantidad = sc.nextInt(); 
          
          //PROCESO
          opcioni = opcioni - 1; //6 6-1=5
          opcionf = opcionf - 1; //4 4-1=3
          saltos = opcionf - opcioni;//positivo dividir, negativo multiplicar
          if(saltos > 0) {
            cantidad = cantidad * Math.pow(2, 10 +(saltos* 10)); 
         
              }else {
                  cantidad = cantidad * Math.pow(2, 10 -(saltos * 10));
            }
          //SALIDA
          System.out.println("Cantidad " + cantidad);
                  
              }
      
    }

          
        
      
    
    

