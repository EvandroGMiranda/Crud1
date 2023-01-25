package com.example.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.blogpessoal.model.PostagemModel;

@Repository
public interface PostageRepository extends JpaRepository<PostagemModel, Long> {

}
