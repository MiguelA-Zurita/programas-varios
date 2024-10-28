package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fraseIntroducida = "0";
        int totalVocales = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        fraseIntroducida = sc.next();
        fraseIntroducida = fraseIntroducida.toLowerCase();
        char[] letras = fraseIntroducida.toCharArray();     
        for(int i = 0; i<fraseIntroducida.length(); i++){
            switch(letras[i]){
                case('a'):
                case('e'):
                case('i'):
                case('o'):
                case('u'):
                System.out.println("La letra " + letras[i] + " es vocal");
                totalVocales++;
                break;
            default:
                System.out.println("la letra " + letras[i] + " es consonante");
            }
            
        }
        System.out.println("En total hay " + totalVocales + " vocales");
        sc.close();
    }
}