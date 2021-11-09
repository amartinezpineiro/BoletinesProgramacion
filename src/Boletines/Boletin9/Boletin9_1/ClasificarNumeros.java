package Boletines.Boletin9.Boletin9_1;

import java.util.Scanner;

public class ClasificarNumeros {
    public void pedirNumeros(){
        int i=0;
        int pos=0;
        int neg=0;
        int cer=0;
        while(i<10){
            Scanner pedirEntero=new Scanner(System.in);
            System.out.println("Introduce un número entero");
            int num=pedirEntero.nextInt();
            if (num>0){
                pos+=1;
            }else if(num==0){
                cer+=1;
            }else{neg+=1;}
            i++;
        }
        System.out.println("hay "+pos+" numeros positivos, "+neg+" numeros negativos y "+cer+" ceros");
    }
}
