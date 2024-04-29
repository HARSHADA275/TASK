package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.ProductDao;
import com.demo.model.Category;
import com.demo.model.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	public ProductDao pd;
	
	@Autowired
	 CategoryService cs;
	Product product = new Product();
	

	@Override
	public Product save(Product p) {
		
		return pd.save(p);
	}
	
  public  Product createProduct(Product p, int cid)
  {
	 
	  Category c = cs.findByCid(cid);
	
	  p.setCategory(c);
	  System.out.print(p);
	  
	  return pd.save(p);
	  
  }

@Override
public Product findByPid(int pid) {

	return pd.findByPid(pid);
}


public Product updateByPid(Product p,int pid, int cid) 
{
	Product p1 = pd.findByPid(pid);
	Category c = cs.findByCid(cid);
	p.setPname(p1.getPname());
	p.setPrice(p1.getPrice());
	p.setCategory(c);
	
	return pd.save(p);
}

@Override
public List<Product> findAll() {

	return pd.findAll();
}

@Override
public int deleteByPid(int pid) {
	
	return pd.deleteByPid(pid);
}
}
