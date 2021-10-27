package Boletines.Boletin7.Boletin7_4;

public class Boletin7_4 {
    public static void main(String[] args) {
        Persona obx1 = new Persona();
        obx1.pedirNombre();
        obx1.pedirPeso();
        Persona obx2 = new Persona();
        obx2.pedirNombre();
        obx2.pedirPeso();
        obx1.comparar(obx1, obx2);
    }
}
