package Boletines.Boletin21.Boletin21_1;

import java.util.Random;

public class Funciones {
    public static int pedirNumero() {
        Random numeroAleatorio = new Random();
        return 1 + numeroAleatorio.nextInt(51 - 1);
    }
}
