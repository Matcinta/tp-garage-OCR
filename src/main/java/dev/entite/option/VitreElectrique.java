package dev.entite.option;

import dev.entite.option.Option;

public class VitreElectrique implements Option {
    @Override
    public String TypeOption() {
        return "Vitre electrique";
    }

    @Override
    public Double getPrix() {
        return 212.35d;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+
                " (" + this.getPrix() + "€)";
    }
}
