package com.starter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.starter.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	<T> List<T> findByProdCost(Double prodCost,Class<T> cls);
	
	interface myData{
		String getProdCode();
		Integer getProdId();
	}
	
	interface myView{
		String getProdCode();
		Double getProdCost();
	}
	
	
}
