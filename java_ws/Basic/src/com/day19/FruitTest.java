package com.day19;

public class FruitTest {

	public static void main(String[] args) {
		FruitSeller seller1 = new FruitSeller(0, 30, 1500); 
		System.out.println("���� �Ǹ����� ���� ��Ȳ"); 
		seller1.showSaleResult();
		
		FruitBuyer buyer = new FruitBuyer(10000); //money

		buyer.buyApple(seller1, 6500); 

		System.out.println("\n���� �������� ���� ��Ȳ"); 
		buyer.showBuyResult();
		
		System.out.println();
		
		seller1.showSaleResult();
		System.out.println("�Ž�����:" +seller1.leftOver(buyer));

	}

}
