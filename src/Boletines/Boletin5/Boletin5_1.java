package Boletines.Boletin5;

public class Boletin5_1 {

    public static void main(String[] args) {
        Consumo consumo1=new Consumo();
        //pruebas:
//        coche1.setKms(100);
//        coche1.setLitros(50);
//        coche1.setMed(100);
//        coche1.setGas(1.57);
//        double tiempo=coche1.getTempo(100, 100);
//        System.out.println("tiempo:"+tiempo+" minutos");
//        double consumoLitros=coche1.consumoMedio(100, 100);
//        System.out.println("litros: "+consumoLitros+" litros/100km");
//        double precio=coche1.consumoEuros(1,1);
//        System.out.println("preico: "+precio+" euros/100km");
        consumo1.setLitros(50);
        consumo1.setGas(1.57);
        Consumo consumo2=new Consumo(1,1,1,1);
        consumo2.consumoMedio(100, 50);
        System.out.println("litros: "+consumo2.consumoMedio(100, 50)+" litros/100km");
        consumo2.setLitros(2);
        System.out.println("La velocidad media del objeto 2 es: "+consumo2.getMed()+"km/h");
    }
}

