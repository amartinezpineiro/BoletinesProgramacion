package Boletines.Boletin5;

public class Boletin5_1 {

    public static void main(String[] args) {
        Consumo consumo1=new Consumo();
        consumo1.setLitros(50);
        consumo1.setGas(1.57);
        Consumo consumo2=new Consumo(1,1,1,1);
        consumo2.consumoMedio(100, 50);
        System.out.println("Consumo: "+consumo2.consumoMedio(100, 50)+" litros/100km");
        consumo2.setLitros(2);
        System.out.println("La velocidad media del objeto 2 es: "+consumo2.getMed()+"km/h");
    }
}

