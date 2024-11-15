package es.cide.dam.programacio.yaaz;

public class Main {
    public static void main(String[] args) {
        Supervivent miquel = new Supervivent("Maiky");
        Ciutat albacete = new Ciutat("Albacete", 10);
        Zombie zombieRandom = albacete.posicioRuta(0);
        System.out.println("Zombie en la posición 0 de la ruta de Albacete: " + zombieRandom.getSalut() + " de salud");
        miquel.ataca();

    }
}