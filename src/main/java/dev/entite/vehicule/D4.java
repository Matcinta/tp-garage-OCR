package dev.entite.vehicule;

public class D4 extends Vehicule {

    public D4() {
    }

    public Marque getNomMarque() {
        return Marque.TROEN;
    }

    @Override
    public String TypeOption() {
        return null;
    }
    @Override
    public String getNom() {
        return "D4";
    }

    @Override
    public Double getPrix() {
        return 25147.0d;
    }
}
