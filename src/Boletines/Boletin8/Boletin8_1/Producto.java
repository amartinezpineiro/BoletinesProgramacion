package Boletines.Boletin8.Boletin8_1;

import java.util.Scanner;

public class Producto {
    //atributos
    private String nome;
    private double ventas;

    //constructores
    public Producto() {
    }
    public Producto(String nome, double ventas) {
        this.nome = nome;
        this.ventas = ventas;
    }

    //métodos de acceso
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getVentas() {
        return this.ventas;
    }

    //métodos
    public void pedirArtigo(Producto a){

        if(a.getVentas()<=100){
            System.out.println("o artigo de consumo é baixo");
        }else if(a.getVentas()>100&&a.getVentas()<=500){
            System.out.println("o artigo de consumo é medio");
        }else if(a.getVentas()>500&&a.getVentas()<=1000){
            System.out.println("o artigo de consumo é alto");
        }else{
            System.out.println("o artigo de consumo é de primeria necesidade");
        }
    }
    public void pedirNome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del producto");
        setNome(sc.nextLine());
    }

    public void pedirVentas() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las ventas del producto");
        setVentas(sc.nextDouble());
    }
}
