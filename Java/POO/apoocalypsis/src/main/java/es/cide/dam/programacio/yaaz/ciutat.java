package es.cide.dam.programacio.yaaz;

public class Ciutat {
    
    private String nom;
    private int tamany;
    private Zombie ruta[];

    public Ciutat(String nom, int tamany){
        this.nom = nom;
        this.tamany = tamany;
        this.ruta = new Zombie[this.tamany];
        for (int i = 0; i < this.tamany; i++){
            this.ruta[i] = new Zombie();
            System.out.println("Zombie " + i + " creat");
        }
        System.out.println("Ciutat " + nom + " creada");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
        System.out.println("Nom de la ciutat canviat a " + nom);
    }

    public int getTamany() {
        return tamany;
    }
    
    public void setTamany(int tamany) {
        this.tamany = tamany;
        System.out.println("Tamany de la ciutat canviat a " + tamany);
    }

    public Zombie posicioRuta(int posicio) {
        return this.ruta[posicio];
    }
}