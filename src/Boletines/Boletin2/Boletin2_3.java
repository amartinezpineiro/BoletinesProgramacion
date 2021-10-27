package Boletines.Boletin2;

import java.util.Scanner;

public class Boletin2_3 {

    public static void main(String[] args) {
        float euros;
        float cambio;
        float dolares;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad en euros que quieras pasar a dolares: ");
        euros = sc.nextFloat();
        System.out.println("Introduce el la equivalencia de euros a dolares: ");
        cambio = sc.nextFloat();
        dolares = cambio * euros;
        System.out.println(euros + " euros son: " + dolares + " dolares.");

    }

}
