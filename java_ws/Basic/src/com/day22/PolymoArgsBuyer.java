package com.day22;

import java.util.ArrayList;
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
	private ArrayList<Product> list = new ArrayList<Product>(); //Product내용을 어레이리스트에 저장
	
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
		
		list.add(p);
	}
	
	public void showInfo() {
		System.out.println("보유자산:"+myMoney);
		System.out.println("포인트:"+point+"\n");
	}
	
	public void summary() {
		if(list.isEmpty()) {
			System.out.println("구매한 상품이 없습니다.");
			return;
		}
		
		int total = 0;
		String pd = "";
		
		for(int i=0; i<list.size(); i++) {
			Product p = list.get(i);
			total+=p.price;
			pd+=p.findInfo();
			
			if(i<list.size()-1) {
				pd+=",";
			}
		}
		
		System.out.println("구입하신 물건의 총 금액:"+total+"만원");
		System.out.println("구입하신 제품은"+pd+"입니다.");
	}
	
	//상품 반환
	public void refund(Product p) {
		//public boolean remove(Object p)
		if(list.remove(p)) {
			//삭제 성공=> 상품 반환처리
			myMoney+=p.price;
			point-=p.bonusPoint;
			System.out.println(p.findInfo()+"를 반품하셨습니다.");
		}else {
			System.out.println("해당 상품이 존재하지 않아 반품할 수 없습니다.");
		}
	}
	
}

public class PolymoArgsBuyer {

	public static void main(String[] args) {
		//구매자 1000만원 보유
		Buyer b =new Buyer(1000);
		
		//150만원 컴퓨터 구매, showInfo
		
		//200만원 TB구매,showInfo
		Product tv1 = new TV(200);
		b.buy(tv1);
		b.showInfo();
		
		//300만원 TV구매, showInfo
		Product tv2 = new TV(300);
		b.buy(tv2);
		b.showInfo();
		
		//summary 호출
		
		//200만원 TV반품, showInfo호출
		b.refund(tv2);
		b.showInfo();
		
		//summary 호출
		
	
		}
	}

