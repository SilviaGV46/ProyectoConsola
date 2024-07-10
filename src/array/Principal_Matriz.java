
package array;


public class Principal_Matriz {

    public static void main(String[] args) {
       
    }
    
    
    public static void tiposArray() {
        //VECTOR  (ARRAY UNIDIMENSIONAL)
        System.out.println("VECTOR (ARRAY INIDIMENSIONAL)");
        System.out.println("-----------------------------");
        int[] vector = {1,2,3};
        for(int i=0; i<vector.length; i++) {
            System.out.println(vector[i] + " ");
        }
        System.out.println("MATRIZ (ARRAY BIDIMENSIONAL)");
        System.out.println("----------------------------");
        int[] matriz = {1,2,3};
        for(int i=0; i<matriz.length; i++) {
            System.out.println(matriz[i] + " ");
        }  // 2*3 (fila*columna)
        System.out.println("CUBO (ARRAY TRIDIMENSIONAL)");
        System.out.println("---------------------------");
        int[] cubo = {1,2,3};
        for(int i=0; i<cubo.length; i++) {
            System.out.println(cubo[i] + " ");
        }
        
        
        
        //MATRIZ (ARRAY BIDIMENSIONAL)
        System.out.println("MATRIZ(ARRAY BIDIMENSIONAL)");
        int[] matriz = {
                        {1,2,3}
                        {4,5,6}
                       }; // 2*3 (fila*columna)
    }
        
        
        // CUBO  (ARRAY TRIDIMENSIONAL)
        System.out.println("CUBO(ARRAY TRIDIMENSIONAL)");
        int[][][] cubo = {
                            {
                                {1,2,3}
                                {4,5,6}
                            }
                            {
                                {7,8,9}
                                {10,11,12}

                            }
                          }; //2*3*2 (fila*columna*matriz)
          for(int i=0; i<cubo.length; i++) {  //primera fila (1,2,3,4,5,6)
            for(int j=0; j<cubo[0].length; j++) { // segunda fila (7,8,9,10)
                for (int k=0; k<cubo[0][0].length; k++){
                    for(int 1=0; 1<terceracto[0][0][0].lenght; 1++)
                System.out.print(cubo[i][j][k] + " ");
            }
            System.out.prinln();
        }
        System.out.println();
}
          System.out.println("TERCERACTO (ARRAY CUATRO DIMENSIONES)"); 
            int [][][][]terceracto = {
                 {
                    {
                        {1,2,3},
                        {4,5,6}
                    },
                    {
                        {7,8,9},
                        {10,11,12}
                    }

                 },
                    {
                        {1,2,3},
                        {4,5,6}
                    },
                    {
                        {7,8,9},
                        {10,11,12}
                    }

          }
}
    
