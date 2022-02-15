package Boletines.Boletin23;

import java.util.Locale;

public class Funciones {
    public static void stringLength(String text){
        System.out.println(text.length());
    }
    public static void stringAchar(String text){
        for(int i=0;i<text.length();i++){
            System.out.println(text.charAt(i));
        }
    }
    public static void invertirString(String text){
        String newText="";
        for(int i=text.length()-1;i>0;i--){
            newText+=text.charAt(i);
        }
        System.out.println(newText);
    }
    public static void eliminarEspacios(String text){
        String newText=text.replace(" ","");
        System.out.println(newText);
    }
    public static void contarLetras(String text){
        String noSpace=text.replace(" ","");
        String newText=noSpace.toLowerCase(Locale.ROOT);
        System.out.println(newText);
        int vocales=0;
        int other=0;
        for(int i=0;i<newText.length();i++){
            char a=newText.charAt(i);
            if (a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                vocales++;
            }else{other++;}
        }
        System.out.printf("Hay %d vocales y %d consonantes",vocales,other);
    }
    public static void dividirString(String text){
        System.out.println(text.substring(0,5));
        System.out.println(text.substring(5));
        System.out.println(text);
    }
    public static void mayusculas(String text){
        String newText=text.toUpperCase(Locale.ROOT);
        System.out.println(newText);
        System.out.println(newText.toLowerCase(Locale.ROOT));
    }
    public static void comparar(String text,String textToCompare){
        if(text.equals(textToCompare)){
            System.out.println("son iguales");
        }else{
            System.out.println("no son iguales");
        }
        //COMPARAR IGNORANDO MAYúS Y minus
        /*if(text.equalsIgnoreCase(textToCompare)){
            System.out.println("son iguales");
        }else{
            System.out.println("no son iguales");
        }*/
    }
    public static void intercambio(String text){
        String newText= text.replace('e','a');
        System.out.println(newText);
    }
    public static void ascii(String text){
        for(int i=0;i<text.length();i++){
            System.out.println((int)text.charAt(i));
        }
    }
    public static void charCount(String text){
        int digit=0;
        int leter=0;
        int other=0;
        for(int i=0;i<text.length();i++){
            if(Character.isDigit(text.charAt(i))){
                digit++;
            }else if(Character.isLetter(text.charAt(i))){
                leter++;
            }else{other++;}
        }
        System.out.printf("digitos: %d\nletras: %d\nespacios: %d",digit,leter,other);
    }
}
