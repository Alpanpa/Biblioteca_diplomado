package com.biblioteca.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.biblioteca.controller.UserController;
import com.biblioteca.model.User;

@RestController
@RequestMapping("usuarios")
public class UserRest {

	@Autowired
	private UserController userController;
	
	@PostMapping("/guardar")
	public void saveUser(@RequestBody User user) {
		userController.save(user);
	}
	
	@GetMapping("/listar")
	public List<User> List(){
		return userController.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void delete(@PathVariable("id") Integer id) {
		userController.deleteById(id);
	}

	@PutMapping("/actualizar")
	public void update(@RequestBody User user) {
		userController.save(user);
	}
}
