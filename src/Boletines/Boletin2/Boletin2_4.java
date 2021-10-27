package Boletines.Boletin2;

import java.util.Scanner;

public class Boletin2_4 {

    public static void main(String[] args) {
        double num1;
        double num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        num1 = sc.nextFloat();
        System.out.println("Introduce el segundo número: ");
        num2 = sc.nextFloat();
        double suma = num1 + num2;
        double resta1 = num1 - num2;
        double resta2 = num2 - num1;
        double producto = num1 * num2;
        double cociente1 = num1 / num2;
        double cociente2 = num2 / num1;
        //System.out.println(" La suma es: "+suma+"\n La resta del primer número menos el segundos es: "+resta1+"\n La resta del segundo número menos el primero es: "+resta2+"\n El producto es: "+producto+"\n El cociente del primer número partido del segundos es: "+cociente1+"\n El cociente del segundo número partido por el segundo es: "+cociente2);
        System.out.println("Los resultados son: \n" + num1 + "+" + num2 + "=" + suma + "\n" + num1 + "-" + num2 + "=" + resta1 + "\n" + num2 + "-" + num1 + "=" + resta2 + "\n" + num1 + "*" + num2 + "=" + producto + "\n" + num1 + "/" + num2 + "=" + cociente1 + "\n" + num2 + "/" + num1 + "=" + cociente2);
    }

}