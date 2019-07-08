package dev.entite.moteur;

public abstract class Moteur {

    private TypeMoteur type;
    private String cylindre;
    private Double prix;

    public Moteur(String cylindre, Double prix) {

        this.cylindre = cylindre;
        this.prix = prix;
    }

    public dev.entite.moteur.TypeMoteur getType() {
        return type;
    }

    public void setType(dev.entite.moteur.TypeMoteur type) {
        this.type = type;
    }


    public String getCylindre() {
        return cylindre;
    }

    public void setCylindre(String cylindre) {
        this.cylindre = cylindre;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return getType() + " " + cylindre ;
    }

}
