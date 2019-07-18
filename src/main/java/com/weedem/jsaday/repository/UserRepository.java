package com.weedem.jsaday.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.weedem.jsaday.model.User;

@Component
public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByNome(String nome);

}
