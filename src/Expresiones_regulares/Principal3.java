package Expresiones_regulares;

import java.util.Scanner;

public class Principal3 {

    //Implementamos un Scanner global para todos los metodos que implantemos
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ejemplo11();

    }

    // VALIDAR UN NUMERO ENTERO
    public static void ejemplo1() {
        String cadena = "";
        String patron = "[0-9]+"; //       "\\d+"  2, "[0-9]+"
        boolean correcto;
        do {

            System.out.print("Ingrese una cadena?");
            cadena = sc.next();
            correcto = cadena.matches(patron);
            if (!correcto) {
                System.out.println("NO ES UN NUMERO ENTERO VUELVA A INGRESAR");
            }

        } while (correcto);
    }
    // VALIDAR UNA CADENA QUE NO TENGA NINGUN DIGITO

    public static void ejemplo2() {
        String cadena = "";
        String patron = "[\\D+]+"; //    "\\D+"   2.  "[0-9]"
        boolean correcto;
        do {

            System.out.print("Ingrese una cadena?");
            cadena = sc.next();
            correcto = cadena.matches(patron);
            if (!correcto) {
                System.out.println("TINEN UN DIGITO VUELVA A INGRESAR");
            }

        } while (correcto);
    }
    // VALIDAR UNA CADENA QU NO TENGA ESPACIOS EN BLANCO

    public static void ejemplo3() {
        String cadena = "";
        String patron = "[\\S+]+"; //    "\\D+"   2.  "[0-9]"
        boolean correcto;
        do {

            System.out.print("Ingrese una cadena?");
            cadena = sc.nextLine();
            correcto = cadena.matches(patron);
            if (!correcto) {
                System.out.println("TIENE ESPACIOS EN BLANCO VUELVA A INGRESAR");
            }

        } while (correcto);
    }
    // ELIMINAR MUCHOS ESPACIOS EN BLANCO REEMPLAZARLOS CON UN SOLO ESPACIO "EL PATRON IDENTIFICA LOS ESPACIOS"

    public static void ejemplo4() {
        String cadena = "";
        String patron = "\\s+"; //De uno a mas espacios en blanco    "\\D+"   2.  "[0-9]"
        String cadenaSinEspacios;

        System.out.print("Ingrese una cadena?");
        cadena = sc.nextLine();  // Silvia   Elena   Laura
        cadenaSinEspacios = cadena.replaceAll(patron, " ");
        System.out.println(cadena);
        System.out.println(cadenaSinEspacios);
        // ELIMINAR NUMEROS(REMPLAZARLOS POR ALGO)
    }

    public static void ejemplo5() {
        String cadena = "";
        String patron = "\\d+"; //De uno a mas digitos   "\\D+"   2.  "[0-9]"
        String cadenaLimpia;
        cadena = "Silvia  tiene 46 años y elena 19 y sus telefonos 618541432 y 614529445";
        cadenaLimpia = cadena.replaceAll(patron, "XXXX ");
        System.out.println(cadena);
        System.out.println(cadenaLimpia);

    }

    // VALIDAR LOS NOMBRES SIN ESPACIOS Y LOS IDENTIFICA POR SEPARADO CON SUS ESPACIOS CORRESPONDIENTES
    public static void ejemplo6() {
        Scanner scan = new Scanner(System.in);
        String cadena = "";
        String patron = "(?<!^)(?=[A-Z])";  //todos los digitos juntos y te los separa cuando encuentra una mayuscula entre medias
        String cadenaConEspacios;

        System.out.print("Ingrese una cadena: ");
        cadena = scan.nextLine();  // Ejemplo: MihaiIoniMatei
        cadenaConEspacios = cadena.replaceAll(patron, " ");
        System.out.println("Cadena original: " + cadena);
        System.out.println("Resultado: " + cadenaConEspacios);
    }
    //EXPRESION REGULAR QUE COINCIDA CON CADENAS QEU INCION EN !AB! Y CONTINUAR   

    public static void ejemplo7() {
        String cadena = "";
        String patron = "ab.*"; //   EMPEZA CON A Y FINALIZA EN B Y ENTRE AMBAS PUEDE COLOCAR LO QUE SEA  CON EL + 
        boolean correcto;
        do {

            System.out.print("Ingrese una cadena?");
            cadena = sc.nextLine();
            correcto = cadena.matches(patron);
            if (!correcto) {
                System.out.println("NO CUMPLE CON EL PATRON VUELVA A INGRESAR");
            }

        } while (!correcto);

    }

    // BUSCAR UNA PALABRA EN UN TEXTO
    public static void ejemplo8() {
        String texto = "";
        String textocorrecto = "";
        boolean correcto;
        String patron = ".*ERROR.*"; //   EMPEZA CON A Y FINALIZA EN B Y ENTRE AMBAS PUEDE COLOCAR LO QUE SEA  CON EL +
        String patron1 = "ERROR";
        texto = "En un puerto ERROR italiano al pie de la monERRORtaña";
        correcto = texto.matches(patron);
        if(correcto) {
            textocorrecto = texto.replaceAll(patron1, "");
        }
        System.out.println(correcto);
        System.out.println(texto);    
        System.out.println(textocorrecto);
        
      }

    // VALIDAR UN AÑO 1916  1917  1918  2000 2001  2002 
    public static void ejemplo9() {
        String cadena = "";
        String patron = "(191[6-8]|200[0123]).*"; //   
        boolean correcto;
        do {

            System.out.print("Ingrese una cadena?");
            cadena = sc.next();
            correcto = cadena.matches(patron);
            if (!correcto) 
                System.out.println("NO CUMPLE CON EL PATRON VUELVA A INGRESAR"); 

        } while (!correcto);
    }
        
          // HACER UN PROGRAMA QUE GENERE UN PASSWORD ALEATORIO DE 8 CARACTERES
          //. DEBE INCLUIR SOLAMENTE LOS SIGUIENTES CARACTERES: "A-Z 0-9? = # & %
          //77 ADEMAS EL PROGRAMA DEBE VALIDAR SI SOLAMENTE TIENE LETRAS 
          //SERA CONSIDERADO INCORRECTO EL PASSWORD
    public static void ejemplo10() {
        String simbolos = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789?=#&%";
        int longitud = simbolos.length(); //nos da el ultimo indice valido
        char[] password = {' ',' ',' ',' ',' ',' ',' ',' '};
        String clave = "";
        String patron = "[A-ZÑ]{8}";
        for(int i=0; i<8; i++) {
            int na = (int)(Math.random()*longitud); //na= numero aleatorio [0,3]
            char letra = simbolos.charAt(na);
           // String letra = simbolos.charAt(na) + ""; // lo concatenamos con una cadena vacia tambien se puede hacer cadena con String.valueof(simbolos.charAt(na)
            System.out.print(letra + " ");
            password[i] = letra;
            clave = String.valueOf(password);
        }
        if (clave.matches(patron)) {
            System.out.println(clave + " CLAVE INCORRECTA");
        }else {
            System.out.println(clave + " CLAVE CORRECTA");
        } 
    }
        // GENERAR UNA CONTRASEÑA VERIFICANDO UN PATRON
     public static void ejemplo11() {
        String simbolos = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ0123456789?=#&%";
        int longitud = simbolos.length(); //nos da el ultimo indice valido
        char[] password = {' ',' ',' ',' ',' ',' ',' ',' '};
        String clave = "";
        String patron = "[A-ZÑ]{8}";
        do {
        for(int i=0; i<8; i++) {
            int na = (int)(Math.random()*longitud); //na= numero aleatorio [0,3]
            char letra = simbolos.charAt(na);
           // String letra = simbolos.charAt(na) + ""; // lo concatenamos con una cadena vacia tambien se puede hacer cadena con String.valueof(simbolos.charAt(na)
            System.out.print(letra + " ");
            password[i] = letra;
            clave = String.valueOf(password);
            }
        }while(clave.matches(patron)); // Verdadero se repite
        System.out.println(clave);
        
        if (clave.matches(patron)) {
            System.out.println(clave + " CLAVE INCORRECTA");
        }else {
            System.out.println(clave + " CLAVE CORRECTA");
        }  
    }
}

