package com.demo.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int cid;
	private String cname;
	private String scity;
	@OneToMany(mappedBy="category")
	private List<Product> products;
	@Override
	public String toString() {
		return "Category [id=" + cid + ", cname=" + cname + "]";
	}
	public long getId() {
		return cid;
	}
	public void setId(int id) {
		this.cid = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
}
