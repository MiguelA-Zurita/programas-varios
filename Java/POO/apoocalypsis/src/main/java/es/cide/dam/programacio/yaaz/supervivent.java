package es.cide.dam.programacio.yaaz;

import java.util.Random;

public class Supervivent {
     
    private int salut;
    private int atac;    
    private int defensa;
    private String nom;
    private Random random = new Random();

    public Supervivent(){
        
        this.atac = 10;
        this.salut = 100;
        this.defensa = 10;
        this.nom = "Supervivent";
    }

    public int getSalut() {
        return salut;
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
    }

    public void setAtac(int atac) {
        this.atac = atac;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void ataca(Zombie zombie){
        int atac = random.nextInt(0,this.atac);
        zombie.setSalut(zombie.getSalut() - atac);
        System.out.println("La salud restante del zombie es: " + zombie.getSalut());
    }

    public void defensat(Zombie zombie){
        int defensa = random.nextInt(0,this.defensa);
        this.setSalut(defensa - zombie.getAtaque());
        System.out.println("La salud restante del superviviente es: " + this.getSalut());
    }
}
