package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Product;
import com.demo.service.ProductService;

@RestController
public class ProductController 
{
@Autowired
 private ProductService ps;
	
@PostMapping(value="/api/products")
 public Product addProduct(@RequestBody Product p, @RequestParam("a") int cid)
 {
	
	 return ps.createProduct(p, cid);
 }
@GetMapping(value="/api/products")
public Product getByPid(@RequestParam("pid") int pid)
{
	return ps.findByPid(pid);
	
}
@PutMapping(value="/api/products")
public Product modifyByidandcid(@RequestBody Product p, @RequestParam("pid")int pid, @RequestParam("cid")int cid)
{
	return ps.updateByPid(p, pid, cid);
	
}

@GetMapping(value="/api/products/page=2")
public List<Product> getAll()
{
	return ps.findAll();
}

@DeleteMapping(value="/api/products")
public int removeByPid(@RequestParam("pid")int pid)
{
	return ps.deleteByPid(pid);
}
 
}
