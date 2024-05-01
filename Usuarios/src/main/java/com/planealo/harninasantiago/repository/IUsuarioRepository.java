package com.planealo.harninasantiago.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.planealo.harninasantiago.model.entity.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Long>{

}
