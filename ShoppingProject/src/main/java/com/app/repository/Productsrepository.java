package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Products;

public interface Productsrepository extends JpaRepository<Products,Integer>{



}
