package com.weedem.jsaday.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.weedem.jsaday.model.Droga;

@Component
public interface DrogaRepository extends JpaRepository<Droga, Long>{
	
	Droga findByNome(String nome);

}
