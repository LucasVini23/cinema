package com.br.cineomega.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.cineomega.model.Ingresso;
import com.br.cineomega.repository.IngressoRepository;

@RestController
@RequestMapping("/sessao")
public class SessaoController {

	@Autowired
	private IngressoRepository repository;
	
	@PostMapping("/comprar")
	private Ingresso compraIngresso(@RequestBody Ingresso sessao) {
		return repository.save(sessao);
	}
	
	
	@GetMapping("/lugares")
	private List<Ingresso> lugares_Da_Sessao() {
		return repository.findAll();
	}
	
	
	
}
