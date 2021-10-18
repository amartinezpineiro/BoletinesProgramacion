package Boletines.BoletinExtra1;

import java.util.Scanner;

public class BoletinExtra1_2 {

    public static void main(String[] args) {
        double nparcial1;
        double nparcial2;
        double nfinal;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la nota del primer parcial: ");
        nparcial1=sc.nextDouble();
        System.out.println("Introduce la nota del segundo parcial: ");
        nparcial2=sc.nextDouble();
        nfinal=(nparcial1+nparcial2)/2;
        System.out.println("Programación\nNota primer parcial: "+nparcial1+"\nNota segundo parcial: "+nparcial2+"\nNota final da materia: "+nfinal);
    }

}