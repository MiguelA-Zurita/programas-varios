package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int seleccionCanal = 0;
        int canalSalon = 0;
        int volumenSalon = 0;
        int canalHabitacion = 0;
        int volumenHabitacion = 0;
        TV televisionSalon = new TV();
        TV televisionHabitacion = new TV();
        Scanner sc = new Scanner(System.in);
        televisionSalon.encender();
        televisionSalon.apagar();
        televisionSalon.subirVolumen();
        televisionSalon.bajarVolumen();
        System.out.println("Introduce un canal");
        seleccionCanal = sc.nextInt();
        televisionSalon.setCanal(seleccionCanal);
        canalSalon = televisionSalon.getCanal();
        System.out.println(canalSalon);
        sc.close();
        volumenSalon = televisionSalon.getVolumen();
        System.out.println(volumenSalon);
        televisionHabitacion.subirVolumen();
        volumenHabitacion = televisionHabitacion.getVolumen();
        volumenSalon = televisionSalon.getVolumen();
        canalHabitacion = televisionHabitacion.getCanal();
        if(volumenHabitacion > volumenSalon){
            System.out.println("La habitación tiene mayor volumen");
        }
        else{
             if(volumenSalon > volumenHabitacion){
                System.out.println("El Salon tiene mayor volumen");
             }
             else{
                System.out.println("Ambos tienen el mismo volumen");
             }
        }
    }
}