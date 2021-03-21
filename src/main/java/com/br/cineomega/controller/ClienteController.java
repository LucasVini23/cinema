package com.br.cineomega.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.cineomega.model.Cliente;
import com.br.cineomega.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@PostMapping("/adicionar")
	public Cliente adicionarCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@GetMapping("/listar")
	public List<Cliente> listarCliente() {
		return clienteRepository.findAll();
	}
	
	
}
