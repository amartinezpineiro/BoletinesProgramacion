package Boletines.Boletin21.Boletin21_2;

import java.util.Random;

public class Funciones {
    private static int[] alumnos=new int[30];

    public static int pedirNumero(){
        Random numeroAleatorio = new Random();
        return 1 + numeroAleatorio.nextInt(11 - 1);
    }
    public static void asignarNotas(){
        for(int i = 0; i<alumnos.length; i++){
            alumnos[i]= Funciones.pedirNumero();
        }
    }
    public static int comprobarNotas(){
        int aprobados=0;
        for (int alumno : alumnos) {
            if (alumno >= 5) {
                aprobados++;
            }
        }
        return aprobados;
    }
    public static int mejorNota(){
        int notaMasAlta;
        for(int i= 0;i<alumnos.length-1;i++){
            if(alumnos[i]>alumnos[i+1]){
                int nota=alumnos[i];
                alumnos[i]=alumnos[i+1];
                alumnos[i+1]=nota;
            }
        }
        notaMasAlta=alumnos[alumnos.length-1];
        return  notaMasAlta;
    }
}
