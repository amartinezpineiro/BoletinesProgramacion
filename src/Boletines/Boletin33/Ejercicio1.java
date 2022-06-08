package Boletines.Boletin33;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        // creating an integer array
        ArrayList<Integer> intArray = new ArrayList<>();
        intArray.add(24);
        intArray.add(2);
        intArray.add(0);
        intArray.add(34);
        intArray.add(12);
        intArray.add(110);
        ClaseGenerica.calcularMaximo(intArray);
        ClaseGenerica.calcularMinimo(intArray);
        ClaseGenerica.buscar(intArray,4);

    }
}
