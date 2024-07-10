package misrc;

import java.util.Scanner;

public class Evaluar_notas {

  
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Double nota;
      
      System.out.print("Ingresa una nota? ");
      nota = sc.nextDouble();
      
      if(nota >= 5)  {
          System.out.println("APROBADO");
      }else {
          System.out.println("SUSPENSO");
          
      }
      //OPERADOR BINARIO
      System.out.println("OPERADOR BINARIO1");
      System.out.println((nota >= 4.5) ?  "APROBADO" : "SUSPENSO");
      System.out.println("OPERADOR BINARIO2");
      String resultado = ((nota >= 4.5) ?  "APROBADO" : "SUSPENSO");
      System.out.println("resultado");
    }
    
}
