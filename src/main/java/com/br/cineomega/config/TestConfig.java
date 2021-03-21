package com.br.cineomega.config;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.br.cineomega.model.Cadeira;
import com.br.cineomega.model.Cliente;
import com.br.cineomega.model.Filme;
import com.br.cineomega.model.Ingresso;
import com.br.cineomega.repository.CadeiraRepository;
import com.br.cineomega.repository.ClienteRepository;
import com.br.cineomega.repository.FilmeRepository;
import com.br.cineomega.repository.IngressoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private FilmeRepository filmeRepository;
	
	@Autowired
	private CadeiraRepository cadeiraRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private IngressoRepository ingressoRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		Filme filme1 = new Filme("Mortal Kombat", "Simon Mcquoid", "Ação", "Em Breve", "Warner Bros", 2021);
		Filme filme2 = new Filme("A Vida Secreta de Walter Mitty", "Ben Stiller", "Comédia/Fantasia", "1h 54min", "20th Century Studios", 2013);
		Filme filme3 = new Filme("Zack Snyder's Justice League", "Zack Snyder", "Ação, Fantasia, Aventura", "4h 2m", "Warner Bros", 2021);
		
		filmeRepository.saveAll(Arrays.asList(filme1, filme2, filme3));
		
		Cadeira a1 = new Cadeira("A1", false);
		Cadeira h2 = new Cadeira("H2", false);
		Cadeira g3 = new Cadeira("G3", false);
		Cadeira p10 = new Cadeira("P10", false);
		Cadeira e5 = new Cadeira("E5", false);
		
		cadeiraRepository.saveAll(Arrays.asList(a1, h2, g3, p10, e5));
		
		Cliente cliente1 = new Cliente("Lucas Vinicius", LocalDate.parse("29-04-2000", DateTimeFormatter.ofPattern("dd-MM-yyyy")), "lucas@gmail.com", "00000000000");
		Cliente cliente2 = new Cliente("Bruno Henrique", LocalDate.parse("30-08-1996", DateTimeFormatter.ofPattern("dd-MM-yyyy")), "bruno@gmail.com", "00000000000");
		
		clienteRepository.saveAll(Arrays.asList(cliente1, cliente2));
		
		Ingresso ingresso = new Ingresso(filme1, h2, LocalTime.parse("11:59:59", DateTimeFormatter.ofPattern("HH:mm")), LocalDate.parse("29-04-2000", DateTimeFormatter.ofPattern("dd-MM-yyyy")), cliente1);
		Ingresso ingresso1 = new Ingresso(filme1, g3, LocalTime.parse("11:00:00", DateTimeFormatter.ofPattern("HH:mm")), LocalDate.parse("29-04-2000", DateTimeFormatter.ofPattern("dd-MM-yyyy")), cliente1);
		Ingresso ingresso2 = new Ingresso(filme1, a1, LocalTime.parse("11:00:00", DateTimeFormatter.ofPattern("HH:mm")), LocalDate.parse("29-04-2000", DateTimeFormatter.ofPattern("dd-MM-yyyy")), cliente1);
		
		ingressoRepository.saveAll(Arrays.asList(ingresso, ingresso1, ingresso2));
		
		
	}

}
