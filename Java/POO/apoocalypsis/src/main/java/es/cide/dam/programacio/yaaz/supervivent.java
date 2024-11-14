package es.cide.dam.programacio.yaaz;

import java.util.Random;

public class Supervivent {
     
    private int salut;
    private int atac;    
    private int defensa;
    private String nom;
    private Random random = new Random();

    public Supervivent(String nom){
        
        this.atac = 10;
        this.salut = 100;
        this.defensa = 10;
        this.nom = nom;
        System.out.println("Superviviente " + nom + " creado");
    }

    public int getSalut() {
        return this.salut;
    }

    public int getAtac() {
        return atac;
    }

    public int getDefensa() {
        return defensa;
    }

    public String getNom() {
        return nom;
    }

    public void setSalut(int salut) {
        this.salut = salut;
        System.out.println("Salud del superviviente cambiada a " + salut);
    }

    public void setAtac(int atac) {
        this.atac = atac;
        System.out.println("Ataque del superviviente cambiado a " + atac);
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
        System.out.println("Defensa del superviviente cambiada a " + defensa);
    }

    public void setNom(String nom) {
        this.nom = nom;
        System.out.println("Nombre del superviviente cambiado a " + nom);
    }

    public void ataca(Zombie zombie){
        int atac = random.nextInt(0,this.atac);
    }

    public void defensat(Zombie zombie){
        int defensa = random.nextInt(0,this.defensa);
        this.setSalut(defensa - zombie.getAtaque());
        System.out.println("La salud restante del superviviente es: " + this.getSalut());
    }
}
