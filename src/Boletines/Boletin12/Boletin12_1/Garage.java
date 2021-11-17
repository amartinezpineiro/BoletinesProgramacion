package Boletines.Boletin12.Boletin12_1;

import javax.swing.*;

public class Garage {
    //atributos
    private int numeroCoches=0;
    private String matricula;
    //constructores

    //metodos de acceso
    public void setMatricula(String matricula){
        this.matricula=matricula;
    }
    public String getMatricula(){
        return this.matricula;
    }
    public void setNumeroCoches(int numeroCoches){
        this.numeroCoches=numeroCoches;
    }
    public int getNumeroCoches(){
        return this.numeroCoches;
    }
    //metodos
    public void empezar(){
        int seguir;
        do{
            seguir=JOptionPane.showConfirmDialog(null,"Bienvenido a nuestro garage, desea aparcar?","Garage",JOptionPane.YES_NO_OPTION);
            if(seguir==0){
                registrar();
                setNumeroCoches(getNumeroCoches()+1);
            }else{JOptionPane.showMessageDialog(null,"Hasta la proxima");}
        }while(seguir==0);
    }
    public void registrar(){
        double tiempo;
        double precio;
        double pago;
        double cambio;
        if(getNumeroCoches()>=5){
            JOptionPane.showMessageDialog(null,"El garage esta completo");
        }else{
            JOptionPane.showMessageDialog(null,"El garage tiene plazas disponibles");
            this.matricula=JOptionPane.showInputDialog(null,"Introduce la matricula de tu coche");
            tiempo= Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce tiempo"));
            if(tiempo<=3){
                precio=(int)tiempo*1.5;

            }else{
                precio=3*1.5+((int)tiempo-3)*0.2;
            }
            JOptionPane.showMessageDialog(null,String.format("El precio a pagar es: %.2f",precio));
            do{
                pago=Double.parseDouble(JOptionPane.showInputDialog(null,"Introduce el dinero"));
                if(pago<precio){
                    JOptionPane.showMessageDialog(null,String.format("La cantidad introducida es insuficiente, el precio a pagar es: %.2f",precio),"Error",JOptionPane.WARNING_MESSAGE);
                }
            }while(pago<precio);
            cambio=pago-precio;
            JOptionPane.showMessageDialog(null,String.format("Matricula: "+this.matricula+"\nTiempo: %.2f horas\nPrecio a pagar: %.2f €\nCantida recivida: %.2f €\nCantidad devuelta: %.2f €",tiempo,precio,pago,cambio),"Factura:",JOptionPane.INFORMATION_MESSAGE,null);
        }

    }
}
