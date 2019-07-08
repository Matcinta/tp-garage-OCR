package dev.entite.option;

public class Climatisation implements Option {
    @Override
    public String TypeOption() {
        return "Climatisation";
    }

    @Override
    public Double getPrix() {
        return 347.3d;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+
                " (" + this.getPrix() + "€)";
    }

}
