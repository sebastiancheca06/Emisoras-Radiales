package Emisora;

import java.util.Scanner;

public class Main {
	
	public static void main(String[]arg) {
		
		RadioFM fr1 = new RadioFM ();
		fr1.setFrecuencia(80);
		Scanner in = new Scanner (System.in);
		int opcion;
		
		do {

        System.out.println("\n  +MENU PRINCIPAL+   ");
        System.out.println("****USTED DESEA****");
        System.out.println("1. SUBIR FRECUENCIA");
        System.out.println("2. BAJAR FRECUENCIA");
        System.out.println("3. MOSTRAR FRECUENCIA");
        System.out.println("4. SALIR");
        System.out.println("DIGITE LA OPCION QUE DESEE: ");
        opcion = in.nextInt();
			 
        switch(opcion){
            case 1: fr1.controlador();fr1.subir();break;
            case 2: fr1.controlador();fr1.bajar();break;
            case 3: fr1.display();break;
            case 4: break;
            default: System.out.println("LA OPCION INGRESADA NO ES VALIDA");
        }
    }while (opcion != 4);
  }
}