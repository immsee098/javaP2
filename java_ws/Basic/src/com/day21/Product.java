package com.day21;

public class Product {
	private int code;
	private String pdName;
	private int price;
	
	Product(int code, String pdName, int price){
		this.code = code;
		this.pdName = pdName;
		this.price = price;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public void setName(String pdName) {
		this.pdName = pdName;
	}
	
	public void price(int price) {
		this.price = price;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getName() {
		return pdName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String toString() {
		return "Prouct : " + pdName + " ("+ code + ") / " + price;
	}
}
