package Boletines.Boletin7.Boletin7_2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Suma {
    Scanner sc = new Scanner(System.in);

    public short pedirShort() {
        System.out.println("Teclea un número entero: ");
        short num = sc.nextShort();
        return num;
    }

    public void sumaResta() {
        short num1 = pedirShort();
        short num2 = pedirShort();
        if (num1 >= num2) {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        }
    }
}
