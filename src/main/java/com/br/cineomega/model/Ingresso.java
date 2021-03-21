package com.br.cineomega.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Ingresso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	private Filme filme;
	@OneToOne
	private Cadeira cadeiras;
//	@JsonFormat(pattern = "hh: mm: ss")
	@JsonFormat(pattern = "hh: mm")
	private LocalTime hora;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private LocalDate dia;
	@ManyToOne()
	@JoinColumn(name="id_cliente")
	private Cliente cliente;
	
	
	public Ingresso(Filme filme, Cadeira cadeiras, LocalTime hora, LocalDate dia, Cliente cliente) {
		super();
		this.filme = filme;
		this.cadeiras = cadeiras;
		this.hora = hora;
		this.dia = dia;
		this.cliente = cliente;
	}
	
	
	
	
	
	
	
	

}
