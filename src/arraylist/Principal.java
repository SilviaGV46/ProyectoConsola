package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        ejemplo3();
    }

    public static void ejemplo1() {
        int[] vector = {1, 2, 3};

        List<Integer> numeros_al = new ArrayList<>(); //colencciones que se pueden añadir para no tener limites de numeros

        numeros_al.add(1);
        numeros_al.add(2);
        numeros_al.add(3);

        numeros_al.clear();

        for (int x : numeros_al) {
            System.out.println(x);
        }

    }

    public static void ejemplo2() {
        int[] v1 = {1, 2, 3};
        int[] v2 = {4, 5};
        int[] v3 = {6};

        List<int[]> vectores_al = new ArrayList<>();

        vectores_al.add(v1);
        vectores_al.add(v2);
        vectores_al.add(v3);

        for (int[] v : vectores_al) {
            for (int e : v) {
                System.out.println(e);
            }

        }
    
    }
       public static void ejemplo3(){
        String[] vector = {"luis", "miguel"};

        //recorrrer por indice
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
        //recorrer por elemento
        for (String elemento : vector) {
            System.out.println(elemento);
        }
    }

    public static void ejemplo4() {
        String[] vector = {"luis", "miguel"};
        List<String> nombres_al = new ArrayList<>(Arrays.asList(vector));

        //recorrrer por indice
        for (int i = 0; i < nombres_al.size(); i++);
        {
            System.out.println(nombres_al);
        }
        //recorrer por elemento
        for (String elemento : nombres_al) {
            System.out.println(elemento);
        }
    }
}
