package dev.entite.vehicule;

public class A300B extends Vehicule {

    public A300B() {
    }

    public Marque getNomMarque() {
        return Marque.PIGEOT;
    }

    @Override
    public String TypeOption() {
        return null;
    }

    @Override
    public Double getPrix() {
        return 28457.0d;
    }


    @Override
    public String getNom() {
        return "A300B";
    }
}
