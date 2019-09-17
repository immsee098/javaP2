package com.day19;

import java.util.Scanner;

abstract class Product{
	protected int price;
	protected int bonusPoint; //������ 2%�� ����Ʈ
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
	//������ ��ǰ�� �迭�� ����
	private Product[] pdArr = new Product[20];
	private int index;
	
	Buyer(int myMoney) {
		this.myMoney = myMoney;
	}
	
	public void buy(Product p) {
		if(myMoney<p.price) {
			System.out.println("���� ���ڶ� ���� �Ұ���");
			return;
		}
		
		myMoney-=p.price;
		point+=p.bonusPoint;
		System.out.println(p.findInfo()+ "�� ������");
		
		pdArr[index++]=p;
	}
	
	public void showInfo() {
		System.out.println("�����ڻ�:"+myMoney);
		System.out.println("����Ʈ:"+point+"\n");
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
		
		System.out.println("�����Ͻ� ������ �� �ݾ�:"+total+"����");
		System.out.println("�����Ͻ� ��ǰ��"+pd+"�Դϴ�.");
	}
	
}

public class PolymoArgsBuyer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Buyer b = new Buyer(1000); 
		while (true){ 
			System.out.println("1. ��ǰ ���� 2. ���ų��� ��ȸ 3. ����"); 
			int type = sc.nextInt(); 
			
			switch (type) { 
				case 1: 
					System.out.println("\n������ ��ǰ�� �����ϼ��� (1. TV 2. Computer)");
					int kind = sc.nextInt(); 
					if (kind!=1 && kind!=2){ 
						System.out.println("������ ��ǰ�� �ٽ� �����ϼ���\n"); 
						continue; 
						}
					System.out.println("��ǰ������ �Է��ϼ���"); 
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
				System.out.println("���α׷��� �����մϴ�\n"); 
				return;
				default:
				System.out.println("�ٽ� �����ϼ���\n"); 
				continue;
			}
		}//switch
		}//while
	}

