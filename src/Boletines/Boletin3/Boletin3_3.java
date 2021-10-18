package Boletines.Boletin3;

import java.util.Scanner;

public class Boletin3_3 {

    public static void main(String[] args) {
        double b500,b200,b100,b50,b20,b10,b5,m2,m1,m05,m02,m01,m005,m002,m001;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la cantidad de billetes de 500 euros: ");
        b500=sc.nextInt();
        System.out.println("Introduce la cantidad de billetes de 200 euros: ");
        b200=sc.nextInt();
        System.out.println("Introduce la cantidad de billetes de 100 euros: ");
        b100=sc.nextInt();
        System.out.println("Introduce la cantidad de billetes de 50 euros: ");
        b50=sc.nextInt();
        System.out.println("Introduce la cantidad de billetes de 20 euros: ");
        b20=sc.nextInt();
        System.out.println("Introduce la cantidad de billetes de 10 euros: ");
        b10=sc.nextInt();
        System.out.println("Introduce la cantidad de billetes de 5 euros: ");
        b5=sc.nextInt();
        System.out.println("Introduce la cantidad de monedas de 2 euros: ");
        m2=sc.nextInt();
        System.out.println("Introduce la cantidad de monedas de 1 euros: ");
        m1=sc.nextInt();
        System.out.println("Introduce la cantidad de monedas de 50 céntimos: ");
        m05=sc.nextInt();
        System.out.println("Introduce la cantidad de monedas de 20 céntimos: ");
        m02=sc.nextInt();
        System.out.println("Introduce la cantidad de monedas de 10 céntimos: ");
        m01=sc.nextInt();
        System.out.println("Introduce la cantidad de monedas de 5 céntimos: ");
        m005=sc.nextInt();
        System.out.println("Introduce la cantidad de monedas de 2 céntimos: ");
        m002=sc.nextInt();
        System.out.println("Introduce la cantidad de monedas de 1 céntimos: ");
        m001=sc.nextInt();
        System.out.println("La cantidad total introducida es: "+(b500*500+b200*200+b100*100+b50*50+b20*20+b10*10+b5*5+m2*2+m1*1+m05*0.5+m02*0.2+m01*0.1+m005*0.05+m002*0.02+m001*0.01)+" euros");
    }

}