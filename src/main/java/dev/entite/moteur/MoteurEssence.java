package dev.entite.moteur;

public class MoteurEssence extends Moteur {

    public MoteurEssence(String cylindre, Double prix) {
        super(cylindre, prix);
    }

    @Override
    public TypeMoteur getType() {
        return TypeMoteur.ESSENCE;
    }
}
