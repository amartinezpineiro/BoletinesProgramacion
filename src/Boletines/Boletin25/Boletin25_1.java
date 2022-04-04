package Boletines.Boletin25;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Boletin25_1 {
    public static void main(String[] args) throws IOException {
        File fichero =new File("prueba.txt");
        try{
            FileWriter escribir =new FileWriter(fichero);
            escribir.write("hola que tal");
            escribir.close();
            System.out.println("se ha escrito con exito");
        }catch(IOException e){
            System.out.println("a ocurrido un error");
        }
        try{
            Scanner leer =new Scanner(fichero);
            while(leer.hasNextLine()){
                System.out.println(leer.nextLine());
            }
            leer.close();
        }catch (FileNotFoundException e){
            System.out.println("no se ha podido leer el fichero");
            e.printStackTrace();
        }
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        ArrayList<String> cars2 = new ArrayList<String>();
        cars2=cars;
        System.out.println(cars2);
        int[] hola=new int[3];
        hola[0]=2;
        hola[1]=2;
        hola[2]=2;
        System.out.println(Arrays.toString(hola));
        int[] holaCopia=new int[3];
        holaCopia=hola;
        System.out.println(Arrays.toString(holaCopia));
    }
}
