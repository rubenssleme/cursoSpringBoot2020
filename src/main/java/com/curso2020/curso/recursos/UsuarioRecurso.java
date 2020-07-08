package com.curso2020.curso.recursos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso2020.curso.entidades.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioRecurso {
	
	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		Usuario u = new Usuario(1L, "Rubens", "rubens@", "99999999", "123456");
		return ResponseEntity.ok().body(u);
	}

}
