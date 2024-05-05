 package com.planealo.harninasantiago.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.planealo.harninasantiago.model.dto.UsuarioDTO;
import com.planealo.harninasantiago.model.entity.Usuario;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UsuarioMapper {
	
	@Mapping(source = "referencia", target = "ref")
	UsuarioDTO entityToDTO(Usuario usuario);
}
