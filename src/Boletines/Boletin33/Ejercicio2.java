package Boletines.Boletin33;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> intArray = new ArrayList<>();
        intArray.add(24);
        intArray.add(2);
        intArray.add(0);
        intArray.add(34);
        intArray.add(12);
        intArray.add(110);
        ClaseGenerica.borrar(intArray,24);
    }
}
