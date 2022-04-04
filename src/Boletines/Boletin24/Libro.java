package Boletines.Boletin24;

public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private int precio;
    private int nUnidades;

    public Libro(String titulo, String autor, String ISBN, int precio, int nUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
        this.nUnidades = nUnidades;
    }

    public int getnUnidades() {
        return nUnidades;
    }

    public void setnUnidades(int nUnidades) {
        this.nUnidades = nUnidades;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", precio=" + precio +
                ", nUnidades=" + nUnidades +
                '}';
    }
}
