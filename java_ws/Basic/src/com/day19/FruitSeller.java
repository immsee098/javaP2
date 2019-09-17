package com.day19;

class FruitSeller{ 
	private int numOfApple;  
	private int myMoney;  
	private final int APPLE_PRICE;  

	FruitSeller(int money, int appleNum, int price){ 
		myMoney=money; 
		numOfApple=appleNum; 
		APPLE_PRICE=price;  
		}
	
	public int saleApple(int money){  
		int num=money/APPLE_PRICE; 
		
		numOfApple-=num; 
		myMoney+=money; 
		
		return num;  
		}
	
	public int leftOver(FruitBuyer buyer) {
		int count = buyer.apples() * APPLE_PRICE;
		return buyer.moneys() % count;
	}
	
public void showSaleResult(){ 
	System.out.println("남은 사과: " + numOfApple); 
	System.out.println("판매 수익: " + myMoney); 
	
	}
} 
