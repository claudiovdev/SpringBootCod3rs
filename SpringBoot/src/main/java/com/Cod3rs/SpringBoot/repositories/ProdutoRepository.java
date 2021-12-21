package com.Cod3rs.SpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Cod3rs.SpringBoot.models.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
