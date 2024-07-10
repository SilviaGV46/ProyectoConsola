package misrc;

public class Principal6 {// INICIO BLOQUE DE CLASE
//ACUMULAR LOS NUMEROS DR UNA SERIA 1 2 3 4 5
    public static void main(String[] args) {//INICIO BLOQUE DE CODIGO
        int s = 0;   //siempre hay que iniciar con s=0 pues es un acumulador para ejecutar la tabla
        for(int i=1; i<=5; i=i+1) {
            if(i % 2 == 0) {
            s = s + i;
        }
 /*       System.out.println("Suma" + s);
        int x = 10;
        if(x >= 1 && x <= 100) {
            System.out.println("PERTENECE");
}else {
            System.out.println("NO PERTENECE");
        */    
        }
        
    }
}

            
    /*
        {//INICIO1
        System.out.println("WHILE");
        int i = 1;
        for (;true;) {
        
        //int n = 5; 
    
        //while (i <= n) {
            System.out.println(i);
            i++; //i = i + 1      i+=1    i++  significa contador ejeuta de uno en uno
            
            }
        }//FIN 1

       {//INICIO 1
            System.out.println("FOR");
            //long n = Long.MAX_VALUE; //CONSTANTE
            //int contador = 1;
            //for (long i=n; i>-n; i--) {
             for (long i = 1; i <= 100; i++) {
                 int dado = (int)(Math.random()*6 + 1);
                System.out.print(dado + " ");
                //if (contador == 5) {
                System.out.println();
                contador = 1;
                 }
                contador ++;
                }
              
         }
        }//FIN 1
       
        {//INICIO 2
        System.out.println("DO-WHILE");
        //int i = 1;
        
        int n = 5; 
        for (int i = 1; i <= n; i++) {//ERROR SEMANTICO(ERRORES LOGICOS)
        
        //do {  //while (i <= n) {
            System.out.println(i);
            i++; //i = i + 1      i+=1    i++  significa contador ejeuta de uno en uno
        //}while (i <= n); 
        
         } 
        }//FIN 2
        {//INICIO 3
     System.out.println("FOR");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            
        }   
        
   
        }  //fin 3
        /* TRADUCIR EL DIA DE LA SEMANA DE NUMERO A LETRA (6/6/24)
        1 Lunes
        2 Martes
        String dialetra = "";
        int dia = 1;
        switch (dia) {    // switch genera una variable de entrada
            case 1:
                dialetra = "Lunes";
                break;
            case 2:
                dialetra = "Martes";
                break;
            case 3:
                dialetra = "Miercoles";
                break;
            case 4:
                dialetra = "Jueves";
                break;
            case 5:
                dialetra = "Viernes";
                break;
            case 6:
                dialetra = "Sabado";
                break;
            case 7:
                dialetra = "Domingo";
                break;
            default:
                System.out.println("DIA NO VALIDO");
        }
        System.out.println(dia + " " + dialetra);
    }
        */
        /*
        int diames = 0;
        int anio = 2024;
        int mes = (int)(Math.random() * 12 + 1);//[1,2,3,4,5,6,7,8,9,10,11,12]
        switch (mes) {    // switch genera una variable de entrada
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                diames = 31;break;
                
            case 4:case 6:case 9:case 11: 
                diames = 30;break;
                
            case 2: 
                if ((anio % 4 == 0 && anio % 100 !=0) || (anio % 400 == 0)) {
                diames = 29;
            }else{
                diames = 28;
                
            }
            break;
            
        }

        System.out.println(mes + " = " + diames);
    }
        */
    // double dado = (Math.random() * 6 + 1);
    // System.out.println("Dado: " + dado);
    // int dado = (int)(Math.random() * 6 + 1)
    // System.out.println("Dado: " + dado);
    // if(dado % 2 == 0) {
    //     System.out.println("Par");
    // }else {   
    //     System.out.println("Impar");
    /*    
       int numero = -5; //0, 5, -5
        System.out.println("Número: " + numero);
        if(numero > 0) {
           System.out.println("Positivo");
            }else {   
           System.out.println("Negativo");
        
        int numero = 0; //0, 5, -5
        System.out.println("Número: " + numero);
        if (numero == 0) {
            System.out.println("Cero");
        } else {
            if (numero > 0) {
                System.out.println("Positivo");
            } else {
                System.out.println("Negativo");
     */
    
        
    


