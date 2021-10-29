package Boletines.Boletin6.Boletin6_1;

public class Boletin6_1 {
    public static void main(String[] args) {
        Coche speedCar = new Coche();
        System.out.println("La velocidad del primer coche es:" + speedCar.getSpeed());
        speedCar.accelerate(20);
        System.out.println("La velocidad del primer coche es:" + speedCar.getSpeed());
        speedCar.brake(10);
        System.out.println("La velocidad del primer coche es:" + speedCar.getSpeed());
    }
}
