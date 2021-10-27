package Boletines.Boletin2;

import java.util.Scanner;

public class Boletin2_5 {

    public static void main(String[] args) {
        double millas;
        double metros;
        final double EQUIVALENCIA = 1852;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la distancia en millas marinas: ");
        millas = sc.nextFloat();
        System.out.println(millas + " millas marinas equivalen a: " + millas * EQUIVALENCIA + " metros");
    }

}
