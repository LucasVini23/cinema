package com.br.cineomega.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.cineomega.model.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long>{

}
