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
        int primerNumero, segundoNumero, opcionMenu, i  = 0; //Instanciando variables necesarias
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
            switch (opcionMenu){
                case(5): //Caso de suma
                    System.out.println("Elige el primera número a sumar:");
                    primerNumero = sc.nextInt(); //Usuario introduce primer número
                    System.out.println("Introduce el segundo número que quieras sumar: ");
                    System.out.println(primerNumero + " + ?");
                    segundoNumero = sc.nextInt(); //Usuario introduce segundo número
                    System.out.println("Tu suma es igual a:");
                    System.out.println(primerNumero + " + " + segundoNumero + " = " + (primerNumero+segundoNumero));
                    System.out.println("Deseas continuar operando? s/n");
                    siNo = sc.next();
                    if(siNo.equals("n")){
                        salir = true;
                        System.out.println("Hasta la próxima!");
                    }
                    break;
                case(6): //Caso de resta
                    System.out.println("Elige el primera número a restar:");
                    primerNumero = sc.nextInt(); //Usuario introduce primer número
                    System.out.println("Introduce el segundo número que quieras restar: ");
                    System.out.println(primerNumero + " - ?");
                    segundoNumero = sc.nextInt(); //Usuario introduce segundo número
                    System.out.println("Tu resta es igual a:");
                    System.out.println(primerNumero + " - " + segundoNumero + " = " + (primerNumero-segundoNumero));
                    System.out.println("Deseas continuar operando? s/n");
                    siNo = sc.next();
                    if(siNo.equals("n")){
                        salir = true;
                        System.out.println("Hasta la próxima!");
                    }
                    break;
                case(7): //Caso de multiplicación
                    System.out.println("Elige el primera número a multiplicar:");
                    primerNumero = sc.nextInt(); //Usuario introduce primer número
                    System.out.println("Introduce el segundo número que quieras multiplicar: ");
                    System.out.println(primerNumero + " * ?");
                    segundoNumero = sc.nextInt(); //Usuario introduce segundo número
                    System.out.println("Tu multiplicación es igual a:");
                    System.out.println(primerNumero + " * " + segundoNumero + " = " + (primerNumero*segundoNumero));
                    System.out.println("Deseas continuar operando? s/n");
                    siNo = sc.next();
                    if(siNo.equals("n")){
                        salir = true;
                        System.out.println("Hasta la próxima!");
                    }
                    break;
                case(8): //Caso de división
                    System.out.println("Elige el primera número a dividir:");
                    primerNumero = sc.nextInt(); //Usuario introduce primer número
                    System.out.println("Introduce el segundo número que quieras dividir: ");
                    System.out.println(primerNumero + " / ?");
                    segundoNumero = sc.nextInt(); //Usuario introduce segundo número
                    while(segundoNumero == 0){ //Se verifica que no se divida entre 0
                        System.out.println("No es posible dividir entre 0, por favor, introduce otro número");
                        segundoNumero =sc.nextInt(); //Vuelve a pedir al usuario el dividendo
                    }
                    System.out.println("Tu división es igual a:");
                    System.out.println(primerNumero + " / " + segundoNumero + " = " + (primerNumero/segundoNumero));
                    System.out.println("Deseas continuar operando? s/n");
                    siNo = sc.next();
                    if(siNo.equals("n")){
                        salir = true;
                        System.out.println("Hasta la próxima!");
                    }
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
        }
        if(i == 5){
            System.out.println("Te has quedado sin operaciones! Vuelveme a ejecutar para obtener más :)");
        }
    
    }
}