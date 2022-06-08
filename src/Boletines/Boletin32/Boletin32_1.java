package Boletines.Boletin32;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;

public class Boletin32_1 {
    public static void main(String[] args) {
        ArrayList<Barco> RentBoat=new ArrayList<>();

        Barco vel =new Velero("a",15,5);
        Barco dep =new Deportivo("b",5,1000);
        Barco yat =new Yate("c",7,500,3);

        RentBoat.add(vel);
        RentBoat.add(dep);
        RentBoat.add(yat);

        for(Barco boat:RentBoat){
            System.out.println(boat.getClass()+ " " + boat.calcularPrecio(5)+" €");
        }
    }
}
