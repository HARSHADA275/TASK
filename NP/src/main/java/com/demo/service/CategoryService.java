package com.demo.service;

import java.util.List;

import com.demo.model.Category;

public interface CategoryService {
	
	Category save(Category c);
	Category findByCid(int id);
	List<Category> findAll();
	int deleteByCid(int cid);
	Category updateByCid(Category c, int cid);
}
