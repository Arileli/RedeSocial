package com.redesocialgracehopper.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redesocialgracehopper.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long> {
	List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
	List<Usuario> findAllByEmailContainingIgnoreCase(String email);
}
