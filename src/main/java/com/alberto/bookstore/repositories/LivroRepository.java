package com.alberto.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alberto.bookstore.domain.Livro;


public interface LivroRepository extends JpaRepository<Livro, Integer> {
	
	
}
