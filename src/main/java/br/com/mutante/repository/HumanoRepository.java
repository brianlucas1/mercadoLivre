package br.com.mutante.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.mutante.model.HumanoModel;

public interface HumanoRepository  extends JpaRepository<HumanoModel, Integer>{



}
