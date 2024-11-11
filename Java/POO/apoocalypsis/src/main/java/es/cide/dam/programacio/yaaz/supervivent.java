package es.cide.dam.programacio.yaaz;

public class supervivent {
     
    private int salut;
    private int atac;    
    private int defensa;
    private String nom;
     
    public supervivent(){
        
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

    public void setNom(String nom) {
        this.nom = nom;
    }
}
