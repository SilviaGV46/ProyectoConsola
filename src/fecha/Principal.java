
package fecha;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;


public class Principal {

    public static void main(String[] args) {
        //RECUPERAR LA FECHA ACTUAL DEL SISTEMA Y FORMATEARLA
        ejemplo6();

    }

    public static void ejemplo1() {
        LocalDate fechaActual = LocalDate.now();
        System.out.println(fechaActual);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormato = fechaActual.format(formato);
        System.out.println(fechaFormato);

    }
    //OBTENER EL DIA DE INICIO DEL MES

    public static void ejemplo2() {
        LocalDate fecha = LocalDate.of(1976, 7, 10);
        System.out.println(fecha.getDayOfWeek());
    }
    //OBTENER EL NUMERO DE DIAS DEL MES

    public static void ejemplo3() {
        LocalDate fecha = LocalDate.of(2024, 5, 1);
        System.out.println("Número dias del mes de mayo:" + fecha.lengthOfMonth());

    }
    //CREAR UNA TABLA CON LA CANTIDAD DE DIAS DE CADA MES

    public static void ejemplo4(int year) {
        //int [] meses = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println("AÑO: " + year);
        String[] meses = {"ENERO", "FEBREO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO",
            "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};

        System.out.printf("%-12s %4s %6s\n", "DESCRIPCION", "MES", "DIAS");
        System.out.printf("%-12S %4s %6s\n", "-----------", "---", "----");
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%-12S %4s %6s\n", meses[i - 1], i, obtenerNumeroDeDiasDeUnMes(i, year));
        }
    }

    //CREAR UNA TABLA CPN ÑA CANTIDAD DE DIAS DE CADA MES DONDE EL AÑO SEA ALEATORIO
    public static void ejemplo5() {
        int year = (int) (Math.random() * 125 + 1900); // [1900-2024]
        ejemplo4(year);
    }
    // EN BASE AL EJEMPLO 4 AGREGAR UNA COLUMNA QUE INDIQUE QUE DIA DE LA SEMANA EMPIEZA EL PRIMERO
    public static void ejemplo6(int year) {
/*
        String[] dias = {"LUNES", "MARTES","MIERCOLES","JUEVES","VIERNES","SABADO","DOMINGO"};
        System.out.printf("-----", "------","---------","------","-------","------","-------");
        for (int i = 0; i <dias.length; i++) {
             System.out.println(i + "\n" + dias[i]);
*/
        System.out.println("AÑO: " + year);
        String[] meses = {"ENERO", "FEBREO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO",
            "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};

        System.out.printf("%-12s %4s %6s\n", "DESCRIPCION", "MES", "DIAS");
        System.out.printf("%-12S %4s %6s\n", "-----------", "---", "----");

        for (int i = 1; i <= 12; i++) {
            System.out.printf("%-12S %4s %6s\n", meses[i - 1], i, obtenerNumeroDeDiasDeUnMes(i, year));
    
        }
    }

    public static int obtenerNumeroDeDiasDeUnMes(int numeroMes, int year) {
        // return 31; //FORMULA
        LocalDate fecha = LocalDate.of(year, numeroMes, 1);
        return fecha.lengthOfMonth();
    }

}
