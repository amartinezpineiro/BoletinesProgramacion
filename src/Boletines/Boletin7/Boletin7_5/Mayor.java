package Boletines.Boletin7.Boletin7_5;

import java.util.Scanner;

public class Mayor {

    public void mayor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero : ");
        double num1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero : ");
        double num2 = sc.nextDouble();
        if (num1 == num2) {
            System.out.println("El segundo numero intrucido no puede ser igual que el primero");
        }
        System.out.println("Introduce el tercer numero : ");
        double num3 = sc.nextDouble();
        if (num1 == num3 | num2 == num3) {
            System.out.println("El tercer numero intrucido no puede ser igual que ninguno de los anteriores");
        }
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " es el mayor");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " es el mayor");
        } else {
            System.out.println(num3 + " es el mayor");
        }
    }
}
