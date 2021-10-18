package Boletines.Boletin3;

import java.util.Scanner;

public class Boletin3_2 {

    public static void main(String[] args) {
        double centigrados;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la temperatua en grados centígrados: ");
        centigrados=sc.nextFloat();
        System.out.println(centigrados+" grados centígrados equivalen a: "+(centigrados+273)+" Kelvin y a "+(centigrados*1.8+32)+" Farenheit");

    }

}
