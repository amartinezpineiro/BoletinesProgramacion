package Boletines.Boletin21.Boletin21_4;

public class Funciones {
    private static char[] letra = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public static char calcularLetra(int dni) {
        int resto = dni % 23;
        return letra[resto];
    }

}
