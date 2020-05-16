package com.student.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "order_db")
public class User {
	
	@Id
	private int id;
	private String name;
	private String gender;
	private List<Product> product;
	private Address address;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, String gender, List<Product> product, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.product = product;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
}