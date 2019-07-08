package dev.entite.moteur;

public class MoteurElectrique extends Moteur {

    public MoteurElectrique(String cylindre, Double prix) {
        super(cylindre, prix);
    }

    @Override
    public TypeMoteur getType() {
        return TypeMoteur.ELECTRIQUE;
    }
}
