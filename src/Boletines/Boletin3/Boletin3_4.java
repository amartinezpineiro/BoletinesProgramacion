package Boletines.Boletin3;

import java.util.Scanner;

public class Boletin3_4 {

    public static void main(String[] args) {
        long dinero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cantidad de dinero: ");
        dinero = sc.nextLong();
        System.out.println(dinero + "euros pueden desglosarse en:\n- " + (dinero / 100) + " billetes de 100€\n- " + (dinero % 100 / 20) + " billetes de 20€\n- " + (dinero % 100 % 20 / 5) + " billetes de 5€\n- " + (dinero % 100 % 20 % 5) + " monedas de 1€");
    }

}