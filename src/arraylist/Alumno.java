package arraylist;

import static arraylist.PrincipalAlumno.alumnos_al;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alumno {

    //varianbles de instancia o atributos
    private String idAlumno;
    private String nombre;
    private String apellido;
    private int edad;
    private List<String> asignaturas_al;

    //constructores
    public Alumno() {
        this.idAlumno = "";
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.asignaturas_al = null;
    }

    public Alumno(String idAlumno, String nombre, String apellido, int edad, List<String> asignaturas_al) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.asignaturas_al = asignaturas_al;
    }

    //metodos set y get
    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<String> getAsignaturas_al() {
        return asignaturas_al;
    }

    public void setAsignaturas_al(List<String> asignaturas_al) {
        this.asignaturas_al = asignaturas_al;
    }
    //metodo toString

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", asignaturas_al=" + asignaturas_al + '}';
    }
    public static String cabecera() {
        String c = String.format("  %-2s %-6s %-8s\n", "ASIGNATURAS\n", "NOMBRE\n", "APELLIDO\n");
        return c;
        
    }
    public static String Subrrayadocabecera() {
        String c = String.format("  %-2s %-6s %-8s\n", "-------------", "--------", "----------");
        return c;
    }
    public String cuerpo() {
        String c = String.format("  %-2s %-6s %-8s\n", idAlumno, nombre, apellido);
        return c;
    }
    
    //otros metodos

    public void entrada() {
        Scanner sc = new Scanner(System.in);
        List<String> aux_al = new ArrayList<>();

        System.out.print("INGRESAR IDALUMNO? ");
        idAlumno = sc.next();
        if (!Util.existeIdAlumno(idAlumno, alumnos_al)) {
            
            System.out.print("INGRESAR NOMBRE? ");
            nombre = sc.next();
            System.out.print("INGRESAR APELLIDO? ");
            apellido = sc.next();
            edad = Util.leerEdad(); //agregamos el metodo creado en la otra clase Util y comentamos el de abajo
            
            /*
            System.out.print("INGRESAR EDAD? ");
            edad = sc.nextInt();
            */

            System.out.print("CUANTAS ASIGNATURAS DESEA INGRESAR? ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                System.out.print("INGRESAR ASIGNATURA? ");
                aux_al.add(sc.next());
            }
            asignaturas_al = aux_al;
            
            Alumno alumno = new Alumno(idAlumno,nombre,apellido,edad,asignaturas_al);
            alumnos_al.add(alumno);
            System.out.println("OK: ALUMNO SE AÑADIO CORRECTAMENTE");
            
        } else {
            System.out.println("ERROR: ALUMNO YA EXISTE ");
        }

    }

}
