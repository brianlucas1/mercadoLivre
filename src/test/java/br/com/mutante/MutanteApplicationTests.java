package br.com.mutante;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.mutante.model.HumanoModel;
import br.com.mutante.model.MutanteModel;
import br.com.mutante.service.MutanteService;
import junit.framework.TestCase;

@SpringBootTest
class MutanteApplicationTests {
	
	private String[] mutant =  new String[] { 
			  "ATGCGA", 
			  "CAGTGC", 
			  "TTATGG", 
			  "AGAAGG", 
			  "CCCCTA", 
			  "TCGCTG"};
	
	
	private String[] hum1 =  new String[] { 
			  "GTGCGA", 
			  "CACTAC", 
			  "TCCTGG", 
			  "CGAAAG", 
			  "CCCGTA", 
			  "TCGCTG"};
	
	@InjectMocks
	private MutanteService service;

	@Test
	public void testeSucessMutant() throws Exception{
		
		String[] dna = mutant;
		MutanteModel mutante = new MutanteModel(dna);
		
		boolean result = service.isMutant(dna);

		// THEN the return is true
		TestCase.assertTrue(result);
		
		
	}
	
	@Test
	public void testeErrorHuman() throws Exception{
		
		String[] dna = hum1;
		HumanoModel h = new HumanoModel(dna);
		
		boolean result = service.isMutant(dna);

		TestCase.assertFalse(result);
		
	}

}
