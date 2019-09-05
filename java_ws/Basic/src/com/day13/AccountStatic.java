package com.day13;

class BankAccount {
	private int balance;
	public static final double INTEREST = 0.02; //이자율
	private static int totalBalance; //각 계좌의 원금합계
	
	/*
	 static변수 (클래스변수)
	 - 클래스 차원에서 하나만 생성되어 모든 객체가 공유함
	 - 클래스명.static변수
	 - 객체 생성과 무관함, 객체가 아무리 많아도 하나만 생성되고, 객체가 생성되지 않아도 하나 생성됨
	 - 해당 클래스가 메모리에 로드되 ㄹ대 static 변수도 생성됨(메모리의 메서드 영역에 생성)
	 - 프로그램이 종료될 때 소멸됨
	 */
	
	BankAccount(int balance) {
		this.balance=balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public static int getTotalBalance() {
		return totalBalance;
	}
	
	public void findTotalBalance() {
		totalBalance += balance;
	}
}

public class AccountStatic {

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount(100000);
		ba1.findTotalBalance();
	
		BankAccount ba2 = new BankAccount(300000);
		ba2.findTotalBalance();

		BankAccount ba3 = new BankAccount(500000);
		ba3.findTotalBalance();
		
		System.out.println("이자률 : "+BankAccount.INTEREST); //클래스명.static변수
		
		System.out.println("각 계좌 원금 합계 : " + BankAccount.getTotalBalance());
		
		System.out.println("1번 계좌 : "+ba1.getBalance());
		System.out.println("2번 계좌 : "+ba2.getBalance());
		System.out.println("3번 계좌 : "+ba3.getBalance());
	}

}
