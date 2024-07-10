
package TRIANGULO;

public class Principal_triangulo1 {

    public static void main(String[] args) {
        //[10000] (int) (Math.random() * 10000 +1)          10001 - 1 = 10000
        TRIANGULO t1 = new TRIANGULO();
        t1.cabecera();// METODO DE CLASE 
        for(int i=0; i<1000; i++) { //0 999
           TRIANGULO t = new TRIANGULO((int)(Math.random() * 10000 +1),
                                       (int)(Math.random() * 10000 +1));
           
           t.cuerpo(i+1); //DECLARADO EN JAVA CLASS PARA EJECUTARLO AQUI 
       }
    }
    
}

/* 
N   BASE    ALTURA  AREA
-   ----    ------  ----
1   56      83      56*83

IGUAL SE PODIA HABER EMPLEADO ESTE OTRO METODO
int base = (int)(Math.random() * 10000 +1);
int altura = (int)(Math.random() * 10000 +1);
TRIANGULO t = new TRIANGULO(base, altura);

*/