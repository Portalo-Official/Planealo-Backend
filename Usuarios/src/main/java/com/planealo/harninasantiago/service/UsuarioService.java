package com.planealo.harninasantiago.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.planealo.harninasantiago.model.entity.Usuario;
import com.planealo.harninasantiago.repository.IUsuarioRepository;

@Service
public class UsuarioService implements IService<Usuario>{
	
	private final IUsuarioRepository usuarioRepo;
	
	public UsuarioService(IUsuarioRepository usuarioRepo) {
		super();
		this.usuarioRepo = usuarioRepo;
	}

	@Override
	public Usuario add(Usuario t) {
		// TODO Auto-generated method stub
		return this.usuarioRepo.save(t);
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Usuario getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addAll(List<Usuario> t) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
