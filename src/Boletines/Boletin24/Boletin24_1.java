package Boletines.Boletin24;

import java.util.ArrayList;
import java.util.Scanner;

public class Boletin24_1 {
    public static void main(String[] args) throws ListaNullException {
        ArrayList<Libro> listaLibros=new ArrayList<>();
        Scanner escaner=new Scanner(System.in);
        System.out.println("Menu: \n1.Engadir.\n2.Vender.\n3.Amosar." +
                "\n4.Dar baixa.\n5.Consultar.\n0.Cerrar");
        int opcion=escaner.nextInt();
        int bucle=0;
        while(bucle==0){
            switch (opcion) {
                case 1 -> Funciones.engadir(listaLibros);
                case 2 -> Funciones.vender(listaLibros, Funciones.pedirLibro());
                case 3 -> Funciones.amosar(listaLibros);
                case 4 -> Funciones.darBaixa(listaLibros);
                case 5 -> Funciones.consultar(listaLibros, Funciones.pedirLibro());
                default -> bucle++;
            }
        }

    }
}
