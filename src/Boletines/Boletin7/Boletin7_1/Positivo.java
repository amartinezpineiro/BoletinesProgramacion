package Boletines.Boletin7.Boletin7_1;

import javax.swing.*;
import java.util.Scanner;

public class Positivo {
    public void positivo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea un número ");
        int num1 = sc.nextInt();
        if (num1 > 0) {
            System.out.println("es positivo");
        } else if (num1 < 0) {
            System.out.println("es negativo");
        } else {
            System.out.println("es 0");
        }
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("teclea un número"));
        if (num1 > 0) {
            JOptionPane.showMessageDialog(null, "es positivo");
        } else if (num1 < 0) {
            JOptionPane.showMessageDialog(null, "es negativo");
        } else {
            JOptionPane.showMessageDialog(null, "es 0");
        }
    }
}
