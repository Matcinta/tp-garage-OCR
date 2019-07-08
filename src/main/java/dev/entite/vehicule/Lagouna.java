package dev.entite.vehicule;

public class Lagouna extends Vehicule {

    public Lagouna (){

    }

    @Override
    public Marque getNomMarque() {
        return Marque.RENO;
    }

    @Override
    public String getNom() {
        return "Lagouna";
    }

    @Override
    public String TypeOption() {
        return null;
    }

    @Override
    public Double getPrix() {
        return 23123.0d;
    }
}
