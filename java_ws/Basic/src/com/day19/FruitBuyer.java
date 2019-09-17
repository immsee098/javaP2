package com.day19;

class FruitBuyer{  
	private int myMoney;   
	private int numOfApple;  
	
	public FruitBuyer(int money){ 
		myMoney=money; 
		numOfApple=0; 
		}
	public void buyApple(FruitSeller seller, int money){ 
		numOfApple+=seller.saleApple(money); 
		myMoney-=money;
	} 
	
	public int apples() {
		return numOfApple;
	}
	
	public int moneys() {
		return myMoney;
	}
	
	public void showBuyResult() { 
		System.out.println("현재 잔액: " + myMoney); 
		System.out.println("사과 개수: " + numOfApple); 
		}
	}