package br.com.mutante.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mutante.model.HumanoModel;
import br.com.mutante.model.MutanteModel;
import br.com.mutante.model.StatsModel;
import br.com.mutante.repository.HumanoRepository;
import br.com.mutante.repository.MutanteRepository;


@Service
public class StatsService {
	

	@Autowired
	HumanoRepository humanoRepository;
	
	@Autowired
	MutanteRepository mutanteRepository;
	
	public StatsModel getStats() {
		
		StatsModel stats = new StatsModel();
		
		List<HumanoModel> qntdHumanos = humanoRepository.findAll();

		List<MutanteModel> qntdMutantes = mutanteRepository.findAll();
		
		stats.setCount_human_dna(qntdHumanos.size());
		stats.setCount_mutant_dna(qntdMutantes.size());
		
		Double pctg = (double) (qntdHumanos.size() / qntdMutantes.size());
		
		stats.setRatio(pctg);
		
		return stats;
	}

}
