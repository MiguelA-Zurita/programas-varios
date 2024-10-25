package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menuConversiones = { "1. Dólares a Euros", "2. Dólares a Pesos mexicanos", "3. Dólares a Yenes",
                "4. Dólares a Libras", "5. Euros a Dólares", "6. Euros a Pesos mexicanos", "7.Euros a Yenes",
                "8. Euros a Libras", "9. Pesos mexicanos a Dólares", "10. Pesos mexicanos a Euros",
                "11. Pesos mexicanos a Yenes", "12. Pesos mexicanos a Libras", "13. Yenes a Dólares",
                "14. Yenes a Euros", "15. Yenes a Pesos Mexicanos", "16. Yenes a Libras", "17. Libras a Dólares",
                "18. Libras a Euros", "19. Libras a Pesos mexicanos", "20. Libras a Yenes", "21. Salir" }; //Array con todas las opciones disponibles
        String[] monedaAConvertirAbreviada = { " USD", " EUR", " MXN", "JPY", "GBP" }; //Array con todas las abreviaciones de monedas
        String[] monedaConvertidaAbreviada = { " USD", " EUR", " MXN", "JPY", "GBP" }; //Aray con todas las abreviaciones de monedas
        Double [] conversionMonedas = {0.85, 20.0, 150.75, 0.77, 1.18, 23.5, 163.07, 0.83, 0.05, 0.042, 7.6, 0.039, 0.0066, 0.0061, 0.13, 0.01, 1.3, 1.2, 25.7, 196.0 }; //variables donde se guardan las conversiones de cada moneda
        String siNo = "s"; //Variable donde el usuario introducirá "s" o "n" para decidir si quiere salir del bucle
        int opcionMenu = 0; //Variable donde se escoge la opción del menú
        int monedaConvertida = 0; //
        int monedaAConvertir = 0;
        boolean salir = false;
        double cantidadAConvertir = 0.0d;
        double cantidadConvertida = 0.0d;
        do {
            System.out.println("Elige de las siguientes opciones:");
            for( int i = 0; i < menuConversiones.length; i++){
                System.out.println(menuConversiones[i]);
            }
            opcionMenu = sc.nextInt() - 1;
            if (opcionMenu >= 0 && opcionMenu <= 19) {
                System.out.println("Has eligido: " + menuConversiones[opcionMenu]);
                System.out.println("Introduce la cantidad que deseas convertir a la moneda escogida.");
                cantidadAConvertir = sc.nextDouble();
                while (cantidadAConvertir < 0) {
                    System.out.println("Has introducido una cantidad negativa, introduce un valor correcto");
                    cantidadAConvertir = sc.nextDouble();
                }
            }
            switch (opcionMenu) {
                case (0):
                    cantidadConvertida = cantidadAConvertir * conversionMonedas[opcionMenu];
                    monedaAConvertir = 0; // USD
                    monedaConvertida = 1; // EUR
                    break;
                case (1):
                    cantidadConvertida = cantidadAConvertir * conversionMonedas[opcionMenu];
                    monedaAConvertir = 0; // USD
                    monedaConvertida = 2; // MXN
                    break;
                case (2):
                    cantidadConvertida = cantidadAConvertir * conversionMonedas[opcionMenu];
                    monedaAConvertir = 0; // USD
                    monedaConvertida = 3; // JPY
                    break;
                case (3):
                    cantidadConvertida = cantidadAConvertir * conversionMonedas[opcionMenu];
                    monedaAConvertir = 0; // USD
                    monedaConvertida = 4; // GBP
                    break;
                case (4):
                    cantidadConvertida = cantidadAConvertir * conversionMonedas[opcionMenu];
                    monedaAConvertir = 1; // EUR
                    monedaConvertida = 0; // USD
                    break;
                case (5):
                    cantidadConvertida = cantidadAConvertir * conversionMonedas[opcionMenu];
                    monedaAConvertir = 1; // EUR
                    monedaConvertida = 2; // MXN
                    break;
                case (6):
                    cantidadConvertida = cantidadAConvertir * conversionMonedas[opcionMenu];
                    monedaAConvertir = 1; // EUR
                    monedaConvertida = 3; // JPY
                    break;
                case (7):
                    cantidadConvertida = cantidadAConvertir * conversionMonedas[opcionMenu];
                    monedaAConvertir = 1; // EUR
                    monedaConvertida = 4; // GBP
                    break;
                case (8):
                    cantidadConvertida = cantidadAConvertir * conversionMonedas[opcionMenu];
                    monedaAConvertir = 2; // MXN
                    monedaConvertida = 0; // USD
                    break;
                case (9):
                    cantidadConvertida = cantidadAConvertir * conversionMonedas[opcionMenu];
                    monedaAConvertir = 2; // MXN
                    monedaConvertida = 1; // EUR
                    break;
                case (10):
                    cantidadConvertida = cantidadAConvertir * conversionMonedas[opcionMenu];
                    monedaAConvertir = 2; // MXN
                    monedaConvertida = 3; // JPY
                    break;
                case (11):
                    cantidadConvertida = cantidadAConvertir * conversionMonedas[opcionMenu];
                    monedaAConvertir = 2; // MXN
                    monedaConvertida = 4; // GBP
                    break;
                case (12):
                    cantidadConvertida = cantidadAConvertir * conversionMonedas[opcionMenu];
                    monedaAConvertir = 3; // JPY
                    monedaConvertida = 0; // Dólar
                    break;
                case (13):
                    cantidadConvertida = cantidadAConvertir * conversionMonedas[opcionMenu];
                    monedaAConvertir = 3; // JPY
                    monedaConvertida = 1; // EUR
                    break;
                case (14):
                    cantidadConvertida = cantidadAConvertir * conversionMonedas[opcionMenu];
                    monedaAConvertir = 3; // JPY
                    monedaConvertida = 2; // MXN
                    break;
                case (15):
                    cantidadConvertida = cantidadAConvertir * conversionMonedas[opcionMenu];
                    monedaAConvertir = 3; // JPY
                    monedaConvertida = 4; // GBP
                    break;
                case (16):
                    cantidadConvertida = cantidadAConvertir * conversionMonedas[opcionMenu];
                    monedaAConvertir = 4; // GBP
                    monedaConvertida = 0; // USD
                    break;
                case (17):
                    cantidadConvertida = cantidadAConvertir * conversionMonedas[opcionMenu];
                    monedaAConvertir = 4; // GBP
                    monedaConvertida = 1; // EUR
                    break;
                case (18):
                    cantidadConvertida = cantidadAConvertir * conversionMonedas[opcionMenu];
                    monedaAConvertir = 4; // GBP
                    monedaConvertida = 2; // MXN
                case (19):
                    cantidadConvertida = cantidadAConvertir * conversionMonedas[opcionMenu];
                    monedaAConvertir = 4; // GBP
                    monedaConvertida = 3; // JPY
                case (20):
                    salir = true;
                    break;
                default:
                    System.out.println("Has escogido una opción que no existe, escoge otra!");
            }
            if (opcionMenu >= 0 && opcionMenu <= 19) {
                System.out.println("La conversion escogida es: " + menuConversiones[opcionMenu]);
                System.out.println(
                        "Tu resultado es de " + cantidadAConvertir + monedaAConvertirAbreviada[monedaAConvertir] + " = "
                                + cantidadConvertida + monedaConvertidaAbreviada[monedaConvertida]);
                System.out.println("Deseas continuar convirtiendo? s/n");
                siNo = sc.next().toLowerCase();
                while (!(siNo.equals("s")) && !(siNo.equals("n"))) {
                    System.out.println("Perdona, no te he entendido, puedes repetir? (Introduce 's' o 'n')");
                    siNo = sc.next();
                }
                if (siNo.equals("n")) {
                    salir = true;
                }
            }
        } while (!salir);
        sc.close();
        System.out.println("Hasta luego!");
    }
}