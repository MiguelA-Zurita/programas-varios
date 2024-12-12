package es.cide.programacion;
/*
 * Nom: Miguel Angel Zurita Redwood
 * Data: 12/12/2024
 * 
 */
public class Main {
    public static void mostrarEina(eina unaEina){
        unaEina.utilitzar();
        System.out.println("Eina: "+ unaEina.getNom() + ", Pes: " + unaEina.getPes() + ", Material: " + unaEina.getMaterial());
    }
    public static void main(String[] args) {
            eina martillo = new martell(3.0, "madera");
            eina destornilladorPhilips = new destornillador(0.5, "hierro");
            eina sierra = new serra(3.0,"metal");
            Main.mostrarEina(martillo);
            Main.mostrarEina(destornilladorPhilips);
            Main.mostrarEina(sierra);
    }
}