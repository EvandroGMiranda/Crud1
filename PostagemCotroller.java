package com.example.blogpessoal.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.blogpessoal.model.PostagemModel;
import com.example.blogpessoal.repository.PostageRepository;


@RestController
@RequestMapping("/Postagens")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostagemCotroller {

		@Autowired
		private PostageRepository postagemRepository;
		
		@GetMapping
		public ResponseEntity<List<PostagemModel>> getall(){
			return ResponseEntity.ok(postagemRepository.findAll());
			
		}
}
