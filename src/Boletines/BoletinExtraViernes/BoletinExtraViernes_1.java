package Boletines.BoletinExtraViernes;

import java.util.Scanner;

public class BoletinExtraViernes_1 {

    public static void main(String[] args) {
        double precio;
        final double IVE=0.21;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el nombre del producto: ");
        String nombre=sc.nextLine();
        System.out.println("Introduce el precio de un producto: ");
        precio=sc.nextDouble();
        System.out.println("El precio con IVE de "+nombre+" es de "+(precio+precio*IVE)+" euros.");
    }

}
