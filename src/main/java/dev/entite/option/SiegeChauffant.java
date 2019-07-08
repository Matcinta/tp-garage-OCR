package dev.entite.option;

public class SiegeChauffant implements Option {

    @Override
    public String TypeOption() {
        return "Siege Chauffant";
    }

    @Override
    public Double getPrix() {
        return 562.9d;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+
                " (" + this.getPrix() + "€)";
    }
}
