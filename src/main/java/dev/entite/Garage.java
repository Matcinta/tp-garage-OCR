package dev.entite;
import java.util.ArrayList;
import java.util.List;

import dev.entite.vehicule.Vehicule;

public class Garage {

    private List<Vehicule> voitures = new ArrayList<>();

    @Override
    public String toString() {
        return "*************************\n* Garage OpenClassrooms *" +
                "\n*************************" +
                "\nLe garage possède un parc de "  + this.voitures.size() +
                " voiture(s): " + voitures;
    }

    public void add(Vehicule voit){
        this.voitures.add(voit);
    }

    public List<Vehicule> getVoitures() {
        return voitures;
    }
}
