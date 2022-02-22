package Boletines.Boletin22;

import javax.swing.*;

public class Funciones {
    public static void asignarValoresTabla(int[][] tabla) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                tabla[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "introduce numero de goles"));
            }
        }
    }

    public static void verTabla(int[][] tabla, String[] equipos, String[] xornadas) {
        System.out.print("        ");
        for (String xornada : xornadas) {
            System.out.print(xornada + " ");
        }
        System.out.println();
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(equipos[i] + "  ");
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void ordenarTabla(int[][] tabla, String[] equipos) {
        int[] golesTotales = new int[3];
        int contador = 0;
        //Ordena en orden descendente la lista de goles totales de cada equipo
        for (int[] ints : tabla) {
            for (int anInt : ints) {
                contador++;
                if (contador <= 3) {
                    golesTotales[0] += anInt;
                } else if (contador <= 6) {
                    golesTotales[1] += anInt;
                } else {
                    golesTotales[2] += anInt;
                }
            }
        }
        //Ordena la tabla en orden descendente teniendo en cuenta el número total de goles de cada equipo.
        for (int k = 0; k < golesTotales.length - 1; k++) {
            for (int i = 0; i < golesTotales.length - 1; i++) {
                if (golesTotales[i] > golesTotales[i + 1]) {
                    int variable = golesTotales[i];
                    golesTotales[i] = golesTotales[i + 1];
                    golesTotales[i + 1] = variable;
                    String variable2 = equipos[i];
                    equipos[i] = equipos[i + 1];
                    equipos[i + 1] = variable2;
                    for (int j = 0; j < tabla.length; j++) {
                        int variable3 = tabla[i][j];
                        tabla[i][j] = tabla[i + 1][j];
                        tabla[i + 1][j] = variable3;
                    }
                }
            }
        }
        System.out.println("Equipos ordenados de forma descendente por numero de goles totales");
        System.out.println(equipos[0] + " : " + golesTotales[0] + " goles en total");
        System.out.println(equipos[1] + " : " + golesTotales[1] + " goles en total");
        System.out.println(equipos[2] + " : " + golesTotales[2] + " goles en total");
    }

    public static void maximoGoleador(int[][] tabla, String[] equipos, String[] xornadas) {
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length-1; j++) {
                if (tabla[i][j] > tabla[i][j+ 1]) {
                    int variable = tabla[i][j];
                    tabla[i][j] = tabla[i][j+ 1];
                    tabla[i][j+ 1] = variable;
                    //verTabla(tabla, equipos, xornadas);
                }
                //verTabla(tabla, equipos, xornadas);
            }
        }
        for (int i = 0; i < tabla.length-1; i++) {
            if(tabla[i][2]>tabla[i+1][2]){
                int variable = tabla[i+ 1][2];
                tabla[i+ 1][2] = tabla[i][2];
                tabla[i][2] = variable;
            }
        }
        verTabla(tabla, equipos, xornadas);
        int mayorNumeroDeGoles= tabla[2][2];
        ordenarTabla(tabla,equipos);
        verTabla(tabla, equipos, xornadas);
        System.out.println("El mayor numero de goles marcado es: "+mayorNumeroDeGoles);
    }
}
