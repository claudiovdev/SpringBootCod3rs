package com.Cod3rs.SpringBoot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Cod3rs.SpringBoot.models.Produto;
import com.Cod3rs.SpringBoot.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api")
public class ProdutoController {
	
	@Autowired
	ProdutoRepository produtoRepository;

	@PostMapping("/produto")
	public Produto novoProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	
}
