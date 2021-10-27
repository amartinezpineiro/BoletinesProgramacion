package Boletines.Boletin7.Boletin7_3;

import java.util.Scanner;

public class Signo {
    public void getSigno() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea un número ");
        int num1 = sc.nextInt();
        if (num1 > 0) {
            System.out.println("+");
        } else if (num1 < 0) {
            System.out.println("-");
        } else {
            System.out.println("0");
        }
    }

}
