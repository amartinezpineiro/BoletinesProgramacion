package Boletines.Boletin5;

import java.util.Scanner;

public class Boletin5_1 {

    public static void main(String[] args) {
        Consumo consumo1 = new Consumo();
        consumo1.setLitros(50);
        consumo1.setGas(1.57);
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los Kilómetros recorridos por el vehículo: ");
        double a = sc.nextDouble();
        System.out.println("Introduce los litros consumidos por el vehículo: ");
        double b = sc.nextDouble();
        System.out.println("Introduce la velocidad media del vehículo: ");
        double c = sc.nextDouble();
        System.out.println("Introduce precio de la gasolina: ");
        double d = sc.nextDouble();
        Consumo consumo2 = new Consumo(a, b, c, d);
        System.out.println("Consumo: " + consumo2.consumoMedio() + " litros/100km");
        consumo2.setLitros(2);
        System.out.println("La velocidad media del objeto 2 es: " + consumo2.getMed() + "km/h");
    }
}

