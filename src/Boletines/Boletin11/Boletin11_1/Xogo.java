package Boletines.Boletin11.Boletin11_1;

import javax.swing.*;
import java.util.Scanner;

public class Xogo {
    public void adivinarNumero(){
        int num;
        int intentos;
        int solucion;
        int i=0;
        Scanner sc=new Scanner(System.in);
        do{
            solucion = Integer.parseInt(JOptionPane.showInputDialog("teclea un número de 1 a 50"));
        }while(solucion<1||solucion>50);
        intentos=Integer.parseInt(JOptionPane.showInputDialog("introduce el numero de intentos"));
        do{
            num=Integer.parseInt(JOptionPane.showInputDialog(null,"intenta adivinar el número, tienes "+(intentos-i)+" intentos"));
            i++;
            if(solucion==num){
                JOptionPane.showMessageDialog(null,"Enhorabuena, acertaste en "+(i)+" intentos");
            }else if(solucion>num){
                JOptionPane.showMessageDialog(null,"La solucion es mayor que tu numero, te quedan "+(intentos-i)+" intentos");
            }else{
                JOptionPane.showMessageDialog(null,"La solucion es menor que tu numero, te quedan "+(intentos-i)+" intentos");
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
