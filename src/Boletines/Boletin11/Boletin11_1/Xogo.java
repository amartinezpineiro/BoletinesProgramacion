package Boletines.Boletin11.Boletin11_1;

import javax.swing.*;
import java.util.Scanner;

public class Xogo {
    public int pedirNumero(){
        Scanner numero=new Scanner(System.in);
        JOptionPane.showInputDialog(null, "Introduce un número entre 1 y 50");
        int num=numero.nextInt();
        while(num<1||num>50) {
            JOptionPane.showInputDialog(null, "El valor introducido no es correcto, Introduce un número entre 1 y 50");
            num = numero.nextInt();
        }
        return num;
    }
    public void adivinarNumero(){
        int num=pedirNumero();
        Scanner resultado=new Scanner(System.in);
        int solucion;
        for (int i = 0; i < 5; i++) {
            do{
                JOptionPane.showInputDialog(null,"Introduce un número entre 1 y 50, tienes "+(5-i)+" intentos");
                solucion=resultado.nextInt();
                if(solucion>num){
                    JOptionPane.showMessageDialog(null, "el resultado es menor, te quedan "+(5-i)+" intentos");
                } else if(solucion<num){
                    JOptionPane.showMessageDialog(null, "el resultado es menor, te quedan "+(5-i)+" intentos");
                } else{
                    JOptionPane.showMessageDialog(null, "has acertado en "+(i+1)+"intentos, enorabuena");
                }
            }while(solucion!=num);
        }
    }
}
