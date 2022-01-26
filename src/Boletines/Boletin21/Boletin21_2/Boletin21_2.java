package Boletines.Boletin21.Boletin21_2;

public class Boletin21_2 {
    public static void main(String[] args) {
        Funciones.asignarNotas();
        int resultado=Funciones.comprobarNotas();
        System.out.println("aprobaron: "+resultado+"\nsuspendieron: "+(30-resultado));
        System.out.println("la nota más alta es: "+Funciones.mejorNota());
    }
}