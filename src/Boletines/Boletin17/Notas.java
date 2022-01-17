package Boletines.Boletin17;

import javax.swing.*;

public class Notas {
    //atributos
    private double probaEscrita1=-1;
    private double probaEscrita2=-1;
    private double probaPractica=-1;
    private double boletines=-1;

    //constructores

    //metodos de acceso

    public double getProbaEscrita1() {
        return probaEscrita1;
    }

    public void setProbaEscrita1(double probaEscrita1) {
        this.probaEscrita1 = probaEscrita1;
    }

    public double getProbaEscrita2() {
        return probaEscrita2;
    }

    public void setProbaEscrita2(double probaEscrita2) {
        this.probaEscrita2 = probaEscrita2;
    }

    public double getProbaPractica() {
        return probaPractica;
    }

    public void setProbaPractica(double probaPractica) {
        this.probaPractica = probaPractica;
    }

    public double getBoletines() {
        return boletines;
    }

    public void setBoletines(double boletines) {
        this.boletines = boletines;
    }

    //metodos
    public void empezar() {
        int seguir;
        do {
            seguir = JOptionPane.showConfirmDialog(null, "¿Desexas calcular outra nota?", "Pregunta confirmación", JOptionPane.YES_NO_OPTION);
            if (seguir == 0) {
                JOptionPane.showMessageDialog(null, "Se calculara la nota");
            } else {
                JOptionPane.showMessageDialog(null, "Hasta la proxima");
            }
        } while (seguir == 0);
    }

    public void pedirNotas(String a) {
        do{
            JOptionPane.showInputDialog("Introduce la nota de "+a);

        }while(true);
    }
}
