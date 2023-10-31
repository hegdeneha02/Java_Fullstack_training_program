package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
 private int id;

 private String product;
 private int price;
 
 
public Order() {
	super();
	
}
public Order(int id, String product, int price) {
	super();
	this.id = id;

	this.product= product;
	this.price = price;
	
}
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}



public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

@Override
public String toString() {
	return "Order [id=" + id + ", product=" + product + ", customer_id="
			+ price  + "]";
}

 
}
