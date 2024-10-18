/**************************************/
/* Nom: Miguel Angel Zurita 	      */
/* DNI/NIE: 			      */
/* Data: 10/10/2024				      */
/* Exercici: PROU2EX02				  */
/**************************************/

package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double primerNumero = 0.0d; //Instanciando variables necesarias
        double segundoNumero = 0.0d;
        int i = 0;
        int opcionMenu = 0;
        boolean salir = false;
        String siNo = "0";
        Scanner sc = new Scanner (System.in); //Abriendo Scanner
        for(i = 0;i<5 && !salir; i++){ //Empezando contador, cuando llegue a 5 no volverá al bucle
            System.out.println("Elige una de las siguientes opciones(" + i + " de 5 operaciones realizadas):"); //Mostrando el menú
            System.out.println("5. Sumar"); 
            System.out.println("6. Restar");
            System.out.println("7. Multiplicar");
            System.out.println("8. Dividir");
            System.out.println("9. Salir");
            opcionMenu = sc.nextInt(); //Recoge el número introducido por el usuario
            if(opcionMenu>=5 && opcionMenu<9){
                System.out.println("Introduce el primer número a operar");
                primerNumero= sc.nextDouble();
                System.out.println("Introduce el segundo número a operar");
                segundoNumero= sc.nextDouble();
            }
            switch (opcionMenu){
                case(5): //Caso de suma
                    System.out.println("Tu suma es igual a:");
                    System.out.println(primerNumero + " + " + segundoNumero + " = " + (primerNumero+segundoNumero));
                    break;
                case(6): //Caso de resta
                    System.out.println("Tu resta es igual a:");
                    System.out.println(primerNumero + " - " + segundoNumero + " = " + (primerNumero-segundoNumero));
                    break;
                case(7): //Caso de multiplicación
                    System.out.println("Tu multiplicación es igual a:");
                    System.out.println(primerNumero + " * " + segundoNumero + " = " + (primerNumero*segundoNumero));
                    break;
                case(8): //Caso de división
                    while(segundoNumero == 0){ //Se verifica que no se divida entre 0
                        System.out.println("No es posible dividir entre 0, por favor, introduce otro número");
                        segundoNumero =sc.nextDouble(); //Vuelve a pedir al usuario el dividendo
                    }
                    System.out.println("Tu división es igual a:");
                    System.out.println(primerNumero + " / " + segundoNumero + " = " + (primerNumero/segundoNumero));
                    break;
                case(9): //Caso de salida
                    System.out.println("Hasta la próxima!");
                    salir = true;
                    sc.close();
                    break;
                default: //En caso de que se introduzca un número incorrecto     
                    System.out.println("Has introducido un número erroneo, por favor, introduce un número válido");
                    i = i-1;
            }
            if(!salir && opcionMenu<=9 && opcionMenu>=5){
            System.out.println("Deseas continuar operando? s/n");
            siNo = sc.next().toLowerCase();
                if(siNo.equals("n")){
                    salir = true;
                    System.out.println("Hasta la próxima!");
                }
            }
        }  
        if(i == 5){
            System.out.println("Te has quedado sin operaciones! Vuelveme a ejecutar para obtener más :)");
        }
    
    }
}