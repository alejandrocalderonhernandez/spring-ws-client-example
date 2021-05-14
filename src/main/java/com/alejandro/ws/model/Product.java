package com.alejandro.ws.model;

import java.io.Serializable;
import java.util.Arrays;

public class Product implements Serializable {

	private Long id;
	private String name;
	private Double price;
	private Boolean available;
	private byte[] img;
	
	public Product() {}
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public byte[] getImg() {
		return img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", available=" + available + ", img="
				+ Arrays.toString(img) + "]";
	}


	private static final long serialVersionUID = 1L;

}
