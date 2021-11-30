package Boletines.Boletin15;

public class Disco extends Multimedia{
    private String xenero;

    public String getXenero() {
        return xenero;
    }

    @Override
    public String toString() {
        return "Disco{" +
                "xenero='" + xenero + '\'' +
                '}';
    }
}
