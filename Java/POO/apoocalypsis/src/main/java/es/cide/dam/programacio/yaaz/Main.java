package es.cide.dam.programacio.yaaz;

public class Main {
    public static void main(String[] args) {
        supervivent S = new supervivent();
        zombie Z = new zombie();
        ciutat C = new ciutat();
        int salutS = S.getSalut();
        System.out.println(salutS);
    }
}