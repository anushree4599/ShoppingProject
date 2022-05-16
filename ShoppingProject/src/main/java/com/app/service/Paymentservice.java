package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Payment;
import com.app.repository.Paymentrepository;

@Service
@Transactional
public class Paymentservice {
	@Autowired
    Paymentrepository pr;
	
	public List<Payment> prodlist()
	{
		return pr.findAll();
	}
}
