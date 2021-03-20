package com.br.cineomega.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.cineomega.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
