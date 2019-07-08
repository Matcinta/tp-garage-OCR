package dev.entite.moteur;

public class MoteurDiesel extends Moteur{

    public MoteurDiesel(String cylindre, Double prix) {
        super(cylindre, prix);
    }

    @Override
    public TypeMoteur getType() {
        return TypeMoteur.DIESEL;
    }
}