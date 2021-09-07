package com.devj.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devj.domain.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
