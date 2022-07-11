package com.biblioteca.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.model.User;

public interface UserController extends JpaRepository<User, Integer> {

}
