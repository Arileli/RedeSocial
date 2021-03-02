package com.redesocialgracehopper.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.redesocialgracehopper.model.PostagemEntidade;

@Repository
public interface PostagemRepository extends JpaRepository<PostagemEntidade, Long>{
	
	List<PostagemEntidade> findAllByTituloContainingIgnoreCase(String titulo);

}
