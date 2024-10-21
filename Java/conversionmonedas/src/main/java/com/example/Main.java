package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String[] menuConversiones = {"1. Dólarrs a Euros", "2. Dólares a Pesos mexicanos","3. Dólares a Yenes","4. Dólares a Libras","5. Euros a Dólares","6. Euros a Pesos mexicanos","7.Euros a Yenes","8. Euros a Libras", "9. Pesos mexicanos a Dólares", "10. Pesos mexicanos a Euros","11. Pesos mexicanos a Yenes" ,"12. Pesos mexicanos a Libras","13. Yenes a Dólares", "14. Yenes a Euros", "15. Yenes a Pesos Mexicanos" ,"16.Yenes a Libras", "17.Libras a Dólares", "18. Libras a Euros", "19. Libras a Pesos mexicanos", "20. Libras a Yenes", "21. Salir"};
        String[] monedaAConvertirAbreviada = {" EUR", " USD", " MXN", "JPY", "GBP"};
        String[] monedaConvertidaAbreviada = {" EUR", " USD", " MXN", "JPY", "GBP"};
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
            System.out.println(menuConversiones[7]);
            System.out.println(menuConversiones[8]);
            System.out.println(menuConversiones[9]);
            System.out.println(menuConversiones[10]);
            System.out.println(menuConversiones[11]);
            System.out.println(menuConversiones[12]);
            System.out.println(menuConversiones[13]);
            System.out.println(menuConversiones[14]);
            System.out.println(menuConversiones[15]);
            System.out.println(menuConversiones[16]);
            System.out.println(menuConversiones[17]);
            System.out.println(menuConversiones[18]);
            System.out.println(menuConversiones[19]);
            System.out.println(menuConversiones[20]);
            opcionMenu = sc.nextInt()-1;
            if(opcionMenu>=0 && opcionMenu<=19){
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
                    cantidadConvertida = cantidadAConvertir*150.75;
                    monedaAConvertir = 1; //USD
                    monedaConvertida = 3; //JPY
                    break;
                case(3):
                    cantidadConvertida = cantidadAConvertir*0.77;
                    monedaAConvertir= 1; //USD
                    monedaConvertida = 4; //GBP
                    break;
                case(4):
                    cantidadConvertida = cantidadAConvertir*1.18;
                    monedaAConvertir = 0; //EUR
                    monedaConvertida = 1; //USD
                    break;
                case(5):
                    cantidadConvertida = cantidadAConvertir*23.50;
                    monedaAConvertir = 0; //EUR
                    monedaConvertida = 2; //MXN
                    break;
                case(6):
                    cantidadConvertida = cantidadAConvertir*163.
                case(9):
                    cantidadConvertida = cantidadAConvertir*0.05;
                    monedaAConvertir = 2; //MXN
                    monedaConvertida = 1; //USD
                    break;
                case(10):
                    cantidadConvertida = cantidadAConvertir*0.042;
                    monedaAConvertir = 2; //MXN
                    monedaConvertida = 0; //EUR
                    break;
                    
                case(20):
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