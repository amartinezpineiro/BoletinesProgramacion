package Boletines.Boletin9.Boletin9_5;

import java.util.Scanner;

public class Sueldo {
    /*public void pedirSueldo(){
        int trabajadores=0;
        int salarioMedio=0;
        float salarioBajo=0;
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
            System.out.printf("hay %d de los cuales %d tienen un sueldo entre 1000/1750 y hay %.2f %% de trabajadores con un salario menor a 1000",trabajadores,salarioMedio,(salarioBajo/trabajadores*100));
        }

    }*/
    public void pedirSueldo(){
        int trabajadores=0;
        int salarioMedio=0;
        float salarioBajo=0;
        double salario;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("introduce el salario del trabajador");
            salario=sc.nextDouble();
            if(salario>1750){
                trabajadores++;
            }else if(salario>=1000&&salario<=1750){
                salarioMedio++;
                trabajadores++;
            }else if(salario<1000&&salario>0){
                trabajadores++;
                salarioBajo++;
            }else if(salario==0){
                System.out.printf("hay %d trabajadores de los cuales %d tienen un sueldo entre 1000/1750 y hay %.2f %% de trabajadores con un salario menor a 1000",trabajadores,salarioMedio,(salarioBajo/trabajadores*100));
            }
        }while(salario!=0);

    }
}
