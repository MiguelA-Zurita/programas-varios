package es.cide.dam.programacio.yaaz;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String nomDelSupervivent = "a";
        String nomDeLaCiutat = "a";
        int tamanyDeLaCiutat = 0;
        int turno = 1;
        int ataque = 0;
        int defensa = 0;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a tu aventura post-apocalíptica");
        System.out.println("Creando superviviente...");
        System.out.println("Introduce el nombre del superviviente:");
        nomDelSupervivent = sc.nextLine();
        System.out.println("Creando ciudad...");
        System.out.println("Introduce el nombre de la ciudad:");
        nomDeLaCiutat = sc.nextLine();
        tamanyDeLaCiutat = rand.nextInt(10, 20);
        supervivent sup = new supervivent(nomDelSupervivent);
        ciutat albacete = new ciutat(nomDeLaCiutat, tamanyDeLaCiutat);
        for (int i = 0; i < albacete.getTamany(); i++) {
            zombie zombieRandom = albacete.posicioRuta(i);
            System.out.println("Hay un zombie en la posición " + i + " de la ruta de " + nomDeLaCiutat + " con " + zombieRandom.getSalut() + " de salud");
            turno = 1;
            while (sup.getSalut() > 0 && zombieRandom.getSalut() > 0) {
                System.out.println("Turno " + turno);
                System.out.println("Salud restante del zombie: " + zombieRandom.getSalut());
                System.out.println("Salud restante de " + sup.getNom() + ": " + sup.getSalut());
                ataque = sup.ataca();
                defensa = zombieRandom.defensat();

                if (ataque <= defensa) {
                    System.out.println("El zombie ha bloqueado el ataque");
                }

                else {
                    System.out.println("El ataque de " + sup.getNom() + " ha sido de " + (ataque - defensa));
                    zombieRandom.setSalut(zombieRandom.getSalut() - (ataque - defensa));
                }
                
                if(zombieRandom.getSalut() <= 0){
                    System.out.println("El zombie ha muerto");
                }

                else{
                    ataque = zombieRandom.ataca();
                    defensa = sup.defensat();

                    if (ataque <= defensa) {
                        System.out.println( sup.getNom() + " ha bloqueado el ataque");
                    }

                    else {
                        System.out.println("El ataque del zombie ha sido de " + (ataque - defensa));
                        sup.setSalut(sup.getSalut() - (ataque - defensa));
                    }

                    if (sup.getSalut() <= 0) {
                        System.out.println("El superviviente ha muerto");
                        i = albacete.getTamany();
                    }
                }
                turno++;
            }
        }
        System.out.println("La ciudad ha sido limpiada de zombies");
        System.out.println("Has llegado al refugio de supervivientes");
        sc.close();
    }
}