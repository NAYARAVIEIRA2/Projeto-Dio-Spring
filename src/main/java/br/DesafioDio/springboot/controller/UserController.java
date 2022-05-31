package br.DesafioDio.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.DesafioDio.springboot.entities.User;
import br.DesafioDio.springboot.repositorieis.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public List <User> findAll(){
     List<User> result = repository.findAll();
	return result;
     
}
	@GetMapping(value = "/{id}")
	public User findById(@PathVariable long id){
     User result = repository.findById(id).get();
	return result;
}
}