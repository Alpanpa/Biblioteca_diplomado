package com.biblioteca.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.model.Lending;

public interface LendingController extends JpaRepository<Lending, Integer> {

}
