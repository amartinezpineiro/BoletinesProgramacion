package Boletines.Boletin7.Boletin7_4;

import java.util.Scanner;

public class Persona {
    //atributos
    private String nombre;
    private double peso;

    //constructores
    public Persona() {
    }

    public Persona(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    //métodos de acceso
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return this.peso;
    }

    //métodos
    public void comparar(Persona a, Persona b) {
        if (a.getPeso() > b.getPeso()) {
            System.out.println(a.getNombre() + " pesa más que " + b.getNombre());
        } else if (a.getPeso() == b.getPeso()) {
            System.out.println(a.getNombre() + " pesa lo mismo que " + b.getNombre());
        } else {
            System.out.println(a.getNombre() + " pesa menos que " + b.getNombre());
        }
    }

    public void pedirNombre() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre de la persona");
        setNombre(sc.nextLine());
    }

    public void pedirPeso() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el peso de la persona");
        setPeso(sc.nextDouble());
    }
}
