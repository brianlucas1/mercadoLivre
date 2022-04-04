package br.com.mutante.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.mutante.model.DnaSequencia;
import br.com.mutante.service.MutanteService;


@RestController
public class MutantController {
	
	@Autowired
	MutanteService mutanteService;
	
	
	@RequestMapping(value="/mutant", method=RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> analiseMutante(@RequestBody DnaSequencia dna) throws Exception{
		
		boolean isMutant;
		ResponseEntity<String> responseEntity = null;
		
		
		isMutant = mutanteService.isMutant(dna.getDna());
	
		if(isMutant) {
			responseEntity = new ResponseEntity<>(HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity<>(HttpStatus.FORBIDDEN);
		}
		
		return responseEntity;
	}
	
}
