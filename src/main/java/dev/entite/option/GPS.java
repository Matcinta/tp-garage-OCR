package dev.entite.option;

public class GPS implements Option {


    @Override
    public String TypeOption() {
        return "GPS";
    }

    public Double getPrix() {
        return 113.5d;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+
                " (" + this.getPrix() + "€)";
    }
}
