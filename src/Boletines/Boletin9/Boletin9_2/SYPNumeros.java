package Boletines.Boletin9.Boletin9_2;

public class SYPNumeros {
    /*public void calculo(){
        int i=9;
        int num=10;
        double suma=0;
        double producto=1;
        while(i<90){
            suma+=num;
            producto*=num;
            num++;
            i++;
        }
        System.out.println("La suma es: "+suma+" y el prodcuto es: "+producto);
    }*/
    public void calculo(){
        double suma=0;
        double producto=1;
        for (int i = 10; i <= 90 ; i++) {
            suma+=i;
            producto*=i;
        }
        System.out.println("La suma es: "+suma+" y el prodcuto es: "+producto);
    }
}
