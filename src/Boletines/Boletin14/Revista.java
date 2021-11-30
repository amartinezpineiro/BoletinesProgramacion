package Boletines.Boletin14;

public class Revista extends Publicacion{
    private int numero;

    public Revista(String codigo, String titulo, long anoPublicacion, int numero) {
        super(codigo, titulo, anoPublicacion);
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "numero=" + numero +
                '}';
    }
}
