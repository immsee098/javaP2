package com.day22;

import java.util.ArrayList;
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
	private ArrayList<Product> list = new ArrayList<Product>(); //Product������ ��̸���Ʈ�� ����
	
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
		
		list.add(p);
	}
	
	public void showInfo() {
		System.out.println("�����ڻ�:"+myMoney);
		System.out.println("����Ʈ:"+point+"\n");
	}
	
	public void summary() {
		if(list.isEmpty()) {
			System.out.println("������ ��ǰ�� �����ϴ�.");
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
		
		System.out.println("�����Ͻ� ������ �� �ݾ�:"+total+"����");
		System.out.println("�����Ͻ� ��ǰ��"+pd+"�Դϴ�.");
	}
	
	//��ǰ ��ȯ
	public void refund(Product p) {
		//public boolean remove(Object p)
		if(list.remove(p)) {
			//���� ����=> ��ǰ ��ȯó��
			myMoney+=p.price;
			point-=p.bonusPoint;
			System.out.println(p.findInfo()+"�� ��ǰ�ϼ̽��ϴ�.");
		}else {
			System.out.println("�ش� ��ǰ�� �������� �ʾ� ��ǰ�� �� �����ϴ�.");
		}
	}
	
}

public class PolymoArgsBuyer {

	public static void main(String[] args) {
		//������ 1000���� ����
		Buyer b =new Buyer(1000);
		
		//150���� ��ǻ�� ����, showInfo
		
		//200���� TB����,showInfo
		Product tv1 = new TV(200);
		b.buy(tv1);
		b.showInfo();
		
		//300���� TV����, showInfo
		Product tv2 = new TV(300);
		b.buy(tv2);
		b.showInfo();
		
		//summary ȣ��
		
		//200���� TV��ǰ, showInfoȣ��
		b.refund(tv2);
		b.showInfo();
		
		//summary ȣ��
		
	
		}
	}

