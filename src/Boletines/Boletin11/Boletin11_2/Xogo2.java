package Boletines.Boletin11.Boletin11_2;

import javax.swing.*;
import java.util.Random;

public class Xogo2 {
    public void adivinarNumero(){
        int num;
        int intentos;
        int solucion;
        int i=0;
        Random rm=new Random();
        solucion=1+rm.nextInt(50);
        JOptionPane.showMessageDialog(null,"se ha generado un número entre 1 y 50");
        intentos=Integer.parseInt(JOptionPane.showInputDialog("introduce el número de intentos"));
        do{
            num=Integer.parseInt(JOptionPane.showInputDialog(null,"intenta adivinar el número, tienes "+(intentos-i)+" intentos"));
            i++;
            if(solucion==num){
                JOptionPane.showMessageDialog(null,"Enhorabuena, acertaste en "+(i)+" intentos");
            }else if((Math.abs(solucion-num))>20){
                if(intentos-i==0){
                    JOptionPane.showMessageDialog(null,"No te quedan intentos");
                }else{JOptionPane.showMessageDialog(null,"La solucion esta 'moi lonxe' de tu numero, te quedan "+(intentos-i)+" intentos");}
            }else if((Math.abs(solucion-num)<=20&&(Math.abs(solucion-num)>=10))){
                if(intentos-i==0){
                    JOptionPane.showMessageDialog(null,"No te quedan intentos");
                }else{JOptionPane.showMessageDialog(null,"La solucion esta 'lonxe' de tu numero, te quedan "+(intentos-i)+" intentos");}
            }else if((Math.abs(solucion-num)<10&&(Math.abs(solucion-num)>5))){
                if(intentos-i==0){
                    JOptionPane.showMessageDialog(null,"No te quedan intentos");
                }else{JOptionPane.showMessageDialog(null,"La solucion esta 'preto' de tu numero, te quedan "+(intentos-i)+" intentos");}
            }else{
                if(intentos-i==0){
                    JOptionPane.showMessageDialog(null,"No te quedan intentos");
                }else{JOptionPane.showMessageDialog(null,"La solucion esta 'moi preto' de tu numero, te quedan "+(intentos-i)+" intentos");}
            }
        }while(num!=solucion&&i<intentos);
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
