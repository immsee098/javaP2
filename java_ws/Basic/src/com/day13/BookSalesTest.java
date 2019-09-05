package com.day13;

import java.util.Scanner;

class BookSales{
	private String title;
	private int qty;
	private int price;
	private int salesPrice;
	private static int totalPrice;
	
	BookSales(String title, int qty, int price){
		this.title = title;
		this.qty = qty;
		this.price = price;
	}
	
	
	public int getSalesPrice() {
		return salesPrice;
	}
	
	public static int getTotalPrice() {
		return totalPrice;
	}
	
	
	public void findSalesPrice() {
		salesPrice = qty*price;
	}
	
	public void findTotalPrice() {
		totalPrice += salesPrice;
	}
	
}

public class BookSalesTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("å ����, ����, �ܰ� �Է�");
			String title = sc.nextLine();
			int qty = sc.nextInt();
			int price = sc.nextInt();
			
			
			BookSales bs = new BookSales(title, qty, price);
			bs.findSalesPrice();
			bs.findTotalPrice();
			
			System.out.println("�Ǹűݾ� : " + bs.getSalesPrice());
			System.out.println("���� �Ǹűݾ� : " + BookSales.getTotalPrice());
			
			System.out.println("�׸��Ϸ��� q�Է�");
			sc.nextLine();
			
			String quit = sc.nextLine();
			if(quit.equalsIgnoreCase("Q")) break;
		}//while

	}

}
