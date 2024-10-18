package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String[] menuConversiones = {"1. Dòlars a Euros", "2. Dòlars a Pesos Mexicans","3. Euros a Dòlars","4. Euros a Pesos Mexicans", "5. Pesos Mexicans a Dòlars", "6. Pesos Mexicans a Euros", "7. Sortir"};
        String[] monedaAConvertirAbreviada = {" EUR", " USD", " MXN"};
        String[] monedaConvertidaAbreviada = {" EUR", " USD", " MXN"};
        String siNo = "s";
        int opcionMenu= 0;
        int monedaConvertida = 0;
        int monedaAConvertir = 0;
        boolean salir = false;
        double cantidadAConvertir = 0.0d;
        double cantidadConvertida = 0.0d;
       do{
            System.out.println("Elige de las siguientes opciones:");
            System.out.println(menuConversiones[0]);
            System.out.println(menuConversiones[1]);
            System.out.println(menuConversiones[2]);
            System.out.println(menuConversiones[3]);
            System.out.println(menuConversiones[4]);
            System.out.println(menuConversiones[5]);
            System.out.println(menuConversiones[6]);
            opcionMenu = sc.nextInt()-1;
            if(opcionMenu>=0 && opcionMenu<=5){
                System.out.println("Has eligido: " + menuConversiones[opcionMenu]);
                System.out.println("Introduce la cantidad que deseas convertir a la moneda escogida.");
                cantidadAConvertir = sc.nextDouble();
                while (cantidadAConvertir<0) {
                    System.out.println("Has introducido una cantidad negativa, introduce un valor correcto");
                    cantidadAConvertir = sc.nextDouble();
                }
            }
            switch (opcionMenu) {
                case (0):
                    cantidadConvertida = cantidadAConvertir*0.85;
                    monedaAConvertir = 1; //USD
                    monedaConvertida = 0; //EUR
                    break;
                case (1):
                    cantidadConvertida = cantidadAConvertir*20;
                    monedaAConvertir = 1; //USD
                    monedaConvertida = 2; //MXN
                    break;
                case(2):
                    cantidadConvertida = cantidadAConvertir*1.18;
                    monedaAConvertir = 0; //EUR
                    monedaConvertida = 1; //USD
                    break;
                case(3):
                    cantidadConvertida = cantidadAConvertir*23.50;
                    monedaAConvertir = 0; //EUR
                    monedaConvertida = 2; //MXN
                    break;
                case(4):
                    cantidadConvertida = cantidadAConvertir*0.05;
                    monedaAConvertir = 2; //MXN
                    monedaConvertida = 1; //USD
                    break;
                case(5):
                    cantidadConvertida = cantidadAConvertir*0.042;
                    monedaAConvertir = 2; //MXN
                    monedaConvertida = 0; //EUR
                    break;
                case(6):
                    salir = true;
                    break;
                default:
                    System.out.println("Has escogido una opción que no existe, escoge otra!");
            }
            if(opcionMenu>=0 && opcionMenu<=5){
                System.out.println("La conversion escogida es: " + menuConversiones[opcionMenu]);
                System.out.println("Tu resultado es de " + cantidadAConvertir +monedaAConvertirAbreviada[monedaAConvertir] + " = " + cantidadConvertida + monedaConvertidaAbreviada[monedaConvertida]); 
                System.out.println("Deseas continuar convirtiendo? s/n");
                siNo = sc.next().toLowerCase();
                while (!(siNo.equals("s")) && !(siNo.equals("n"))){
                    System.out.println("Perdona, no te he entendido, puedes repetir? (Introduce 's' o 'n')");
                    siNo =sc.next();
                }
                if (siNo.equals("n")) {
                    salir=true;
                }
            }    
        }
        while(!salir);
        sc.close();
        System.out.println("Hasta luego!");
    }
}