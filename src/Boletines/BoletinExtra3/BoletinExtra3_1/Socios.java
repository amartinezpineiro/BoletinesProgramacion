package Boletines.BoletinExtra3.BoletinExtra3_1;

import java.util.Scanner;

public class Socios {
    public void pruebas(){
        Scanner pedirEdad=new Scanner(System.in);
        long cuota=800;
        int edadSocio;
        do {
            System.out.println("Introduce la edad del socio");
            edadSocio = pedirEdad.nextInt();
            if(edadSocio==0){
                break;
            }
            if (edadSocio < 21) {
                Scanner pedirPadres=new Scanner(System.in);
                System.out.println("Introuce 's' si tu padres son socios o 'n' si tus padres no son socios");
                String padreSocios = pedirPadres.nextLine();
                if(padreSocios.equals("s")){
                    System.out.println("La cuota es de: "+(cuota-cuota*0.45));
                }else if(padreSocios.equals("n")){
                    System.out.println("La cuota es de: "+(cuota-cuota*0.25));
                }
            }else if(edadSocio<=65){
                System.out.println("La cuota es de: "+cuota);
            }else{
                System.out.println("La cuota es de: "+(cuota-cuota*0.4));
            }
        }while(edadSocio!=0);
    }
}
