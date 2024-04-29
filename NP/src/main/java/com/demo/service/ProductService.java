package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService 
{
	Product save(Product p);
	
	
	Product createProduct(Product p, int cid);
	Product findByPid(int pid);
	Product updateByPid(Product p, int pid, int cid) ;
	List<Product>findAll();
	int deleteByPid(int pid);
	
}
