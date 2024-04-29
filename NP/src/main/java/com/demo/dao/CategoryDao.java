package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Category;

@Repository
public interface CategoryDao extends JpaRepository<Category, Long>
{   
	// method to insert a new category into a table
	Category save(Category c);
	//  method to find or get a category by its id
	Category findByCid(long id);
	// method to get all categories
	List<Category> findAll();
	// method to delete category by its id
	int deleteByCid(long cid);
}
