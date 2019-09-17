package com.day19;

import java.util.Scanner;

abstract class Product{
	protected int price;
	protected int bonusPoint; //가격의 2%가 포인트
	public final double POINT_RATE = 0.02;
	
	Product(int price){
		this.price = price;
		this.bonusPoint = (int)(price*POINT_RATE);
	}
	
	public abstract String findInfo();
}

class TV extends Product{
	
	TV(int price){
		super(price);
	}
	
	public String findInfo() {
		return "TV";
	}
	
}

class Computer extends Product{
	Computer(int price){
		super(price);
	}
	
	public String findInfo() {
		return "Computer";
	}
	
}

class Buyer{
	private int myMoney;
	private int point;
	//구매한 상품을 배열에 저장
	private Product[] pdArr = new Product[20];
	private int index;
	
	Buyer(int myMoney) {
		this.myMoney = myMoney;
	}
	
	public void buy(Product p) {
		if(myMoney<p.price) {
			System.out.println("돈이 모자라 구입 불가능");
			return;
		}
		
		myMoney-=p.price;
		point+=p.bonusPoint;
		System.out.println(p.findInfo()+ "를 구매함");
		
		pdArr[index++]=p;
	}
	
	public void showInfo() {
		System.out.println("보유자산:"+myMoney);
		System.out.println("포인트:"+point+"\n");
	}
	
	public void summary() {
		int total = 0;
		String pd = "";
		
		for(int i=0; i<index; i++) {
			total+=pdArr[i].price;
			pd+=pdArr[i].findInfo();
			if(i<index-1) {
				pd+=",";
			}
		}
		
		System.out.println("구입하신 물건의 총 금액:"+total+"만원");
		System.out.println("구입하신 제품은"+pd+"입니다.");
	}
	
}

public class PolymoArgsBuyer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Buyer b = new Buyer(1000); 
		while (true){ 
			System.out.println("1. 상품 구매 2. 구매내역 조회 3. 종료"); 
			int type = sc.nextInt(); 
			
			switch (type) { 
				case 1: 
					System.out.println("\n구매할 상품을 선택하세요 (1. TV 2. Computer)");
					int kind = sc.nextInt(); 
					if (kind!=1 && kind!=2){ 
						System.out.println("구매할 상품을 다시 선택하세요\n"); 
						continue; 
						}
					System.out.println("상품가격을 입력하세요"); 
					int price = sc.nextInt();
					Product p =null; if (kind==1){ 
						p = new TV(price); 
						} else if (kind==2) { 
							p = new Computer(price); 
						}
					b.buy(p);  
					b.showInfo(); 
					break;
				case 2:
				b.summary(); 
				break;
				case 3:
				System.out.println("프로그램을 종료합니다\n"); 
				return;
				default:
				System.out.println("다시 선택하세요\n"); 
				continue;
			}
		}//switch
		}//while
	}

