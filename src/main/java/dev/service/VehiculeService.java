package dev.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import dev.entite.moteur.Moteur;
import dev.entite.option.Option;
import dev.entite.vehicule.Marque;
import dev.entite.vehicule.Vehicule;
import dev.entite.vehicule.VehiculeRepository;

@Repository
public class VehiculeService {

	@Autowired
	private VehiculeRepository vehiculeRepository;

	public VehiculeService() {
		super();
	}

	public List<Vehicule> lister() {
		return vehiculeRepository.findAll();
	}

	@Transactional(propagation = Propagation.REQUIRED)
	public void creer(Double prix, String nom, List<Option> options, Marque nomMarque, Moteur moteur) {
		Vehicule v = new Vehicule(prix, nom, options, nomMarque, moteur);
		vehiculeRepository.save(v);
	}

	public List<Vehicule> chercherParNom(String nom) {
		return vehiculeRepository.findByNom(nom);
	}
	
	public Vehicule chercherParMatricule(String matricule) {
        return vehiculeRepository.findByMatricule(matricule).orElseThrow(() -> new VehiculeNonTrouveException());
}
	public Vehicule ajouterUnVehicule(Vehicule vehiculeAAjouter) {
		String matricule = vehiculeAAjouter.setMatricule(UUID.randomUUID().toString());
		vehiculeRepository.save(vehiculeAAjouter);
			return vehiculeAAjouter;
	}
	
//	public void addOption(Option opt){
//        this.options.add(opt);
//    }
//	

}
