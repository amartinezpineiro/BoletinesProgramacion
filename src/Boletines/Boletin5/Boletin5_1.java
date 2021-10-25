package Boletines.Boletin5;

import java.util.Scanner;

public class Boletin5_1 {

    public static void main(String[] args) {
        Consumo consumo1=new Consumo();
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce los Kilómetros recorridos por el vehículo: ");
        double km=sc.nextDouble();
        System.out.println("Introduce los litros consumidos por el vehículo: ");
        double litros=sc.nextDouble();
        System.out.println("Introduce la velocidad media del vehículo: ");
        double vMed=sc.nextDouble();
        System.out.println("Introduce precio de la gasolina: ");
        double pGas=sc.nextDouble();
        consumo1.setLitros(50);
        consumo1.setGas(1.57);
        Consumo consumo2=new Consumo(1,1,1,1);
        System.out.println("Consumo: "+consumo2.consumoMedio()+" litros/100km");
        consumo2.setLitros(2);
        System.out.println("La velocidad media del objeto 2 es: "+consumo2.getMed()+"km/h");
    }
}

