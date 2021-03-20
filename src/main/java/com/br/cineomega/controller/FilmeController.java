package com.br.cineomega.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.cineomega.model.Filme;
import com.br.cineomega.repository.FilmeRepository;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

	@Autowired
	private FilmeRepository filmeRepository;
	
	@PostMapping("/adicionar")
	private Filme adicionarFilme(@RequestBody Filme filme) {
		return filmeRepository.save(filme);
	}
	
	@GetMapping("/listar")
	private List<Filme> listarFilmes(){
		return filmeRepository.findAll();
	}
	
}
