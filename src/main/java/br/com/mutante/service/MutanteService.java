package br.com.mutante.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mutante.impl.MontaTableMutante;
import br.com.mutante.model.HumanoModel;
import br.com.mutante.model.MutanteModel;
import br.com.mutante.repository.HumanoRepository;
import br.com.mutante.repository.MutanteRepository;

@Service
public class MutanteService {
	
	@Autowired
	MutanteRepository mutanteRepository;	

	@Autowired
	HumanoRepository humanoRepository;
	

	
	public boolean isMutant(String[] dna) throws Exception{
		
		boolean isMutante = false;
		
		MontaTableMutante montaMutante = new MontaTableMutante();

		try {		
		
			isMutante = montaMutante.isMutant(dna);
			 
			if(isMutante) {
				MutanteModel mutant = new MutanteModel(dna);
				mutanteRepository.save(mutant);
			} else {	
				HumanoModel humano = new HumanoModel(dna);
				humanoRepository.save(humano);
			}
		} catch (Exception ex) {
			throw new Exception(ex.getMessage());
		}
		
		return isMutante;
	}
		
	}


