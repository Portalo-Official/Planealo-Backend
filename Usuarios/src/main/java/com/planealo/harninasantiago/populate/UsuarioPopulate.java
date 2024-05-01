package com.planealo.harninasantiago.populate;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import com.planealo.harninasantiago.model.entity.Usuario;
import com.planealo.harninasantiago.service.UsuarioService;
@Component
public class UsuarioPopulate implements Populate{
	private final UsuarioService usuarioService;

	public UsuarioPopulate(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
		initPopulate();
	}

	@Override
	public void initPopulate() {
		
		ArrayList<Usuario> usuarios = new ArrayList<>();
		
		usuarios.add(new Usuario( "Santiago", "0001", "santi@miguez.com", "12345"));
		usuarios.add(new Usuario( "Euquerio", "0002", "euquerio@miguez.com", "11111"));
		usuarios.add(new Usuario( "Aneu", "0003", "aneu@miguez.com", "22222"));
		
		usuarios.forEach( u -> this.usuarioService.add(u));
		
	}
	
	
	
}
