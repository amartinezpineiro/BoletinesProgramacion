package Boletines.Boletin9.Boletin9_3;

import java.util.Scanner;

public class Triangulo {
    /*public void pedirDatos(){
        Scanner pedirNumero=new Scanner(System.in);
        System.out.println("introduce la base del triangulo");
        double base=pedirNumero.nextDouble();
        while(base<=0){
            System.out.println("el valor introducido debe ser mayor que 0");
            System.out.println("introduce la base del triangulo");
            base=pedirNumero.nextDouble();
        }
        System.out.println("introduce la altura del triangulo");
        double altura=pedirNumero.nextDouble();
        while(altura<=0){
            System.out.println("el valor introducido debe ser mayor que 0");
            System.out.println("introduce la base del triangulo");
            altura=pedirNumero.nextDouble();
        }
        System.out.println("El area es: "+(base*altura/2));
    }*/
    public double pedirDato(String dato){
        double num;
        Scanner pedirNumero=new Scanner(System.in);
        do{
            System.out.println("introduce la "+dato+" del triangulo");
            num=pedirNumero.nextDouble();
            if(num<=0){
                System.out.println("el valor introducido debe ser mayor que 0");
            }
        }while(num<=0);
        return num;
    }
    public void pedirDatos(double base, double altura){
        System.out.println("El area es: "+(base*altura/2));
    }
}
