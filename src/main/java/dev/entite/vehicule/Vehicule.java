package dev.entite.vehicule;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import dev.entite.moteur.Moteur;
import dev.entite.option.Option;

@Entity
public class Vehicule implements Option {

	@Id
	private String matricule;
    private Double prix;
    private String nom;
    private List<Option> options = new ArrayList<>();
    private Marque nomMarque;
    private Moteur moteur;

    public Vehicule() {
    	this.matricule = UUID.randomUUID().toString();
    }



    public Vehicule(Double prix, String nom, List<Option> options, Marque nomMarque, Moteur moteur) {
		super();
		this.matricule = UUID.randomUUID().toString();
		this.prix = prix;
		this.nom = nom;
		this.options = options;
		this.nomMarque = nomMarque;
		this.moteur = moteur;
	}



	public Double getPrix() {
        return this.prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Moteur getMoteur() {
        return moteur;
    }

    public void setMoteur(Moteur moteur) {
        this.moteur = moteur;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return "A300B";
    }

    public Marque getNomMarque() {
        return nomMarque;
    }

    public void setNomMarque(Marque nomMarque) {
        this.nomMarque = nomMarque;
    }

    public List<Option> getOptions() {
        return this.options;
    }
    
    

    public String getMatricule() {
		return matricule;
	}



	public String setMatricule(String matricule) {
		return this.matricule = matricule;
	}



	public void setOptions(List<Option> options) {
		this.options = options;
	}



	

    @Override
    public String TypeOption() {
        return null;
    }

    public Double getPrixTotal (){
        double sum = 0d;
     for (int i = 0; i < options.size(); i++){
        sum = sum + this.getOptions().get(i).getPrix();
     }
     sum = this.getPrix() + sum;
     return sum;
    }

    @Override
    public String toString() {
        return "\n\tVoiture " + getNomMarque() +
                " : " + getNom() +
                " Moteur " + getMoteur() +
                " (" + getPrix() + " €)" +
                " Options: " + getOptions() +
                " d'une valeur totale de " +
                getPrixTotal() + " €";
    }
}
