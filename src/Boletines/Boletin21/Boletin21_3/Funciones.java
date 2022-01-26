package Boletines.Boletin21.Boletin21_3;

import java.util.Random;

public class Funciones {
    private static int[] alumnos = new int[30];
    private static String[] nombres = new String[30];

    public static int pedirNumero() {
        Random numeroAleatorio = new Random();
        return 1 + numeroAleatorio.nextInt(11 - 1);
    }

    public static void asignarNotas() {
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = Funciones.pedirNumero();
        }
    }

    public static int comprobarNotas() {
        int aprobados = 0;
        for (int alumno : alumnos) {
            if (alumno >= 5) {
                aprobados++;
            }
        }
        return aprobados;
    }

    public static int mejorNota() {
        int notaMasAlta;
        for (int i = 0; i < alumnos.length - 1; i++) {
            if (alumnos[i] > alumnos[i + 1]) {
                int nota = alumnos[i];
                alumnos[i] = alumnos[i + 1];
                alumnos[i + 1] = nota;
            }
        }
        notaMasAlta = alumnos[alumnos.length - 1];
        return notaMasAlta;
    }

    public static void asignarAlumnos() {
        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = "Persona" + (i + 1);
        }
    }

    public static void verNotas(String nombre) {
        for (int i = 0; i < nombres.length; i++) {
            if (nombre.equals(nombres[i])) {
                System.out.println("La nota de " + nombre + " es: " + alumnos[i]);
                break;
            }
        }
    }

    public static void verAprobados() {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] >= 5) {
                System.out.println(nombres[i]);
            }
        }
    }

    public static void listaOrdenada() {
        for (int i = 0; i < alumnos.length - 1; i++) {
            for (int j = 0; j < alumnos.length - 1; j++) {
                if (alumnos[j] > alumnos[j + 1]) {
                    int nota = alumnos[j];
                    alumnos[j] = alumnos[j + 1];
                    alumnos[j + 1] = nota;
                    String nombre = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = nombre;
                }
            }
        }
        for (int alumno : alumnos) {
            System.out.println(alumno);
        }
    }
}
