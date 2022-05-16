package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Products;
import com.app.repository.Productsrepository;

@Service
@Transactional
public class Productsservice {
	@Autowired
    Productsrepository pr;
	
	public List<Products> prodlist()
	{
		return pr.findAll();
	}
}
