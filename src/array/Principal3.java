package array;

public class Principal3 {

    public static void main(String[] args) {
        String[] diasSemana = {"L","M","X","J"};
        String[] meses = {"ENERO","FEBRERO"};
        int[][] menero = {
            {1, 2, 3, 5},
            {4, 5, 6, 8},
            {7, 8, 9, 1}
        };
        int[][] mfebrero = {
                {7, 8, 9, 3},
                {4, 5, 8, 9},
                {1, 2, 3, 1},
        };
        
        int[][][] cubo = new int[2][3][4];//matriz,fila,columna
        
        cubo[0] = menero;
        cubo[1] = mfebrero;
        
        for(int i=0; i<cubo.length; i++) { //Matriz=2
            System.out.println("   " + meses[i]);
            System.out.printf("%4s %4s %4s %4s\n", diasSemana);
            for(int j=0; j<cubo[0].length; j++) {//Filas=3
                for(int k=0; k<cubo[0][0].length; k++) {//Columnas=4
                    System.out.printf("%4d ",cubo[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
/*
         i  j  k
         0  0  0    cubo[0][0][0]
               1    cubo[0][0][1]
               2    cubo[0][0][2]
               3    cubo[0][0][3]
            1  0
               1
               2
               3
            2  0
               1
               2
               3
         1

*/