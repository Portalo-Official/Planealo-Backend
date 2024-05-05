package com.planealo.harninasantiago.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.planealo.harninasantiago.model.dto.UsuarioDTO;
import com.planealo.harninasantiago.service.UsuarioService;

@RestController
@RequestMapping("usuario")
public class UsuarioController {
	
	private final UsuarioService usuarioService;
	
	public UsuarioController(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
	}

	public ResponseEntity<?> addUsuario(@RequestBody UsuarioDTO usuario){
		return ResponseEntity.ok(this.usuarioService.add(usuario));
	}
	
}
