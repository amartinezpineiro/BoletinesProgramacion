package Boletines.Boletin3;

import java.util.Scanner;

public class Boletin3_5 {

    public static void main(String[] args) {
        double sueldo;
        double km;
        double dietas;
        double ventas;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el sueldo fijo: ");
        sueldo=sc.nextDouble();
        System.out.println("Introduce el importe en ventas: ");
        ventas=sc.nextDouble();
        System.out.println("Introduce los km de desprazamento: ");
        km=sc.nextDouble();
        System.out.println("Introduce la cantidad de días que trabajas: ");
        dietas=sc.nextDouble();
        System.out.println("El sueldo bruto es: "+(sueldo+(ventas*0.05)+(km*2)+(dietas*30))+" euros\nEl sueldo líquido es: "+((sueldo+(ventas*0.05)+(km*2)+(dietas*30))*0.18-36)+" euros");
    }

}
