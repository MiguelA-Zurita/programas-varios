package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fraseIntroducida = "0";
        int totalVocales = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        fraseIntroducida = sc.next();       
        for(int i = 0; i<fraseIntroducida.length(); i++){
            System.out.println(fraseIntroducida);
        }
        if (fraseIntroducida = ) {
            totalVocales++;
        }
        System.out.println(totalVocales);
        sc.close();
    }
}