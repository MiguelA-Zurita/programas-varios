package es.cide.dam.programacio.yaaz;

public class Ciutat {
    
    private String nom;
    private int tamany;
    private Zombie zombies[];

    public Ciutat(){
        this.nom = "Albacete";
        this.tamany = 5;
        for (int i = 0; i < this.tamany; i++){
            this.zombies[i] = new Zombie();
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTamany() {
        return tamany;
    }
    
    public void setTamany(int tamany) {
        this.tamany = tamany;
    }

    public int getZombies() {
        return zombies.length;
    }
}