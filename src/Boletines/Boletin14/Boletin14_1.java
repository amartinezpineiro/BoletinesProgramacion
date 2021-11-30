package Boletines.Boletin14;

public class Boletin14_1 {
    public static void main(String[] args) {
        Publicacion pb=new Publicacion();
        Libro lb=new Libro("1234","Titulo",2021,"si");
        Revista rv=new Revista("4321","Hola",2020,2);
        System.out.println(pb);
        System.out.println(lb);
        System.out.println(rv);
    }
}
