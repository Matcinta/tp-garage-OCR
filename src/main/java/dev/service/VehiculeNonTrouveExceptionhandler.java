package dev.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class VehiculeNonTrouveExceptionhandler {


	    @ResponseBody
	    @ExceptionHandler(VehiculeNonTrouveException.class)
	    @ResponseStatus(HttpStatus.NOT_FOUND)
	    String vehiculeNonTrouveHandler(VehiculeNonTrouveException ex) {
	      return ex.getMessage();
	    }
	}

