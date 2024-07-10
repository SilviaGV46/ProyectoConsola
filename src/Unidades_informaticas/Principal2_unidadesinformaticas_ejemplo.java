
package Unidades_informaticas;

import static Unidades_informaticas.Principal_conversiones3.conversion;


public class Principal2_unidadesinformaticas_ejemplo {

    public static void main(String[] args) {
       //1. DECLARACION DE VARIABLES
       int opcioni, opcionf;
       double cantidad;
       Unidades_informaticas_ejemplo.cabecera();
       for(int i=0; i<1000; i++) {
           opcioni = (int)(Math.random()*9 + 1); //1
           while(true) {
               opcionf = (int)(Math.random()*9 + 1); //2 3 4 5 6 7 8 9
               if(opcioni != opcionf) break;
           }
           cantidad = (int)(Math.random()*4096 + 1);                    
           Unidades_informaticas_ejemplo ui = new Unidades_informaticas_ejemplo(opcioni,opcionf,cantidad);
           ui.cuerpo((i+1));
           //System.out.println(ui); // para que nos imprima con el (toString)
        /*   
        System.out.print("INGRESE UNIDAD DE PARTIDA? ");
        opcioni = sc.nextInt() - 1;
        System.out.print("INGRESE CANTIDAD EN " + unidades[opcioni] + "? ");
        cantidad = sc.nextDouble();
        //3. PROCESO - 4. SALIDA
        unidadesx[opcioni] = 1;
        for(int i=0; i<unidadesx.length; i++) {
            if(unidadesx[i] != 1) {// la exclamacion significa diferente
                opcionf = i;
                System.out.printf("%10s : %30s\n", unidades[opcionf], conversion(opcioni,opcionf,cantidad));
             */
       }
    }
    
}