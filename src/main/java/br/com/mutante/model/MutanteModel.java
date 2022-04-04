package br.com.mutante.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
public class MutanteModel {
	
	public MutanteModel(){
		
	}

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer idMutante;
	
	@Column
	private String dnaSequence;
	
	public MutanteModel(String[] dnaSequence) {
		this.dnaSequence = String.join("", dnaSequence);
	}
	
}
