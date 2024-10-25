package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroProductos = 0;
        System.out.println("Introduce el número de productos que hay en el inventario:");
        numeroProductos = sc.nextInt();
        int stockProductos[] = new int[numeroProductos];
        String nombreProductos[] = new String[numeroProductos];
        double precioProductos[] = new double[numeroProductos];
        for (int i = 0; i<numeroProductos; i++){
            System.out.println("Introduce el nombre del producto");
            nombreProductos[i] = sc.next();
            System.out.println("Introduce su precio:");
            precioProductos[i] = sc.nextDouble();
            System.out.println("Introduce el stock disponible:");
            stockProductos[i] = sc.nextInt(); 
            System.out.println(nombreProductos[i] + " " + precioProductos[i] + " " + stockProductos[i]);

        }
        for(int i = 0; i<numeroProductos; i++){
            System.out.printf(nombreProductos[i] + " " + precioProductos[i] + " " + stockProductos[i]);
            System.out.println();
        }
        sc.close();
    }
}