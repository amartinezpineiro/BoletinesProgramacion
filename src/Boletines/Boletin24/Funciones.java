package Boletines.Boletin24;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Funciones {
    public static void engadir(ArrayList<Libro> listaLibros) throws ListaNullException{
        if(listaLibros==null){
            throw new ListaNullException("La lista recivida es null");
        }else{
            Scanner parametrosLibro=new Scanner(System.in);
            System.out.println("introduce el titulo del libro");
            String titulo= parametrosLibro.nextLine();
            System.out.println("introduce el autor del libro");
            String autor= parametrosLibro.nextLine();
            System.out.println("introduce el ISBN del libro");
            String ISBN= parametrosLibro.nextLine();
            System.out.println("introduce el precio del libro");
            int precio= parametrosLibro.nextInt();
            System.out.println("introduce las unidades del libro");
            int nUnidades= parametrosLibro.nextInt();
            listaLibros.add(new Libro(titulo,autor,ISBN,precio,nUnidades));
        }
    }

    public static void vender(ArrayList<Libro> listaLibros, int libro) throws ListaNullException{
        if(listaLibros==null){
            throw new ListaNullException("La lista recivida es null");
        }else{
            if(listaLibros.get(libro).getnUnidades()==0){
                System.out.println("No quedan unidades de ese libro, utiliza la opcion de dar de baixa para quitarlo");
            }else{
                listaLibros.get(libro).setnUnidades(listaLibros.get(libro).getnUnidades()-1);
            }
        }
    }

    public static void amosar(ArrayList<Libro> listaLibros) throws ListaNullException{
        if(listaLibros==null){
            throw new ListaNullException("La lista recivida es null");
        }else{
            Funciones.ordenarLibros(listaLibros);
            for (int i = 0; i < listaLibros.size(); i++) {
                System.out.println(i+"."+listaLibros.get(i));
            }
        }
    }

    public static void darBaixa(ArrayList<Libro> listaLibros) throws ListaNullException{
        if(listaLibros==null){
            throw new ListaNullException("La lista recivida es null");
        }else{
            for (int i = 0; i < listaLibros.size(); i++) {
                if(listaLibros.get(i).getnUnidades()==0){
                    listaLibros.remove(i);
                }
            }
        }
    }

    public static void consultar(ArrayList<Libro> listaLibros, int libro){
        System.out.println(listaLibros.get(libro));
    }

    public static int pedirLibro(){
        Scanner esclibro=new Scanner(System.in);
        System.out.println("Introduce el numero del libro.");
        return esclibro.nextInt();
    }

    public static void ordenarLibros(ArrayList<Libro> listaLibros){
        for (int i = 0; i < listaLibros.size(); i++) {

        }
    }
}
