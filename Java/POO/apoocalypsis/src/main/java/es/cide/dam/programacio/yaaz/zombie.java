package es.cide.dam.programacio.yaaz;

public class zombie {
    
    private int salut;
    private int ataque;
    private int defensa;

    public zombie(){
        this.salut = 20;
        this.ataque = 5;
        this.defensa = 5;
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
    
}