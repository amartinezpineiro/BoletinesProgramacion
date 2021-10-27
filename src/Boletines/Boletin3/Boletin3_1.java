package Boletines.Boletin3;

import java.util.Scanner;

public class Boletin3_1 {

    public static void main(String[] args) {
        double precioI;
        double descuento;
        double precioF;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el precio inicial: ");
        precioF = sc.nextDouble();
        System.out.println("Introduce el precio que pagaste: ");
        precioI = sc.nextDouble();
        descuento = (precioI * 100) / precioF;
        System.out.println("El descuento de tu compra fue del: " + descuento + "%");
    }

}
