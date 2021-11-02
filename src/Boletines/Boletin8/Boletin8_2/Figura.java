package Boletines.Boletin8.Boletin8_2;

import javax.swing.*;

public class Figura {
    //atributos
    private String tipo;
    private double base;
    private double altura;
    private double lado;
    private double radio;

    //constructores
    public Figura() {

    }

    //metodos de acceso
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return this.base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return this.lado;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }

    //métodos
    public void pedirFigura(Figura a){
        String[] figuras={
                "Cadrado",
                "Triangulo",
                "Circulo"
        };
        a.setTipo((String) JOptionPane.showInputDialog(null, "Selecciona el tipo de figura", "Figura", JOptionPane.DEFAULT_OPTION, null, figuras, figuras[0]));
        if(a.getTipo() == "Cadrado"){
            a.setLado(Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado")));
        }else if(a.getTipo() == "Triangulo"){
            a.setBase(Double.parseDouble(JOptionPane.showInputDialog("Introduce la base")));
            a.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Introduce la altura")));
        }else if(a.getTipo() == "Circulo"){
            a.setRadio(Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio")));
        }
    }

    public void calcularArea(Figura a) {
        JOptionPane jp = new JOptionPane();
        /*if (a.getTipo() == "Cadrado") {
            JOptionPane.showMessageDialog(null, "el area es: " + (Math.pow(a.getLado(),2)));
        }else if(a.getTipo() == "Triangulo"){
            JOptionPane.showMessageDialog(null, "el area es: " + (a.getBase()*a.getAltura()/2));
        }else if(a.getTipo() == "Circulo"){
            JOptionPane.showMessageDialog(null, "el area es: " + (Math.pow(a.getRadio(),2)*3.14159));
        }*/
        switch (a.getTipo()){
            case "Cadrado":JOptionPane.showMessageDialog(null, "el area es: " + (Math.pow(a.getLado(),2)));
            break;
            case "Triangulo":JOptionPane.showMessageDialog(null, "el area es: " + (a.getBase()*a.getAltura()/2));
            break;
            case "Ciruclo":JOptionPane.showMessageDialog(null, "el area es: " + (Math.pow(a.getRadio(),2)*3.14159));
            break;
        }
    }
}
