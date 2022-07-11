package com.biblioteca.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.model.Book;


public interface BookController extends JpaRepository<Book, Integer> {

}
