package com.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
private long pid;
private String pname;
private long price;
@ManyToOne
private Category category;
@Override
public String toString() {
	return "Product [id=" + pid + ", pname=" + pname + ", price=" + price + ", category=" + category + "]";
}
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public long getId() {
	return pid;
}
public void setId(long id) {
	this.pid = id;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public long getPrice() {
	return price;
}
public void setPrice(long price) {
	this.price = price;
}

}
