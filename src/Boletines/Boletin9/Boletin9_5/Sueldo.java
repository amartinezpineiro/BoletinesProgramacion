package Boletines.Boletin9.Boletin9_5;

import java.util.Scanner;

public class Sueldo {
    public void pedirSueldo(){
        double trabajadores=0;
        int salarioMedio=0;
        int salarioBajo=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce el salario del trabajador");
        double salario=sc.nextDouble();
        while(salario>1750){
            trabajadores++;
            System.out.println("introduce el salario del trabajador");
            salario=sc.nextDouble();
        }
        while(salario>=1000&&salario<=1750){
            salarioMedio++;
            trabajadores++;
            System.out.println("introduce el salario del trabajador");
            salario=sc.nextDouble();
        }
        while(salario<1000&&salario>0){
            trabajadores++;
            salarioBajo++;
            System.out.println("introduce el salario del trabajador");
            salario=sc.nextDouble();
        }
        if(salario==0){
            System.out.println("hay "+trabajadores+" de los cuales "+salarioMedio+" tienen un sueldo entre 1000/1750 y hay "+(salarioBajo/trabajadores*100)+"% de trabajadores con un salario menor a 1000");
        }
    }
}
