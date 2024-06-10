package com.poo.sts.SpringAula.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poo.sts.SpringAula.model.Cidade;
import com.poo.sts.SpringAula.repository.CidadeRepository;

@Service
public class CidadeService {
	
	@Autowired
	CidadeRepository repository;

	public Cidade insereCidade(Cidade c) {
		return repository.save(c);
	}

	public Cidade AlteraCidade(Cidade c) {
		return repository.save(c);
	}

	public Cidade buscaPorCodigo(Integer id) {
		return repository.findById(id).orElse(null);
	}

	public void excluiCidade(Cidade c) {
		repository.delete(c);
	}

	public List<Cidade> listaTodasCidades() {
		return repository.findAll();
	}
	
	public Cidade buscaPorNome(String nome) {
		return repository.findByNome(nome);
	}

}
