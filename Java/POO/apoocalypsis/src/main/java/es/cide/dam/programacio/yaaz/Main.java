package es.cide.dam.programacio.yaaz;

public class Main {
    public static void main(String[] args) {
        Supervivent s = new Supervivent();
        Zombie z = new Zombie();
        Ciutat c = new Ciutat();
        int salutS = s.getSalut();
        System.out.println(salutS);
        System.out.println(z.getSalut());
        System.out.println(c.getNom());
        s.ataca(z);
        System.out.println(c.getZombies());
    }
}