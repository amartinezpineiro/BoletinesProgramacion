package Boletines.Boletin11.Boletin11_2;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Xogo2 {
    public void adivinarNumero(){
        int num;
        int intentos;
        int solucion;
        int i=0;
        Scanner sc=new Scanner(System.in);
        Random rm=new Random();
        solucion=1+rm.nextInt(51-1);
        JOptionPane.showMessageDialog(null,"se ha generado un número entre 1 y 50");
        intentos=Integer.parseInt(JOptionPane.showInputDialog("introduce el número de intentos"));
        do{
            num=Integer.parseInt(JOptionPane.showInputDialog(null,"intenta adivinar el número, tienes "+(intentos-i)+" intentos"));
            i++;
            if(solucion==num){
                JOptionPane.showMessageDialog(null,"Enhorabuena, acertaste en "+(i)+" intentos");
            }else if((solucion-num)>20||(num-solucion)>20){
                JOptionPane.showMessageDialog(null,"La solucion esta 'moi lonxe' de tu numero, te quedan "+(intentos-i)+" intentos");
            }else if((solucion-num)<=20&&(solucion-num)>=10||(num-solucion)<=20&&(num-solucion)>=10){
                JOptionPane.showMessageDialog(null,"La solucion esta 'lonxe' de tu numero, te quedan "+(intentos-i)+" intentos");
            }else if((solucion-num)<10&&(solucion-num)>5||(num-solucion)<10&&(num-solucion)>5){
                JOptionPane.showMessageDialog(null,"La solucion esta 'preto' de tu numero, te quedan "+(intentos-i)+" intentos");
            }else{
                JOptionPane.showMessageDialog(null,"La solucion esta 'moi preto' de tu numero, te quedan "+(intentos-i)+" intentos");
            }
        }while(num!=solucion);
    }
    public void jugar(){
        String seguir;
        do{
            seguir=JOptionPane.showInputDialog("Para jugar pulsa 's' para salir pulsa 'n'");
            if(seguir.equals("s")){
                adivinarNumero();
            }else{break;}
        }while(seguir.equals("s"));
    }
}
