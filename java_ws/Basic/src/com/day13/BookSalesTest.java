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
			System.out.println("책 제목, 수량, 단가 입력");
			String title = sc.nextLine();
			int qty = sc.nextInt();
			int price = sc.nextInt();
			
			
			BookSales bs = new BookSales(title, qty, price);
			bs.findSalesPrice();
			bs.findTotalPrice();
			
			System.out.println("판매금액 : " + bs.getSalesPrice());
			System.out.println("누적 판매금액 : " + BookSales.getTotalPrice());
			
			System.out.println("그만하려면 q입력");
			sc.nextLine();
			
			String quit = sc.nextLine();
			if(quit.equalsIgnoreCase("Q")) break;
		}//while

	}

}
