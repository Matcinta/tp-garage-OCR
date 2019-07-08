package dev.entite.option;

public class BarreDeToit implements Option {

    @Override
    public String TypeOption() {
        return "Barre de toit";
    }

    public Double getPrix() {
        return 29.9d;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+
                " (" + this.getPrix() + "€)";
    }
}
