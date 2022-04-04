package br.com.mutante.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity(name="Humano")
public class HumanoModel {
	
	public HumanoModel(){
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idHumano;
	
	private String dnaSequence;
	
	public HumanoModel(String[] dnaSequence) {
		this.dnaSequence = String.join("", dnaSequence);
	}


	
	

}
