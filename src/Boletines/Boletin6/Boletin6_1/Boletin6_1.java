package Boletines.Boletin6.Boletin6_1;

public class Boletin6_1 {
    public static void main(String[] args) {
        Coche obx1=new Coche();
        System.out.println("La velocidad del primer coche es:"+obx1.getVelocidade());
        obx1.acelerar(20);
        System.out.println("La velocidad del primer coche es:"+obx1.getVelocidade());
        obx1.frenar(10);
        System.out.println("La velocidad del primer coche es:"+obx1.getVelocidade());
    }
}
