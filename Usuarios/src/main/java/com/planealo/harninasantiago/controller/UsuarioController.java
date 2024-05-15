package com.planealo.harninasantiago.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
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

	
	public ResponseEntity<?> get(){
		return ResponseEntity.ok(this.usuarioService.getAll());
	}
	
	@PutMapping("/{ref}") // la # no puede pasarse por url esto lo gestiona el service
	public ResponseEntity<?> put(@PathVariable String ref ,@RequestBody UsuarioDTO usuarioModificado){
		
		UsuarioDTO usuario = this.usuarioService.editUser(ref ,usuarioModificado);
		
		if(usuario != null) {			
			return ResponseEntity.ok(usuario);
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no encontrado");
		
	}
	
	public ResponseEntity<?> post(@RequestBody UsuarioDTO usuario){
		return ResponseEntity.ok(this.usuarioService.add(usuario));
	}
	
	public ResponseEntity<?> list(@RequestBody UsuarioDTO usuario){
		return ResponseEntity.ok(this.usuarioService.add(usuario));
	}
	
}
