package Boletines.Boletin4;

public class Boletin4_1 {

    public static void main(String[] args) {
        Libro lib1 = new Libro();
        lib1.amosar();
        Libro lib2 = new Libro("Rojo", "Pedro", 1000, (short) 100, (float) 1.0);
        lib2.amosar();
        lib1.setTitulo("Azul");
        lib1.setAutor("Pepe");
        lib1.setAno(1998);
        lib1.setNumPaginas((short) 176);
        lib1.setValoracion((float) 7.6);
        lib1.amosar();
    }
}
