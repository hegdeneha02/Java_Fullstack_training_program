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
	   private String dateOfPurchase;
	   private int total;
	   private int customer_id;
	   private String paymentMode;
	public Order() {
		super();
		
	}
	public Order(int id, String dateOfPurchase, int total, int customer_id, String paymentMode) {
		super();
		this.id = id;
		this.dateOfPurchase = dateOfPurchase;
		this.total = total;
		this.customer_id = customer_id;
		this.paymentMode = paymentMode;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(String dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", dateOfPurchase=" + dateOfPurchase + ", total=" + total + ", customer_id="
				+ customer_id + ", paymentMode=" + paymentMode + "]";
	}
	   
}
