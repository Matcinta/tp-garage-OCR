package dev.service;

public class VehiculeNonTrouveException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	VehiculeNonTrouveException(){
        super();
    }
    
	VehiculeNonTrouveException(String s){
        super(s);
    }
    
    
    
}

