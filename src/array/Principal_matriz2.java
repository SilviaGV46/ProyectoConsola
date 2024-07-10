package array;

public class Principal_matriz2 {

    static int[][] matriz = {
        {1, 2, 3}, //(0,0)  (0,1)  (0,2)
        {4, 5, 6}, //(1,0)  (1,1)  (1,2)
        {7, 8, 9} //(2,0)  (2,1)  (2,2)
    };  //3*3  

    public static void main(String[] args) {
        ejemplo7();
    }

    // MOSTRAR LA DIAGONAL
    public static void ejemplo1() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }

    }

    // MOSTRAR LOS NUMEROS DEBAJO DE LA DIAGONAL
    public static void ejemplo2() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i >= j) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }

    // MOSTRAR LOS NUMEROS POR ENCIMA DE LA DIAGONAL
    public static void ejemplo3() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i < j) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }

    // MOSTRAR 
    public static void ejemplo4() {
        System.out.println("FORMA 1");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("FORMA 2");
        for (int j = 0; j < matriz.length; j++) {
            System.out.print(matriz[0][j] + " ");
        }
    }

    // CAMBIAR LOS ELEMENTOS DE LA MATRIZ LOS PARES POR 1 Y LOS IMPARES POR 0 Y MOSTRARLO PRITN
    public static void ejemplo5() {
        System.out.println("PARES");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] % 2 == 0) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    //MOSTRAR UNA MATRIZPOR COLUMNAS

    public static void ejemplo6() {
        System.out.println("RECORRER POR FILAS");
        for (int i = 0; i < 1; i++) {  //recorre las columnas
            for (int j = 0; j < matriz[0].length; j++) {  //recorre las filas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("RECORRER POR COLUMNAS");
        for (int i = 0; i < 1; i++) {  //recorre las columnas
            for (int j = 0; j < matriz[0].length; j++) {  //recorre las filas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // MOSTRAR LA SUMA DE CADA FILA Y CADA COLUMNA
    public static void ejemplo7(); {
        int sumaf = 0, sumac = 0; //hace de acumulador
        
        System.out.println("SUMAR POR FILAS");
        for (int i = 0; i < 1; i++) {
            sumaf = 0; 
            for (int j = 0; j < matriz[0].length; j++) {
                     System.out.print(matriz[i][j] + "  ");
                     sumaf = sumaf + matriz[i][j;]
            }
          }       
        System.out.println("SUMAR POR COLUMNAS");
        for (int i = 0; i < 1; i++) {
             sumac = 0; 
            for (int j = 0; j < matriz[0].length; j++) {
                     System.out.print(matriz[i][j] + "  ");
                     sumac = sumac + matriz[i][j;]
            }
            System.out.println("SUMA TOTAL: " + sumat);
        }
    }
    
      public static void ejemplo8(); {
        int sumaf, sumac, sumat = 0; //hace de acumulador
        int[] vectorf = {0,0,0};
        int[] vectorc = {0,0,0};
       // System.out.println("SUMAR POR FILAS");
        for (int i = 0; i < matriz.length; i++) { // fila
            sumaf = 0;  
                for (int j = 0; j < matriz[0]length; j++) {  //columna
                    sumaf = sumaf + matriz[i][j]; 
            }
            vectorf[i] = sumaf;        
          }       
                for (int j = 0; j < matriz[0]length; j++) {  //columna
                  sumac = 0;
                   for (int j = 0; j < matriz[0].length; j++) {
                       sumac = 0;
                       for (int i = 0; i < matriz.length; i++) {
                           sumac = sumac + matriz[i][j];
                           sumat = sumat + matriz[i][j];
                 }    
                    vectorc[j] = sumac;
            }
                   
                for (int i = 0; i < matriz.length; i++) {  //fila
                    for (int j = 0; j < matriz[0].length; j++) { //columna
                        System.out.printf("%4d",matriz[i][j]);
        }
            System.out.printf("%4d\n",vectorf[i]);
    }
                for(int i=0; i<vectorc.length; i++) {
                    System.out.printf("%4d\n",vectorf[i]);
                }
            System.out.printf("%4d\n", sumat);
}
}


}