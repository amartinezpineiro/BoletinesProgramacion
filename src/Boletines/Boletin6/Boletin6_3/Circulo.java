package Boletines.Boletin6.Boletin6_3;

public class Circulo {
    //atributos
    private double radio;
    private final double PI=3.14;

    //constructores
    public Circulo(){
    }

    public Circulo(double r){
        radio=r;
    }

    //métodos de acceso
    public void setRadio(double r){
        radio=r;
    }
    public double getRadio(){
        return radio;
    }

    //métodos
    public double calcularArea(){
        return Math.pow(radio, 2);
    }
    public double calcularLongitud(){
        return 2*PI*radio;
    }
}
