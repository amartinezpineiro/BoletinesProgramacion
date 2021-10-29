package Boletines.Boletin7.Boletin7_5;

import java.util.Scanner;

public class Mayor {
    private double num1;
    private double num2;
    private double num3;

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum3(double num3) {
        this.num3 = num3;
    }

    public double getNum3() {
        return num3;
    }

    public void numeroMayor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero : ");
        this.num1 = sc.nextDouble();
        System.out.println("Introduce el segundo numero : ");
        this.num2 = sc.nextDouble();
        while (this.num1 == this.num2) {
            System.out.println("El segundo numero intrucido no puede ser igual que el primero");
            System.out.println("Introduce el segundo numero : ");
            setNum2(sc.nextDouble());
        }
        System.out.println("Introduce el tercer numero : ");
        this.num3 = sc.nextDouble();
        while (this.num1 == this.num3 | this.num2 == this.num3) {
            System.out.println("El tercer numero intrucido no puede ser igual que ninguno de los anteriores");
            System.out.println("Introduce el tercer numero : ");
            setNum3(sc.nextDouble());
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
