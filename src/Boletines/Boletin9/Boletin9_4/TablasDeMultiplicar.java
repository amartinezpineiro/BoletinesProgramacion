package Boletines.Boletin9.Boletin9_4;

import java.util.Scanner;

public class TablasDeMultiplicar {
    /*public void pedirNumero(){
        Scanner sc=new Scanner(System.in);
        System.out.println("introduce un numero para visualizar su tabla de multiplicar");
        int num=sc.nextInt();
        while(num!=0){
            System.out.println(num+" * 1 = "+(num)+"\n"+num+" * 2 = "+(num*2)+"\n"+num+" * 3 = "+(num*3)+"\n"+num+" * 4 = "+(num*4)+"\n"+num+" * 5 = "+(num*5)+"\n"+num+" * 6 = "+(num*6)+"\n"+num+" * 7 = "+(num*7)+"\n"+num+" * 8 = "+(num*8)+"\n"+num+" * 9 = "+(num*9));
            System.out.println("introduce un numero para visualizar su tabla de multiplicar");
            num=sc.nextInt();
        }
    }*/
    public void pedirNumero(){
        int num;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("introduce un numero para visualizar su tabla de multiplicar o introduce '0' para salir");
            num=sc.nextInt();
            if(num==0){
                break;
            }
            for (int i = 0; i < 10; i++) {
                System.out.println(num+" * "+i+" = "+(num*i));
            }
        }while(num!=0);
    }
}
