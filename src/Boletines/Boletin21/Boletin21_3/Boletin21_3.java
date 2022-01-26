package Boletines.Boletin21.Boletin21_3;

import javax.swing.*;

public class Boletin21_3 {
    public static void main(String[] args) {
        Funciones.asignarNotas();
        int resultado=Funciones.comprobarNotas();
        System.out.println("aprobaron: "+resultado+"\nsuspendieron: "+(30-resultado));
        System.out.println("la nota más alta es: "+Funciones.mejorNota());
        Funciones.asignarAlumnos();
        Funciones.verNotas(JOptionPane.showInputDialog("introduce el alumno que deseas ver."));
        Funciones.verAprobados();
        Funciones.listaOrdenada();
        Funciones.verNotas(JOptionPane.showInputDialog("introduce el alumno que deseas ver."));
    }
}
