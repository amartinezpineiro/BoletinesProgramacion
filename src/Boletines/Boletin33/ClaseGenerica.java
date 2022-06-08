package Boletines.Boletin33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ClaseGenerica<T extends Collections> {
    T dato;

    // class constructor


    public ClaseGenerica() {
    }

    public ClaseGenerica(T dato) {
        this.dato = dato;
    }

    // get new object array(obj_array[i])
    public T getDato() {
        return dato;
    }

    // set e at new object array(obj_array[i])
    public void setDato(T dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return Arrays.toString(new Object[]{dato});
    }

    public static <T extends Comparable> void calcularMaximo(ArrayList<T> lista) {
        // T numMax = (T) Collection.max(lista);
        T maior = (T) lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (maior.compareTo(lista.get(i)) < 0)
                maior = lista.get(i);
        }
        System.out.println("0 maior é: " + maior);
    }

    public static <T extends Comparable> void calcularMinimo(ArrayList<T> lista) {
        T numMin = (T) Collections.min(lista);
        System.out.println("O menor é: " + numMin);
    }

    public static <T extends Comparable> void buscar(ArrayList<T> lista, T dato) {

        if (lista.indexOf(dato) != -1) {
            System.out.println("El elemento SÍ existe en la lista: " + lista.indexOf(dato));
        } else {
            System.out.println("El elemento no existe");
        }
    }
    public static <T extends Comparable> void borrar(ArrayList<T> lista, T dato) {
        if (lista.indexOf(dato) != -1) {
            lista.remove(dato);
            System.out.println("Elemento eliminado: "+ dato);
            System.out.println(lista);
        } else {
            System.out.println("El elemento no existe");
        }
    }
}
