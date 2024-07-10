    
package vectores;

import java.util.Scanner;

public class Principal1 {

    
    public static void main(String[] args) {
  System.out.println("FORMAS DECLARAR VECTOR");
  System.out.println("......................");
  System.out.println("ESTATICO");
  int[] vector = {1,2,3,4,5,6,7,8,9,};
  System.out.println("Posicion1: " + vector[1]);
  //System.out.println("Posicion10: " + vector[10]); //este genera un error de ArrayIndexOut que dice que no podemos pedir una posicion que no esta declarada
  
  vector[1] = 8; // cambiar el valor si 
  
  System.out.println("DINAMICO");
  Scanner sc = new Scanner(System.in);
  System.out.println("Ingrese el vector? ");
  int n = sc.nextInt();
  int [] vector1 = new int[n];
  for(int i = 0; i<vector.length; i++) {
    System.out.println("Ingrese vector ["+ i +"]= ");
    //int numero = sc.nextInt();
    vector1[i] = sc.nextInt();
  }
  
    }
    
}
