
package Expresiones_regulares;

import java.util.Scanner;


public class Principal2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.DECLARACION DE VARIABLES
        String logico_texto;
        boolean  logico, correcto;
        String patron = "(true|false|TRUE|FALSE|False|True|)"; //DISYUNCION = OR
        
        do {
         //2. ENTRADA
        
        System.out.println("Diga si es casado true/false? ");
        logico_texto = sc.next();
        //3. PROCESO
        correcto = logico_texto.matches(patron);
        if(correcto) {
        //if(logico_texto.matches(patron)) {
            System.out.println("Valor logico correcto");
            break;
            //logico = Boolean.parseBoolean(logico_texto);// "true" ---> true
            
        }else {
            System.out.println("Valor Logico Incorrecto");
           }
       }while(true);
        
    }
}