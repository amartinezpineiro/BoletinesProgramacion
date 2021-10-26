package Boletines.BoletinExtra2;

public class Conta {
    //atributos
    private String nome;
    private String numero;
    private double interes;
    private double saldo;

    //constructores
    public Conta(){
    }
    public Conta(String a, String b, double c, double d){
        nome=a;
        numero=b;
        interes=c;
        saldo=d;
    }

    //métodos de acceso
    public void setNome(String a){
        nome=a;
    }
    public String getNome(){
        return nome;
    }
    public void setNumero(String a){
        numero=a;
    }
    public String getNumero(){
        return numero;
    }
    public void setInteres(double b){
        interes=b;
    }
    public double getInteres(){
        return interes;
    }
    public void setSaldo(double c){
        saldo=c;
    }
    public double getSaldo(){
        return saldo;
    }

    //métodos
    public void ingreso(double a){
        if (a<0){
            System.out.println("El valor introducido debe ser mayor que 0");
        }
        else{
            saldo+=a;
        }
    }
    public void reintegro(double b){
        if (b<0){
            System.out.println("El valor introducido debe ser mayor que 0");
        }
        else{
            saldo-=b;
        }
    }
    public void transferencia(Conta origen, Conta destino, double c){
        if (c<0){
            System.out.println("El valor introducido debe ser mayor que 0");
        }
        else{
            origen.setSaldo(origen.getSaldo()-c);
            destino.setSaldo(destino.getSaldo()+c);
        }

    }

}
