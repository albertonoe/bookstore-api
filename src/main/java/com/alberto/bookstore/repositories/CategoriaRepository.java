package com.alberto.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alberto.bookstore.domain.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
	
	
}
