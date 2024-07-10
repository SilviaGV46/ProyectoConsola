package misrc;

public class Pruebas_de_bucles {//BLOQUE DE LA CLASE INICIA LA LLAVE

    public static void main(String[] args) {
{//INICIO 1
            System.out.println("WHILE");
            int i = 1;
            int n = 5;
            while (i <= n) {
                System.out.println(i);
                i++; //i = i + 1    i+=1    i++ CONTADOR    
            }
        }//FIN 1
        {//INICIO 2
            /*System.out.println("DO-WHILE");
            int i = 1;
            int n = 5;
            do {
                System.out.println(i);
                i++; //i = i + 1    i+=1    i++ CONTADOR    
            } while (i <= n);
            */
        }//FIN 2 
        {//INICIO 3
            System.out.println("FOR");
            int n = 5;
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
            }
        }//FIN 3
  
  
    }
}//BLOQUE DE CIERRE DE LA CLASE
