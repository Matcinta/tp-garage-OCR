package dev.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.entite.vehicule.Vehicule;
import dev.service.VehiculeService;

@RestController
@RequestMapping("/vehicule")
public class VehiculeController {

	@Autowired
    private VehiculeService vehiculeService;

    @RequestMapping(
            method = RequestMethod.GET
    		)
    
    public List<String> recupMatricule(@RequestParam String nom) {

        List<String> matricules = vehiculeService.chercherParNom(nom)
                .stream()
                .map(c -> c.getMatricule()) // on peut écrire .map(Collegue::getMatricule)
                .collect(Collectors.toList()); // on peut écrire .collect(toList()); en important import static collectors

        return matricules;

}
    @RequestMapping(
            method = RequestMethod.GET, 
            path = "/{matricule}")

    public Vehicule recupVehiculeFromMatricule(@PathVariable String matricule) {

    	Vehicule v = vehiculeService.chercherParMatricule(matricule);
        return v;

    }

    @RequestMapping(
            method = RequestMethod.POST
            )

    public Vehicule newVehicule(@RequestBody Vehicule v) {

    	Vehicule newVehicule = vehiculeService.ajouterUnVehicule(v);

        return newVehicule;

}
}
