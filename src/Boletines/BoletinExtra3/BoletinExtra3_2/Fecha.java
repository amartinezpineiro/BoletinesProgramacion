package Boletines.BoletinExtra3.BoletinExtra3_2;

import java.util.Scanner;

public class Fecha {
    public boolean esFechaValida(boolean vMes, boolean vAno, boolean vDia){
        boolean validar;
        validar= vMes && vAno && vDia;
        return validar;
    }
    public boolean validarMes(int mes){
        boolean vMes;
        vMes= mes >= 1 && mes <= 12;
        return vMes;
    }
    public boolean validarAno(int ano){
        boolean vAno;
        vAno= ano >= 1600 && ano <= 3000;
        return vAno;
    }
    public boolean validarDia(int mes, int ano, int dia){
        boolean vDia;
        int maximo=0;
        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maximo=31;break;
            case 2:if(ano%4==0&&ano%100!=0&&ano%400==0){maximo=29;}else{maximo=28;}break;
            case 4:
            case 6:
            case 9:
            case 11:
                maximo=30;break;
        }
        vDia= dia >= 1 && dia <= maximo;
        return vDia;
    }
    public int pedirDato(String dato){
        Scanner numeroEntero=new Scanner(System.in);
        System.out.println("Introduce el "+dato);
        return numeroEntero.nextInt();
    }
    public void pedirFechas(){
        int mes;
        int ano;
        int dia;
        do{
            mes=pedirDato("mes");
            ano=pedirDato("año");
            dia=pedirDato("día");
            System.out.println("El valor de la fecha es: "+(esFechaValida(validarMes(mes),validarAno(ano),validarDia(mes,ano,dia))));
        }while(ano>0);
    }
}
