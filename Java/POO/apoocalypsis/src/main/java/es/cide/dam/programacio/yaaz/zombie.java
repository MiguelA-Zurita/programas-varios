package es.cide.dam.programacio.yaaz;

import java.util.Random;

public class Zombie {
    
    private int salut;
    private int ataque;
    private int defensa;
    private Random random = new Random();

    public Zombie(){
        this.salut = 20;
        this.ataque = 5;
        this.defensa = 5;
        System.out.println("Zombie creado");
    }

    public int getSalut() {
        return salut;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }
    
    public void setSalut(int salut) {
        this.salut = salut;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void ataca(Supervivent supervivent){
        int ataque = random.nextInt(0,this.ataque);
        supervivent.setSalut(supervivent.getSalut() - ataque);
        System.out.println("La salud restante del superviviente es: " + supervivent.getSalut());
    }

    public void defensat(Supervivent supervivent){
        int defensa = random.nextInt(0,this.defensa);
        supervivent.setSalut(supervivent.getSalut() - defensa);
        System.out.println("La salud restante del superviviente es: " + supervivent.getSalut());
    }
    
}