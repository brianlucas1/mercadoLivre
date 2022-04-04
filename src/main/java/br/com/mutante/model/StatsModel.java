package br.com.mutante.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data

public class StatsModel {

	
	@Column
	private double count_mutant_dna;
	
	@Column
	private double count_human_dna;
	
	@Column
	private double ratio;
	
	
}
