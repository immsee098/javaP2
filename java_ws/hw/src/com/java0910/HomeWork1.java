package com.java0910;

import java.util.Scanner;

class FoodSale{
	private String menu;
	protected int qty;
	protected int price;
	protected int sell; //�ǸŰ���
	protected int total;
	
	FoodSale(String menu, int qty, int price) {
		this.menu =menu;
		this.price =price;
		this.qty=qty;
	}
	
	int sold() {
		sell = qty*price;
		return sell;
	}
	
	int totalsold() {
		total += sell;
		return total;
	}
	
	
}

class StudentFoodSale extends FoodSale {
	private int salePrice;
	private int saleTotal; 
	private final float discount = 0.1f;
	
	StudentFoodSale(String menu, int qty, int price){
		super(menu, qty, price);
	}
	
	int sold() {
		salePrice = (int)(qty*price*discount);
		sell = qty*price-salePrice;
		return sell;
	}
	
	int totalsold() {
		total += sell;
		return total;
	}
	
	int sumSale() {
		saleTotal += salePrice;
		return saleTotal;
	}
	
}

public class HomeWork1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�޴�, ����, �ܰ�, �л�����<Y/N>�� �Է��ϼ���!");
			String menu = sc.next();
			int qty = sc.nextInt();
			sc.nextLine();
			int price = sc.nextInt();
			sc.nextLine();
			String yesno = sc.nextLine();
			
			switch(yesno) {
			case "y": 
			case "Y":
				StudentFoodSale food = new StudentFoodSale(menu, qty, price);
				System.out.println("�Ǹűݾ� = "+food.sold()
				+", ���� �Ǹűݾ� = "+food.totalsold()+", �������αݾ� = "+food.sumSale());
				break;
			case "n": 
			case"N":
				FoodSale fo = new FoodSale(menu, qty, price);
				System.out.println("�Ǹűݾ� = "+fo.sold()+", �����Ǹűݾ� = "
						+ fo.totalsold());
				break;
			default:
				System.out.println("�߸��Է���");
				continue;
		}
		System.out.println("�׸� : Q");
		String quit = sc.next();
		if(quit.equalsIgnoreCase("q")) break;
		}
		

	}

}
