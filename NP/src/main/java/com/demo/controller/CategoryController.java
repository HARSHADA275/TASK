package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Category;
import com.demo.service.CategoryService;

@RestController
@RequestMapping
public class CategoryController {
    @Autowired
	public CategoryService cs;
    

    @PostMapping(value="/api/categories")
    public Category addCategory(@RequestBody Category c)
    {
    	return cs.save(c);
    }
    
   
    @GetMapping(value="/api/categories")
    public Category getByCid(@RequestParam("cid") int cid)
    {
    	return cs.findByCid(cid);
    }
    

    @GetMapping(value="api/categories/page=3")
    public List<Category> getAll()
    {
    	return cs.findAll();
    }
   

    @DeleteMapping(value="api/categories")
    public int removeById(@RequestParam("cid") int cid)
    {
    	return cs.deleteByCid(cid);
    }
    
  
    @PutMapping(value="api/categories")
    public Category modifyByCid(@RequestBody Category c , @RequestParam("cid") int cid)
    {
    	return cs.updateByCid(c, cid);
    }
    

    @PutMapping(value="/m")
    public Category modifyCategory(@RequestBody Category c,@RequestParam("cid") int cid)
    {
    	Category c1 = cs.findByCid(cid);
    	return cs.save(c);
    }
}
