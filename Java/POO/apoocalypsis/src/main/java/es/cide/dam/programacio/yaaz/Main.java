package es.cide.dam.programacio.yaaz;

public class Main {
    public static void main(String[] args) {
        Supervivent miquel = new Supervivent("Maiky");
        Ciutat albacete = new Ciutat("Albacete", 10);
        Zombie zombieRandom = albacete.posicioRuta(0);
        System.out.println(zombieRandom.getSalut());
        miquel.ataca(zombieRandom);
        zombieRandom.ataca(miquel);
    
    }
}