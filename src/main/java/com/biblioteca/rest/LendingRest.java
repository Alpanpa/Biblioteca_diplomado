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
import com.biblioteca.controller.LendingController;
import com.biblioteca.model.Lending;

@RestController
@RequestMapping("prestamos")

public class LendingRest {

	@Autowired
	private LendingController lendingController;
	
	@PostMapping("/guardar")
	public void saveLending(@RequestBody Lending lending) {
		lendingController.save(lending);
	}
	
	@GetMapping("/listar")
	public List<Lending> List(){
		return lendingController.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void delete(@PathVariable("id") Integer id) {
		lendingController.deleteById(id);
	}

	@PutMapping("/actualizar")
	public void update(@RequestBody Lending user) {
		lendingController.save(user);
	}
}
