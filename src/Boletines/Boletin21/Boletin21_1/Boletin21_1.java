package Boletines.Boletin21.Boletin21_1;

public class Boletin21_1 {
    public static void main(String[] args) {
        int[] numeros = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Funciones.pedirNumero();
        }
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
