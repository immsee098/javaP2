package com.java0917;

import java.util.*;
class Account{
	protected String num;
	protected double balance;
	
	Account(String num, double balance){
		this.num = num;
		this.balance = balance;
	}

	public void withdraw(double money) {
		balance -= money;
		
	}
	
	public void display() {
		System.out.println("���¹�ȣ : "+num);
		System.out.println("�ܾ� : "+balance);
	}

	public void deposit(double money) {
		balance += money; 
		
	}
}

class FaithAccount extends Account{
	
	FaithAccount(String num, double balance){
		super(num,balance+=balance*0.01);
	}
	
	public void deposit(double money) {
		balance += money+(money*0.01);
	}
}

class ContriAccount extends Account{
	
	private static double contribution;
	
	ContriAccount(String num, double balance){
		super(num,balance-=balance*0.01);
		contribution=balance*0.01;
	}
	
	public void deposit(double money) {
		super.deposit(money-money*0.01);
		contribution+=money*0.01;
	}
	
	public void display() {
		System.out.println("���� ��ȣ : "+num);
		System.out.println("���� �ܾ� : "+balance);
		System.out.println("�� ��ξ� : "+contribution);
	}
}

public class HomeWork1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Account ac= null;
		
		System.out.println("������ �������� - �Ϲݰ���(A), �ſ����(F), ��ΰ���(C), ���¹�ȣ, �ܾ��� �Է��� �ֽʽÿ�.");
		String type = sc.nextLine();
		String num = sc.nextLine();
		Double balance = sc.nextDouble();
		
		if(type.equalsIgnoreCase("A")) {
			ac= new Account(num, balance);
		}else if (type.equalsIgnoreCase("F")) {
			ac= new FaithAccount(num, balance);
		}else if (type.equalsIgnoreCase("C") ) {
			ac = new ContriAccount(num, balance);
		}
		
		ac.display();
		
		System.out.println("�Ա��� �ݾ��� �Է��ϼ���.");
		double money = sc.nextDouble();
		ac.deposit(money);
		ac.display();
	}
}


