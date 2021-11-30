package Boletines.Boletin14;

public class Libro extends Publicacion{
    private String prestado;

    public Libro(String codigo, String titulo, long anoPublicacion, String prestado) {
        super(codigo, titulo, anoPublicacion);
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "prestado='" + prestado + '\'' +
                '}';
    }
}
