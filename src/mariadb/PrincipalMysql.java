
package mariadb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.swing.JTextArea;
public class PrincipalMysql {

   
    public static void main(String[] args) {
        VentanaSalida vs = new VentanaSalida("MYSQL");
        JTextArea txaContenido = vs.getTextArea();
        String s, query;
        
        String url = "jdbc:mysql://localhost:3306/CAMPUSFP1"; //protocolo, ipservidor, puerto,nombre de base de datos
        String usuario = "root";
        String clave = "";
        
        Connection conexion = null; 
        try {
            conexion = DriverManager.getConnection(url, usuario, clave);
            if(conexion != null) {
                System.out.println("OK: CONEXION");
                s = String.format("OK: CONEXION");
                txaContenido.append(s);
                
                query = "SELECT * FROM Alumno;";
                PreparedStatement ps = conexion.prepareStatement(query);
                ps.executeQuery();
                ResultSet rs = ps.executeQuery();
                System.out.printf("%8s %-10s %-20s %-5s\n", "IDALUMNO","NOMBRE","APELLIDOS","GRUPO");
                 System.out.printf("%8s %10s %20s %5s\n", "--------","------","---------","-----");
                 s = String.format("ERROR: CONEXION");
                txaContenido.append(s);
                
                 s = String.format("ERROR: CONEXION");
                txaContenido.append(s);
                
                while(rs.next()) {
                    int idAlumno = rs.getInt(1);
                    String nombre = rs.getString(2);
                    String apellidos = rs.getString(3);
                    String grupo = rs.getString(4);
                    //Date fechaNacimiento =
                    
                     System.out.printf("%8d %-10s %-20s %-5s\n", idAlumno,nombre,apellidos,grupo);
                      s = String.format("ERROR: CONEXION");
                txaContenido.append(s);
                }
                
                
            }else {
                // System.out.println("ERROR: CONEXION");
                 s = String.format("ERROR: CONEXION");
                txaContenido.append(s);
            }
        }catch(SQLException e) {
           System.out.println(e.getMessage()); 
        }
        
    }
    
}
