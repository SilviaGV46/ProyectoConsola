
package Expresiones_regulares;


public class Principal3_vectores {

    
    public static void main(String[] args) {
        //COLECCIONES
        int[] enteros = {3, 2, 1, 4};
        //RECORRER VECTOR POR INDICE
        for(int i=0; i<enteros.length; i++) {//0 1 2 3
            System.out.println(i + "\t" + enteros[i]);
        }              
    
        Object[] datos = {"Marta,Luis",23,1.72,true,false,'M','H'};
         for(int i=0; i<enteros.length; i++) {
            System.out.println(i + "\t" + datos[i]);
        }
    }
    
}
