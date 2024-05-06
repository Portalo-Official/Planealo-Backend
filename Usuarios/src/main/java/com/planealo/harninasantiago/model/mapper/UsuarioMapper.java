package com.planealo.harninasantiago.model.mapper;

import java.time.LocalDateTime;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;
import org.mapstruct.Mappings;

import com.planealo.harninasantiago.model.dto.UsuarioDTO;
import com.planealo.harninasantiago.model.entity.Usuario;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UsuarioMapper {
	//No se ya si esto es estar mas limpio o sucio con el lenguje de alto nivel...
	@Mappings({
		@Mapping(source ="referencia", target ="ref"),
		@Mapping(target="pass", ignore = true) // Ignorar mapeo	
	})
	UsuarioDTO usuarioToUsuarioDTO(Usuario usuario);
	
	
	@Mapping(target ="id", ignore = true)  
	@Mapping(source="pass" ,target = "password")
	@Mapping(source ="ref", target = "referencia")
	@Mapping(target ="fechaCreacion", ignore = true) 
    @Mapping(target ="fechaUltimaActualizacion", ignore = true)
    @Mapping(target ="ultimeInicioSesion", ignore = true)
    Usuario usuarioDTOToUsuario(UsuarioDTO usuarioDTO);

	/**
	 * Metodo que ejecuta despues mapear un dto a usuario. 
	 * Si se crea es solo en el caso de que se guarde por ahora.
	 * @param usuario
	 */
    @AfterMapping
    default void setFechas(@MappingTarget Usuario usuario) {
        usuario.setFechaCreacion(LocalDateTime.now());
        usuario.setFechaUltimaActualizacion(LocalDateTime.now());
        usuario.setUltimeInicioSesion(LocalDateTime.now());
    }
}
