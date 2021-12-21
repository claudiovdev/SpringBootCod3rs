package com.Cod3rs.SpringBoot.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Cod3rs.SpringBoot.models.Produto;

@RestController
@RequestMapping("/api")
public class ProdutoController {

	@PostMapping("/produtos")
	public Produto novoProduto(@RequestParam String nome) {
		Produto produto = new Produto(nome);
		return produto;
	}
}
