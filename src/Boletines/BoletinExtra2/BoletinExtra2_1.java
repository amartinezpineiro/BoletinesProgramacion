package Boletines.BoletinExtra2;

import java.util.Scanner;

public class BoletinExtra2_1 {

    public static void main(String[] args) {
        //creo un objeto conta mediante peticiones por teclado
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el nombre del cliente: ");
        String a=sc.nextLine();
        System.out.println("Introduce el número de cuenta: ");
        String b=sc.nextLine();
        System.out.println("Introduce el tipo de interes: ");
        double c=sc.nextDouble();
        System.out.println("Introduce el saldo de la cuenta: ");
        double d=sc.nextDouble();
        Conta cuentaOrigen=new Conta(a,b,c,d);
        //creo un objeto conta mediante parametros ya establecidos
        Conta cuentaDestino=new Conta("pepe","12345",2,100);
        //prueba de los metodos ingreso y reintegro
        System.out.println("El saldo de la cuenta origen es: "+cuentaOrigen.getSaldo());
        cuentaOrigen.ingreso(10);
        System.out.println("El saldo de la cuenta origen es: "+cuentaOrigen.getSaldo());
        cuentaOrigen.reintegro(20);
        System.out.println("El saldo de la cuenta origen es: "+cuentaOrigen.getSaldo());
        //pruebas con valores no validos
        cuentaOrigen.ingreso(-10);
        System.out.println("El saldo de la cuenta origen es: "+cuentaOrigen.getSaldo());
        cuentaOrigen.reintegro(-20);
        System.out.println("El saldo de la cuenta origen es: "+cuentaOrigen.getSaldo());
        //prueba de metodo transferencia
        cuentaOrigen.transferencia(cuentaOrigen,cuentaDestino,10);
        System.out.println("El saldo de la cuenta origen es: "+cuentaOrigen.getSaldo());
        System.out.println("El saldo de la cuenta destino es: "+cuentaDestino.getSaldo());

    }

}
