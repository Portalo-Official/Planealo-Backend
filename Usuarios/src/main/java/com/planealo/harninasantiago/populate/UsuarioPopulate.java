package com.planealo.harninasantiago.populate;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.planealo.harninasantiago.model.dto.UsuarioDTO;
import com.planealo.harninasantiago.service.UsuarioService;

import jakarta.annotation.PostConstruct;
@Component
public class UsuarioPopulate implements Populate{
	private final UsuarioService usuarioService;
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String ddbbStatus;
	
	public UsuarioPopulate(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
		
	}
	
	@PostConstruct
	public void init() {
		if(!ddbbStatus.equals("update")) {
			initPopulate();
		}
	}

	@Override
	public void initPopulate() {
		
		ArrayList<UsuarioDTO> usuarios = new ArrayList<>();
		
		usuarios.add(new UsuarioDTO( "Santiago", "0001", "santi@miguez.com", "12345"));
		usuarios.add(new UsuarioDTO( "Euquerio", "0002", "euquerio@miguez.com", "11111"));
		usuarios.add(new UsuarioDTO( "Aneu", "0003", "aneu@miguez.com", "22222"));
		
		usuarios.forEach( u -> this.usuarioService.add(u));
		
	}
	
	
	
}
