package com.br.cineomega.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Integer idade;
	private String email;
	private String cpf;
	
	public Cliente(String nome, Integer idade, String email, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.cpf = cpf;
	}
	
	
	
}
