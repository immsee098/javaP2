package com.day13;

class BankAccount {
	private int balance;
	public static final double INTEREST = 0.02; //������
	private static int totalBalance; //�� ������ �����հ�
	
	/*
	 static���� (Ŭ��������)
	 - Ŭ���� �������� �ϳ��� �����Ǿ� ��� ��ü�� ������
	 - Ŭ������.static����
	 - ��ü ������ ������, ��ü�� �ƹ��� ���Ƶ� �ϳ��� �����ǰ�, ��ü�� �������� �ʾƵ� �ϳ� ������
	 - �ش� Ŭ������ �޸𸮿� �ε�� ���� static ������ ������(�޸��� �޼��� ������ ����)
	 - ���α׷��� ����� �� �Ҹ��
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
		
		System.out.println("���ڷ� : "+BankAccount.INTEREST); //Ŭ������.static����
		
		System.out.println("�� ���� ���� �հ� : " + BankAccount.getTotalBalance());
		
		System.out.println("1�� ���� : "+ba1.getBalance());
		System.out.println("2�� ���� : "+ba2.getBalance());
		System.out.println("3�� ���� : "+ba3.getBalance());
	}

}
