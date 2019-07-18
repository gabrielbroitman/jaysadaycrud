package com.weedem.jsaday.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weedem.jsaday.model.User;
import com.weedem.jsaday.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping(value = "/all")
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	@GetMapping(value = "/{name}")
	public User findByName(@PathVariable final String nome) {
		return userRepository.findByNome(nome);	
	}
	
	@PostMapping(value = "/load")
	public User load(@RequestBody final User user) {
		userRepository.save(user);
		return userRepository.findByNome(user.getNome());
	}

}
