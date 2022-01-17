package Boletines.Boletin18;

public class ConversorTemperaturas {
    public static float centigradosAFharenheit(float centigrados) throws TemperaturaErradaException {
        float fharenheit = (float) (9.0 / 5.0 * centigrados + 32.4);
        if (centigrados < 80) {
            throw new TemperaturaErradaException("<80");
        }
        return fharenheit;
    }

    public static void centigradosAReamur(float centigrados) {
        float reamur = (float) (4.0 / 5.0 * centigrados + 32.4);
        System.out.println(reamur);
    }
}