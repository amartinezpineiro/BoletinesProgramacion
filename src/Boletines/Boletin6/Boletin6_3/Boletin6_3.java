package Boletines.Boletin6.Boletin6_3;

import java.util.Scanner;

public class Boletin6_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el radio de la circunferencia: ");
        double r=sc.nextDouble();
        Circulo cir1=new Circulo(r);
        System.out.println("El área de la circunferencia es:"+cir1.calcularArea()+"\nLa longitud de la circunferencia es: "+cir1.calcularLongitud());
    }
}
