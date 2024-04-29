package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> 
{
	// to insert a new product
	Product save(Product p);
	
	// to get or find a product by its id
	Product findByPid(long pid);
	//@Query(value="update Product set pname=?1, price=?2, category_id=?3 where id = ?4", nativeQuery=true)
	//Product updateProductByPid(Product p, long pid, long cid);
	
	//Method to get all products
	List<Product>findAll();
	
	// method to delete a product by using its id
	int deleteByPid(long pid);
	

}
