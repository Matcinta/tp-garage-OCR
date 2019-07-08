package dev.entite.vehicule;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculeRepository extends JpaRepository<Vehicule, String> {

	List<Vehicule> findByNom(String nom);
	Optional<Vehicule> findByMatricule(String matricule);
	
	
}
