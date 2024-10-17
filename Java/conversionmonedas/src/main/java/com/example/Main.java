package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String[] conversiones = {"1. Dòlars a Euros", "2. Dòlars a Pesos Mexicans","3. Euros a Dòlars","4. Euros a Pesos Mexicans", "5. Pesos Mexicans a Dòlars", "6. Pesos Mexicans a Euros", "7. Sortir"};
        String[] monedaAConvertirAbreviada = {"EUR", "USD", "MXN"};
        String[] monedaConvertidaAbreviada = {"EUR", "USD", "MXN"};
        String siNo = "s";
        int opcionMenu= 0;
        int monedaConvertida = 0;
        int monedaAConvertir = 0;
        boolean salir = false;
        double cantidadAConvertir = 0.0d;
        double cantidadConvertida = 0.0d;
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
            while (cantidadAConvertir<0) {
                System.out.println("Has introducido una cantidad negativa, introduce un valor correcto");
                cantidadAConvertir = sc.nextInt();
            }
            switch (opcionMenu) {
                case (0):
                    System.out.println("Has eligido: " + conversiones[opcionMenu]);
                    System.out.println("Introduce la cantidad que deseas convertir a la moneda escogida.");
                    cantidadAConvertir = sc.nextInt();
                    cantidadConvertida = cantidadAConvertir*0.85;
                    monedaAConvertir = 1; //USD
                    monedaConvertida = 0; //EUR
                    System.out.println("La conversion escogida es: " + conversiones[opcionMenu]);
                    System.out.println("Tu resultado es de " + cantidadAConvertir + monedaAConvertirAbreviada[monedaAConvertir] + " = " + cantidadConvertida + monedaConvertidaAbreviada[monedaConvertida]); 
                    System.out.println("Deseas continuar convirtiendo? s/n");
                    siNo = sc.next();
                    if (siNo.equals("n")) {
                        salir = true;
                    }
                    break;
                case (1):
                    System.out.println("Has eligido: " + conversiones[opcionMenu]);
                    System.out.println("Introduce la cantidad que deseas convertir a la moneda escogida.");
                    cantidadAConvertir = sc.nextInt();
                    cantidadConvertida = cantidadAConvertir*20;
                    monedaAConvertir = 1; //USD
                    monedaConvertida = 2; //MXN
                    System.out.println("La conversion escogida es: " + conversiones[opcionMenu]);
                    System.out.println("Tu resultado es de " + cantidadAConvertir + monedaAConvertirAbreviada[monedaAConvertir] + " = " + cantidadConvertida + monedaConvertidaAbreviada[monedaConvertida]); 
                    System.out.println("Deseas continuar convirtiendo? s/n");
                    siNo = sc.next();
                    if (siNo.equals("n")) {
                        salir = true;
                    }
                    break;
                case(2):
                    System.out.println("Has eligido: " + conversiones[opcionMenu]);
                    System.out.println("Introduce la cantidad que deseas convertir a la moneda escogida.");
                    cantidadAConvertir = sc.nextInt();
                    cantidadConvertida = cantidadAConvertir*1.18;
                    monedaAConvertir = 0; //EUR
                    monedaConvertida = 1; //USD
                    System.out.println("La conversion escogida es: " + conversiones[opcionMenu]);
                    System.out.println("Tu resultado es de " + cantidadAConvertir + monedaAConvertirAbreviada[monedaAConvertir] + " = " + cantidadConvertida + monedaConvertidaAbreviada[monedaConvertida]); 
                    System.out.println("Deseas continuar convirtiendo? s/n");
                    siNo = sc.next();
                    if (siNo.equals("n")) {
                        salir = true;
                    }
                    break;
                case(3):
                    System.out.println("Has eligido: " + conversiones[opcionMenu]);
                    System.out.println("Introduce la cantidad que deseas convertir a la moneda escogida.");
                    cantidadAConvertir = sc.nextInt();
                    cantidadConvertida = cantidadAConvertir*23.50;
                    monedaAConvertir = 0; //EUR
                    monedaConvertida = 2; //MXN
                    System.out.println("La conversion escogida es: " + conversiones[opcionMenu]);
                    System.out.println("Tu resultado es de " + cantidadAConvertir + monedaAConvertirAbreviada[monedaAConvertir] + " = " + cantidadConvertida + monedaConvertidaAbreviada[monedaConvertida]); 
                    System.out.println("Deseas continuar convirtiendo? s/n");
                    siNo = sc.next();
                    if (siNo.equals("n")) {
                        salir = true;
                    }
                    break;
                case(4):
                    System.out.println("Has eligido: " + conversiones[opcionMenu]);
                    System.out.println("Introduce la cantidad que deseas convertir a la moneda escogida.");
                    cantidadAConvertir = sc.nextInt();
                    cantidadConvertida = cantidadAConvertir*0.05;
                    monedaAConvertir = 2; //MXN
                    monedaConvertida = 1; //USD
                    System.out.println("La conversion escogida es: " + conversiones[opcionMenu]);
                    System.out.println("Tu resultado es de " + cantidadAConvertir + monedaAConvertirAbreviada[monedaAConvertir] + " = " + cantidadConvertida + monedaConvertidaAbreviada[monedaConvertida]); 
                    System.out.println("Deseas continuar convirtiendo? s/n");
                    siNo = sc.next();
                    if (siNo.equals("n")) {
                        salir = true;
                    }
                    break;
                case(5):
                    System.out.println("Has eligido: " + conversiones[opcionMenu]);
                    System.out.println("Introduce la cantidad que deseas convertir a la moneda escogida.");
                    cantidadAConvertir = sc.nextInt();
                    cantidadConvertida = cantidadAConvertir*0.042;
                    monedaAConvertir = 2; //MXN
                    monedaConvertida = 1; //EUR
                    System.out.println("La conversion escogida es: " + conversiones[opcionMenu]);
                    System.out.println("Tu resultado es de " + cantidadAConvertir + " "+monedaAConvertirAbreviada[monedaAConvertir] + " = " + cantidadConvertida + monedaConvertidaAbreviada[monedaConvertida]); 
                    System.out.println("Deseas continuar convirtiendo? s/n");
                    siNo = sc.next();
                    break;
                case(6):
                    salir = true;
                    break;
                default:
                    System.out.println("Has escogido una opción que no existe, escoge otra!");
            }
        }
        while(!salir);
        sc.close();
        System.out.println("Hasta luego!");
    }
}