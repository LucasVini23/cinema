package com.br.cineomega.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

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
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate nascimento;
	private String email;
	private String cpf;
	
	public Cliente(String nome, LocalDate nascimento, String email, String cpf) {
		super();
		this.nome = nome;
		this.nascimento = nascimento;
		this.email = email;
		this.cpf = cpf;
	}
	
	
	
}
