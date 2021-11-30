package Boletines.Boletin15;

public class Pelicula extends Multimedia{
    private String actor;
    private String actriz;

    public String getActor() {
        return actor;
    }

    public String getActriz() {
        return actriz;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "actor='" + actor + '\'' +
                ", actriz='" + actriz + '\'' +
                '}';
    }
}
