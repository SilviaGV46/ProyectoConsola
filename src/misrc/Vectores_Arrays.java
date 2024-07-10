
package misrc;


public class Vectores_Arrays { // abre1 

    
    public static void main(String[] args) { //abre2
       // LAS 5 NOTAS DE UN ALUMNO
       double n1 = 5.6;
       double n2 = 5.6;
       double n3 = 8.1;
       double n4 = 5.6;
       double n5 = 8.1;
       
             //0 1 2 3 4
       double[] nota = {5.6, 5.6, 8.1, 5.6, 8.1};
       System.out.println("Nota 1: " + nota[0]);
       try {  //expresion utilizada en todos los lenguajes. Recorrer un Array
       System.out.println("Nota 6:" + nota[5]);  // error semantico
       }catch(ArrayIndexOutOfBoundsException e) {
           System.out.println("INDICE 5 NO EXISTE");
           
       }
       double s = 0.0;
       for(int i=0; i<nota.length; i++) {
           if(i % 2 ==0) { //abre 3
           s = s + nota[i];
       }
       System.out.println("Promedio: " + s/nota.length);
       
       for(double n : nota) {  //esto es igual al foreach = for
           s = s + n;
       }
       System.out.println("Promedio:" + s/nota.length); 
       
       s = nota[0] + nota[1] + nota[3] + nota[4] + nota[5];
       System.out.println("Promedio:" + s/nota.length); 
       
    } //cierra 2
    
    
}
}// cierra 1

    public static void version2()  { //abre metodo1
        int c = 0;
        int[] conta = {0, 0, 0, 0, 0, 0,};  //vector contador para cada lado
        for(int i=0; i<=100; i++) {
           int dado = (int)(Math.random()*6 + 1);  
           System.out.print(dado + " ");
           if(c ==11) {   //contador que va a aparecer en cada fila 
               System.out.println();
               c = 0;
           }
          c++;
          switch(dado) {
           case 1: conta[0]++; break;
           case 2: conta[1]++; break;
           case 3: conta[2]++; break;
           case 4: conta[3]++; break;
           case 5: conta[4]++; break;
           case 6: conta[5]++; break;
         }
       }
       System.out.println("Lado 1: " + conta[0]);
       System.out.println("Lado 2: " + conta[1]);
       System.out.println("Lado 3: " + conta[2]);
       System.out.println("Lado 4: " + conta[3]);
       System.out.println("Lado 5: " + conta[4]);
       System.out.println("Lado 6: " + conta[5]);
    } //cierra metodo1
    


