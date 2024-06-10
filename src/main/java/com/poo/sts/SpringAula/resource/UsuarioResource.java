package com.poo.sts.SpringAula.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poo.sts.SpringAula.model.Usuario;
import com.poo.sts.SpringAula.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioResource {
	
	@Autowired
	UsuarioService service;
	
	@GetMapping
	public List<Usuario> listTodos() {
		return service.listaTodosUsuarios();
	}
	
	@GetMapping("/{id}")
	public Usuario buscarPorCodigo(@PathVariable Integer id) {
		return service.buscaPorCodigo(id);
	}
	@PostMapping
	public Usuario cadastra(@RequestBody Usuario u) {
		return service.insereUsuario(u);
	}

}
