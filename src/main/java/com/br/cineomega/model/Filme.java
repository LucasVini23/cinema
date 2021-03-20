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
public class Filme {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String diretor;
	private String genero;
	private String duracao;
	private String distribuidora;
//	private Date lancamento;
	
	public Filme(String nome, String diretor, String genero, String duracao, String distribuidora) {
		this.nome = nome;
		this.diretor = diretor;
		this.genero = genero;
		this.duracao = duracao;
		this.distribuidora = distribuidora;
	}
	
}
