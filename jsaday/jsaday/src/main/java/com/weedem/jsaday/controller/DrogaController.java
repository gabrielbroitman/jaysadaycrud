package com.weedem.jsaday.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weedem.jsaday.model.Droga;
import com.weedem.jsaday.repository.DrogaRepository;

@RestController
@RequestMapping("/droga")
public class DrogaController {

	@Autowired
	private DrogaRepository drogaRepository;

	@GetMapping(value = "/all")
	public List<Droga> findAll() {
		return drogaRepository.findAll();
	}
	
	@GetMapping(value = "/{name}")
	public Droga findByName(@PathVariable final String nome) {
		return drogaRepository.findByNome(nome);	
	}
	
	@PostMapping(value = "/cadastro")
	public Droga  load(@RequestBody final Droga droga) {
		drogaRepository.save(droga);
		return drogaRepository.findByNome(droga.getNome());
	}

}