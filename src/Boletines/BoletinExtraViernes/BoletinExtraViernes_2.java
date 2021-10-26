package Boletines.BoletinExtraViernes;

import java.util.Scanner;

public class BoletinExtraViernes_2 {

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el valor de a: ");
        a=sc.nextDouble();
        System.out.println("Introduce el valor de b: ");
        b=sc.nextDouble();
        System.out.println("Introduce el valor de c: ");
        c=sc.nextDouble();
        if(b*b<4*a*c){
            //si b² es menor que 4*a*c se daria el caso de una raiz de un numero negativo
            System.out.println("La ecuación no tiene una solucion real.");

        }

        else if(a!=0&&b*b>=4*a*c){
            //si a es diferente de 0 y b² es mayor que 4*a*c se daria un caso de una ecuacion de segundo grado con dos posibles soluciones
            System.out.println("La primera solucion es "+(-b+Math.sqrt(b*b-4*a*c))/(2*a));

            System.out.println("La segunda solucion es "+(-b+(-Math.sqrt(b*b-4*a*c)))/(2*a));

        }

        else {
            //en el caso de que a sea igual a 0 la ecuacion no seria de segundo grado
            System.out.println("Esta ecuacion no es de segundo grado. Pero el resultado es: "+(-c/b));

        }



    }



}