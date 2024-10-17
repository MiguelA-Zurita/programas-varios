package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String[] conversiones = {"1. Dòlars a Euros", "2. Dòlars a Pesos Mexicans","3. Euros a Dòlars","4. Euros a Pesos Mexicans", "5. Pesos Mexicans a Dòlars", "6. Pesos Mexicans a Euros", "7. Sortir"};
        String[] monedas = {"EUR", "USD", "MXN"};
        int opcionMenu = 0;
        boolean salir = false;
        double primeraCantidadMoneda, segundaCantidadMoneda = 0.0d;
       do{
            System.out.println("Elige de las siguientes opciones:");
            System.out.println(conversiones[0]);
            System.out.println(conversiones[1]);
            System.out.println(conversiones[2]);
            System.out.println(conversiones[3]);
            System.out.println(conversiones[4]);
            System.out.println(conversiones[5]);
            System.out.println(conversiones[6]);
            opcionMenu = sc.nextInt()-1;
            System.out.println("Has eligido: " + conversiones[opcionMenu]);
            System.out.println("Introduce la cantidad que deseas convertir a la moneda escogida.");
            primeraCantidadMoneda = sc.nextInt();
            while (primeraCantidadMoneda<0) {
                System.out.println("Has introducido una cantidad negativa, introduce un valor correcto");
                primeraCantidadMoneda = sc.nextInt();
            }
            switch (opcionMenu) {
                case (0):
                    segundaCantidadMoneda = primeraCantidadMoneda*0.85;
                    break;
                case (1):
                    segundaCantidadMoneda = primeraCantidadMoneda*20;
                    break;
                case(2):
                    segundaCantidadMoneda = primeraCantidadMoneda*1.18;
                    break;
                case(3):
                    segundaCantidadMoneda = primeraCantidadMoneda*23.50;
                    break;
                case(4):
                    segundaCantidadMoneda = primeraCantidadMoneda*0.05;
                    break;
                case(5):
                    segundaCantidadMoneda = primeraCantidadMoneda*0.042;
                    break;
                case(6):
                    System.out.println("Hasta luego!");
                    salir = true;
                    break;
                default:
                    System.out.println("Has escogido una opción que no existe, escoge otra!");
            }
            System.out.println("La conversion escogida es:" + conversiones[opcionMenu]);
            System.out.println("Tu resultado es de " + primeraCantidadMoneda + monedas[3]); 
        }
        while(!salir);
    }
}