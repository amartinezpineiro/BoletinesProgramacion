package Boletines.Boletin18;

import javax.swing.*;

public class Boletin18_1 {
    public static void main(String[] args) {
        float temperatura=Float.parseFloat(JOptionPane.showInputDialog(null,"centigrados"));
        try{
            ConversorTemperaturas.centigradosAFharenheit(temperatura);
        }catch (TemperaturaErradaException e) {
            e.printStackTrace();
        }
        ConversorTemperaturas.centigradosAReamur(temperatura);
    }
}
