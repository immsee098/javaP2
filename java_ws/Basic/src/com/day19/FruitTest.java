package com.day19;

public class FruitTest {

	public static void main(String[] args) {
		FruitSeller seller1 = new FruitSeller(0, 30, 1500); 
		System.out.println("과일 판매자의 현재 상황"); 
		seller1.showSaleResult();
		
		FruitBuyer buyer = new FruitBuyer(10000); //money

		buyer.buyApple(seller1, 6500); 

		System.out.println("\n과일 구매자의 현재 상황"); 
		buyer.showBuyResult();
		
		System.out.println();
		
		seller1.showSaleResult();
		System.out.println("거스름돈:" +seller1.leftOver(buyer));

	}

}
