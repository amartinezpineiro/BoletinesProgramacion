package Boletines.Boletin14;

public class Publicacion {
    private String codigo;
    private String titulo;
    private long anoPublicacion;

    public Publicacion() {
    }

    public Publicacion(String codigo, String titulo, long anoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anoPublicacion = anoPublicacion;
    }

    public long getAno() {
        return anoPublicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Publicacion{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anoPublicacion=" + anoPublicacion +
                '}';
    }
}
