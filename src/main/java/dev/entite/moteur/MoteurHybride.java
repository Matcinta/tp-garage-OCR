package dev.entite.moteur;

public class MoteurHybride extends Moteur {

    public MoteurHybride(String cylindre, Double prix) {
        super(cylindre, prix);
    }

    @Override
    public TypeMoteur getType() {
        return TypeMoteur.HYBRIDE;
    }
}
