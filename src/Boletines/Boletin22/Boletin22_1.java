package Boletines.Boletin22;

public class Boletin22_1 {
    public static void main(String[] args) {
        String[] equipos= {"Celta ","Bilbao","Malaga"};
        String[] xornadas= {"x1","x2","x3"};
        int[][] tabla=new int[3][3];
        Funciones.asignarValoresTabla(tabla);
        Funciones.verTabla(tabla,equipos,xornadas);
        //Funciones.ordenarTabla(tabla,equipos);
        //Funciones.verTabla(tabla,equipos,xornadas);
        Funciones.maximoGoleador(tabla,equipos,xornadas);
    }
}
