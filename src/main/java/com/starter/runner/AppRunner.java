package com.starter.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.starter.repository.ProductRepository;
import com.starter.repository.ProductRepository.myData;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	ProductRepository repo;
	@Override
	public void run(String... args) throws Exception {

		repo.findByProdCost(7.7, myData.class)
		.forEach(p->System.out.println(p.getProdCode()));
	}

}
