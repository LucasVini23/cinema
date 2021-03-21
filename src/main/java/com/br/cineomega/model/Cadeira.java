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
public class Cadeira {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String numeracao;
	private Boolean disponivel;
	
	public Cadeira(String numeracao, Boolean disponivel) {
		this.numeracao = numeracao;
		this.disponivel = disponivel;
	}

}
