package com.br.cineomega.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.br.cineomega.model.Cadeira;
import com.br.cineomega.model.Cliente;
import com.br.cineomega.model.Filme;
import com.br.cineomega.repository.CadeiraRepository;
import com.br.cineomega.repository.ClienteRepository;
import com.br.cineomega.repository.FilmeRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private FilmeRepository filmeRepository;
	
	@Autowired
	private CadeiraRepository cadeiraRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Filme filme1 = new Filme("Mortal Kombat", "Simon Mcquoid", "Ação", "Em Breve", "Warner Bros");
		Filme filme2 = new Filme("A Vida Secreta de Walter Mitty", "Ben Stiller", "Comédia/Fantasia", "1h 54min", "20th Century Studios");
		Filme filme3 = new Filme("Zack Snyder's Justice League", "Zack Snyder", "Ação, Fantasia, Aventura", "4h 2m", "Warner Bros");
		
		filmeRepository.saveAll(Arrays.asList(filme1, filme2, filme3));
		
		Cadeira a1 = new Cadeira("A1", false);
		Cadeira h2 = new Cadeira("H2", false);
		Cadeira g3 = new Cadeira("G3", false);
		Cadeira p10 = new Cadeira("P10", false);
		Cadeira e5 = new Cadeira("E5", false);
		
		cadeiraRepository.saveAll(Arrays.asList(a1, h2, g3, p10, e5));
		
		Cliente cliente1 = new Cliente("Lucas Vinicius", 20, "lucas@gmail.com", "00000000000");
		Cliente cliente2 = new Cliente("Bruno Henrique", 24, "lucas@gmail.com", "00000000000");
		
		clienteRepository.saveAll(Arrays.asList(cliente1, cliente2));
		
		
		
	}

}
