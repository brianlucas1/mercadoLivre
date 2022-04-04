package br.com.mutante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mutante.model.HumanoModel;
import br.com.mutante.model.MutanteModel;

public interface MutanteRepository  extends JpaRepository<MutanteModel, Integer>{


}
