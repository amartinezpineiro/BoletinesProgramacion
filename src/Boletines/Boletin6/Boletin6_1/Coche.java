package Boletines.Boletin6.Boletin6_1;

public class Coche {
    //atributos
    private int velocidade;

    //constructores
    public Coche(){
        velocidade=0;
    }

    //métodos
    public int getVelocidade(){
        return velocidade;
    }
    public void acelerar(int a){
        velocidade=velocidade+a;
    }
    public void frenar(int b){
        velocidade=velocidade-b;
    }
}
