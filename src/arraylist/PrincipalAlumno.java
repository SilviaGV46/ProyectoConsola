
package arraylist;

import arraylist.Alumno;
import arraylist.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class PrincipalAlumno {
    //Esta seria nuestra base de datos

    static List<Alumno> alumnos_al = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcion;
        
        List< String> asignaturas_al = new ArrayList<>();
        asignaturas_al.add("Fisica");
        asignaturas_al.add("Quimica");

        Alumno alumno = new Alumno("A1", "Luis", "Roncal", 15, asignaturas_al);

        alumnos_al.add(alumno);

        do {
            cls();
            System.out.println("MENU"); //crud = crear(create), leer(read), actualizar (update), eliminar (delete)
            System.out.println("----");
            System.out.println("(1) AÑADIR ALUMNO"); //crear
            System.out.println("(2BUSCAR ALUMNO POR SU ID) ");// leer
            System.out.println("(3) MOSTRAR LAS ASIGNATURAS DE UN ALUMNO DADO");
            System.out.println("(4) MOSTRAR TODOS LOS ALUMNOS QUE CURSAN UNA ASINATURA");
            System.out.println("(5) SALIR");

            System.out.println("INGRESAR OPCION?");
            opcion = sc.next();

            switch (opcion) {
                case "1":
                    cls();
                    opcion1();
                    pause();
                    break;
                case "2":
                    cls();
                    opcion2();
                    pause();
                    break;
                case "3":
                    cls();
                    opcion3();
                    pause();
                    break;
                case "4":
                    cls();
                    opcion4();
                    pause();
                    break;
                case "5":
                    cls();
                    sc.close();
                    System.exit(0);

            }

        } while (true);
    }

    public static void opcion1() {
        System.out.println("(1) AÑADIR ALUMNO");
        System.out.println("-----------------");
        Alumno alumno = new Alumno();
        alumno.entrada();
        if(!Util.existeIdAlumno(alumno.getIdAlumno(), alumnos_al)) {
           alumnos_al.add(alumno);
           System.out.println("OK: ALUMNO SE AÑADIO CORRECTEAMENTE");
        }else {
            System.out.println("ERROR: ALUMNO YA EXISTE " + alumno.getIdAlumno());
        }
        alumnos_al.add(alumno);
        System.out.println("ALUMNO SE AÑADIO CORRECTAMENTE");

    }

    public static void opcion2() {
        System.out.println("(2) BUSCAR ALUMNO");
        System.out.println("-----------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESAR IDALUMNO A BUSCAR (EJEMPLO A1)? ");
        String idAlumnoBuscar = sc.next();
        for(Alumno alumno: alumnos_al) {
            if(alumno.getIdAlumno().equals(idAlumnoBuscar)) {
                System.out.println(alumno); 
            }
        }
    }

    public static void opcion3() {
         System.out.println("(3)MOSTRAR LAS ASIGNATURAS DE UN ALUMNO DADO");
         System.out.println("--------------------------------------------");
         String idAlumno = Util.leerIdAlumno();
         for(Alumno a: alumnos_al) {
             if(a.getIdAlumno().equals(idAlumno)) {
                 System.out.println(a.getAsignaturas_al("NOMBRE     : " + a.getNombre()));
                 System.out.println(a.getAsignaturas_al("ASIGNATURAS: " + a.getAsignaturas_al()));
             }
            }
         } else {
             System.out.println("ERROR: ALUMNO NO EXISTE");
         }
        

    

    public static void opcion4() {
          System.out.println("(4) MOSTRAR TODOS LOS ALUMNOS QUE CURSAN UNA ASINATURA");
          System.out.println("------------------------------------------------------");
          System.out.println("Asignaturas Validas: Física|Química|Literatura|Matemáticas");
          String asignatura = Util.leerAsignatura();
          for(Alumno a: alumno_al) {
            List<String> alumnosaux_al = a.getAsignaturas_al();
            if(Util.existeAsignatura(asignatura,alumnosaux_al)) {
            System.out.println(a.getNombre());
}
          

    }

    public static void cls() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public static void pause() {
        try {
            System.out.print("\nPRESIONA UNA TECLA PARA CONTINUAR...");
            System.in.read();
        } catch (IOException e) {

        }
    }

}
}