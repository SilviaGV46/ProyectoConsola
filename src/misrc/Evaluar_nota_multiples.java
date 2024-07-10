
package misrc;

import java.util.Scanner;


public class Evaluar_nota_multiples {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        //1.DECLARACION DE VARIABLES
        double nota = 0.0;
        String evaluar = "";
        //2.ENTRADA
        System.out.println("Ingrese nota? ");
        nota = sc.nextDouble();
        //3.PROCESO
        if(nota>= 0 && nota < 5) {
            evaluar = "Insuficiente";
            
        }else if(nota >= 5 && nota < 6 ) {
            evaluar = "SUFICIENTE";
            
        }else if(nota >= 6 && nota < 8 ) {
            evaluar = "BIEN";
            
        }else if(nota >= 8 && nota < 9 ) {
            evaluar = "NOTABLE";
            
        }else if(nota >= 9 && nota < 10 ) {
            evaluar = "SOBRESALIENTE";
            
        }else {
            evaluar = "Nota no valida";
        
        }
        //4.SALIDA
         System.out.println("Evaluar nota: " + evaluar);
    }
}
