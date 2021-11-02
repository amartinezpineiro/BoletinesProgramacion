package Boletines.Boletin7.Boletin7_1;

import javax.swing.*;
import java.util.Scanner;

public class Positivo {
    public void positivo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea un número ");
        int num1 = sc.nextInt();
        if (num1 > 0) {
            System.out.println(num1+" es positivo");
        } else if (num1 < 0) {
            System.out.println(num1+" es negativo");
        } else {
            System.out.println(num1+" es 0");
        }
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("teclea un número"));
        if (num1 > 0) {
            JOptionPane.showMessageDialog(null, num1+" es positivo");
        } else if (num1 < 0) {
            JOptionPane.showMessageDialog(null, num1+" es negativo");
        } else {
            JOptionPane.showMessageDialog(null, num1+" es 0");
        }
    }
}
