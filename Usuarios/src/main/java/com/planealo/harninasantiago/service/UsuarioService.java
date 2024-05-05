package com.planealo.harninasantiago.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.planealo.harninasantiago.model.dto.UsuarioDTO;
import com.planealo.harninasantiago.model.entity.Usuario;
import com.planealo.harninasantiago.model.mapper.UsuarioMapper;
import com.planealo.harninasantiago.repository.IUsuarioRepository;

@Service
public class UsuarioService implements IService<UsuarioDTO>{
	
	private final IUsuarioRepository usuarioRepo;
	private final UsuarioMapper usuarioMapper;
	public UsuarioService(IUsuarioRepository usuarioRepo,
						  UsuarioMapper usuarioMapper) {
		super();
		this.usuarioRepo = usuarioRepo;
		this.usuarioMapper= usuarioMapper;
	}

	@Override
	public UsuarioDTO add(UsuarioDTO t) {
		// TODO Auto-generated method stub
		
		
		
		Usuario user = mapDTOtoUsuario(t);
		return mapUsuarioToDTO(this.usuarioRepo.save(user));
		
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UsuarioDTO getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UsuarioDTO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addAll(List<UsuarioDTO> t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UsuarioDTO editUser() {
		// TODO Auto-generated method stub
		return null;
	}
	
    public Usuario mapDTOtoUsuario(UsuarioDTO dto) {
	        return usuarioMapper.usuarioDTOToUsuario(dto);
	    }

    public UsuarioDTO mapUsuarioToDTO(Usuario usuario) {
        return usuarioMapper.usuarioToUsuarioDTO(usuario);
    }
	
}
