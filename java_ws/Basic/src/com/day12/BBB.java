package com.day12;

public class BBB {
	private String pdName;
	int price;
	protected String company;
	private int mileage;
	
	public void showInfo() {
		System.out.println(pdName);
		System.out.println(price);
		System.out.println(company);
		System.out.println(mileage);
	}
}

class CCC {
	public void showInfo() {
		System.out.println("ccc클래서 메소드");
	}
}
