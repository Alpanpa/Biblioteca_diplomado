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
import com.biblioteca.controller.BookController;
import com.biblioteca.model.Book;

@RestController
@RequestMapping("libros")

public class BookRest {
	
	@Autowired
	private BookController bookController;
	
	@PostMapping("/guardar")
	public void saveBook(@RequestBody Book book) {
		bookController.save(book);
	}
	
	@GetMapping("/listar")
	public List<Book> List(){
		return bookController.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void delete(@PathVariable("id") Integer id) {
		bookController.deleteById(id);
	}

	@PutMapping("/actualizar")
	public void update(@RequestBody Book user) {
		bookController.save(user);
	}
}
