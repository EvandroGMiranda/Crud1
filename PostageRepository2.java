package com.example.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.blogpessoal.model.PostagemModel;

@Repository
public interface PostageRepository extends JpaRepository<PostagemModel, Long> {
	
	public List<PostagemModel> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
	
	

}
