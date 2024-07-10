package fecha;

import java.time.DayOfWeek;
import java.time.LocalDate;
import javax.swing.JTextArea;

public class Principal2 {

    public static void main(String[] args) {

        String s;

        String[] dias = {"L", "M", "X", "J", "V", "S", "D"};
        String[] meses = {"ENERO", "FEBREO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO",
            "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};
        for (int mes = 1; mes <= 12; mes++) { //este seria para imprimir todoso los mese del año
            String titulo = meses[mes-1];
            VentanaSalida vs = new VentanaSalida(meses[mes-1]);
            JTextArea txaContenido = vs.getTextArea();
            
            int[][] matrizmes = new int[6][7];
            int diaSemana = obtenerDiaSemanaPrimerDiaMesNumero(mes, 2024);// esto me imprime solo de un mes 
            int numeroDias = obtenerNumeroDiaMes(mes, 2024);
            boolean bandera = false;
            int indice = 1;
            System.out.println("   " + meses[mes - 1]);
            System.out.printf("%4s %4s %4s %4s %4s %4s %4s\n", dias);

            //s = String.format("   " + meses[mes - 1] +"\n");
            //txaContenido.append(s);

            s = String.format("%4s %4s %4s %4s %4s %4s %4s\n", dias);
            txaContenido.append(s);

            for (int i = 0; i < matrizmes.length; i++) {
                for (int j = 0; j < matrizmes[0].length; j++) {
                    if (i == 0 && j == diaSemana) {
                        bandera = true;
                    }
                    if (bandera) {
                        matrizmes[i][j] = indice;
                        indice++;
                    }
                    if (indice > numeroDias) {
                        bandera = false;
                    }
                }
            }
            imprimirMatriz(matrizmes, txaContenido);
            System.out.println();
             s = String.format("\n");
            txaContenido.append(s);
        }
    }

    public static void imprimirMatriz(int[][] matriz, JTextArea txaContenido) {
      
        String s;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("%4d ", matriz[i][j]);
                if(matriz[i][j] != 0) {
                s = String.format("%4d ", matriz[i][j]);
                txaContenido.append(s);
                }else {
                    s = String.format("%4s ", " ");
                    txaContenido.append(s);
                    
                }

            }
            System.out.println();
            s = String.format("\n");
            txaContenido.append(s);
        }
    }

    public static int obtenerDiaSemanaPrimerDiaMesNumero(int numeroMes, int year) {
        LocalDate fecha = LocalDate.of(year, numeroMes, 1);
        DayOfWeek diaSemanaTexto = fecha.getDayOfWeek();
        int diaSemanaNumero = diaSemanaTexto.getValue();
        return diaSemanaNumero - 1;
    }

    public static int obtenerNumeroDiaMes(int numeroMes, int year) {
        LocalDate fecha = LocalDate.of(year, numeroMes, 1);
        return fecha.lengthOfMonth();
    }

}
