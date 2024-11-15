/*
 * Nom: Miguel Angel Zurita Redwood
 * Data: 15/11/2024
 * 
 */



package es.cide.dam.programacio.yaaz;

public class Ciutat { // Clase ciutat

    private String nom;
    private int tamany;
    private Zombie ruta[];

    public Ciutat(String nom, int tamany) { // Constructor de la clase ciutat
        this.nom = nom; // Asignación del nombre de la ciudad
        this.tamany = tamany; // Asignación del tamaño de la ciudad
        this.ruta = new Zombie[this.tamany]; // Creación de un array de zombies con el tamaño de la ciudad
        for (int i = 0; i < this.tamany; i++) { // Bucle que crea un zombie en cada posición de la ruta
            this.ruta[i] = new Zombie(); // Creación de un zombie
            System.out.println("Zombie " + i + " creat");
        }
        System.out.println("Ciutat " + this.nom + " creada");
    }

    public String getNom() { // Método que devuelve el nombre de la ciudad
        return nom;
    }

    public int getTamany() { // Método que devuelve el tamaño de la ciudad
        return tamany;
    }

    public void setNom(String nom) { // Método que cambia el nombre de la ciudad
        this.nom = nom;
        System.out.println("Nom de la ciutat canviat a " + nom);
    }

    public void setTamany(int tamany) { // Método que cambia el tamaño de la ciudad
        this.tamany = tamany;
        System.out.println("Tamany de la ciutat canviat a " + tamany);
    }

    public Zombie posicioRuta(int posicio) { // Método que devuelve el zombie en una posición de la ruta
        return this.ruta[posicio];
    }
}