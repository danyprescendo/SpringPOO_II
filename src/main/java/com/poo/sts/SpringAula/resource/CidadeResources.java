package com.poo.sts.SpringAula.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poo.sts.SpringAula.model.Cidade;
import com.poo.sts.SpringAula.services.CidadeService;

@RestController
@RequestMapping("/cidade")
public class CidadeResources {

	@Autowired
	CidadeService service;

	@GetMapping
	public List<Cidade> listTodas() {
		return service.listaTodasCidades();
	}

	@GetMapping("/{id}")
	public Cidade buscarPorCodigo(@PathVariable Integer id) {
		return service.buscaPorCodigo(id);
	}

	@PostMapping
	public Cidade cadastra(@RequestBody Cidade c) {
		return service.insereCidade(c);
	}

	@GetMapping("/nome/{nome}")
	public Cidade buscarPorCodigo(@PathVariable String nome) {
		return service.buscaPorNome(nome);
	}
}
