package Boletines.Boletin21.Boletin21_4;

import javax.swing.*;

public class Boletin21_4 {
    public static void main(String[] args) {
        char letra=Funciones.calcularLetra(Integer.parseInt(JOptionPane.showInputDialog("introduce el dni")));
        JOptionPane.showMessageDialog(null,"la letra es: "+letra);
    }
}
