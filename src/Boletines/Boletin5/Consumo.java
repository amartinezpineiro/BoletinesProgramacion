package Boletines.Boletin5;

public class Consumo {
    //atributos
    private double km;
    private double litros;
    private double vMed;
    private double pGas;
    //constructores
    public Consumo(){
    }
    public Consumo(double a, double b, double c, double d){
        km=a;
        litros=b;
        vMed=c;
        pGas=d;
    }
    //metodos de acceso
    public void setKms(double a){
        km=a;
    }
    public double getKms(){
        return km;
    }
    public void setLitros(double b){
        litros=b;
    }
    public double getLitros(){
        return litros;
    }
    public void setMed(double c){
        vMed=c;
    }
    public double getMed(){
        return vMed;
    }
    public void setGas(double d){
        pGas=d;
    }
    public double getGas(){
        return pGas;
    }

    //métodos
    public double getTempo(){
        return km/vMed*60;
    }
    public double consumoMedio(){
        return 100*litros/km;
    }
    public double consumoEuros(){
        return consumoMedio()*pGas;
    }
}
