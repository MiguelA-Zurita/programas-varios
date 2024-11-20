package es.cide.dam.programacio.yaaz;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String nomDelSupervivent = "";
        String nomDeLaCiutat = "";
        int tamanyDeLaCiutat = 0;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a tu aventura post-apocalíptica");
        System.out.println("Creando superviviente...");
        System.out.println("Introduce el nombre del superviviente:");
        nomDelSupervivent = sc.nextLine();
        supervivent sup = new supervivent(nomDelSupervivent);
        System.out.println("Creando ciudad...");
        System.out.println("Introduce el nombre de la ciudad:");
        nomDeLaCiutat = sc.nextLine();
        tamanyDeLaCiutat = rand.nextInt(10,20);
        ciutat albacete = new ciutat(nomDeLaCiutat,tamanyDeLaCiutat);
        zombie zombieRandom = albacete.posicioRuta(0);
        while (sup.getSalut() > 0 && zombieRandom.getSalut() > 0) {
            System.out.println("Zombie en la posición 0 de la ruta de " + nomDeLaCiutat + zombieRandom.getSalut() + " de salud");
            zombieRandom.setSalut(sup.ataca()-zombieRandom.defensat());
            sup.setSalut(sup.getSalut-(zombieRandom.ataca()-sup.getDefensa()));
        }
        
        sc.close();
    }
}