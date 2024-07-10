
package For_1;

public class Principal1 {

    public static void main(String[] args) {
        System.out.println("SERIE: 0.1, 0.2, 0.3, 0.4 ... 1.0");
        for(float i=0.1f; i<=1.0f; i = redondear1(i + 0.1f)) {
            System.out.print(i +" \t"); //---la variable \t es para espacios entre numeros en este caso
            
        }
        System.out.println("SERIE: 0.01, 0.02, 0.03, 0.04 ... 1.00");
        int c = 0;
        for(float i=0.1f; i<=1.0f; i = redondear1(i + 0.1f)) {
            System.out.print(i +" \t"); //---la variable \t es para espacios entre numeros en este caso
             c++;
            if(c == 10) {
               System.out.println();
               c = 0;
           } 
           
     }
        System.out.println();
        System.out.println("RECORRER CADENA: EN UN PUERTO ITALIANO");
                //0123456789123456789
        String texto = "EN UN PUERTO ITALIANO";
        int longitud = texto.length();//21 letras
        for(int i=0; i<longitud; i++) {
            System.out.print(texto.charAt(i) + "");
        }
        System.out.println("CANTIDAD DE VOCALES EN EL TEXTO");
        String patron = "[AEIOU]";
        /*
        int cvocal=0; //daclaro para que me contabillice las vocales
         for(int i=0; i<longitud; i++) {
             String letra = texto.charAt(i) + "";//no es lo mismo 'A' "A"
             if(letra.matches(patron)) { //
                 cvocal++;
        */
        if (String.valueOf(texto.charAt(i).matches(patron)) {
            cvocal++;
             }
         }
        System.out.println("Cantidad vocales: " + cvocal);
    }
    //public static float redondear(float numero) {
        //return (float)(Math.round(numero * 100.0) / 100.0);
    public static float redondear1(float numero) {
        return (float)(Math.round(numero * 100.0) / 100.0);
        }
    
    

