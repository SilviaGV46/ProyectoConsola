
package mi_clase;


public class Principal_Escalas_nominas {

    
    public static void main(String[] args) {
        double[] vectorsueldo = {1500.50, 1200.30, 900.00, 2500.38,1800.80, 800.02, 1200.04, 2100.04, 1750.08};
        double nomina = 0;  // acumulador
    // proceso
        for(double sueldo: vectorsueldo) {
            nomina = nomina + sueldo;
            
        }
    // salida
    System.out.println("TOTAL NOMINA:" +nomina);
    }
    
}
