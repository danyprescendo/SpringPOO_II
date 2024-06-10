package com.poo.sts.SpringAula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poo.sts.SpringAula.model.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
	public Cidade findByNome(String nome);

}
