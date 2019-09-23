package com.java0923;

import java.util.ArrayList;
import java.util.Scanner;

interface SpecialInterest {
    public void Special(String it);
}

class Account{
    protected int account;
    protected int balance;
    protected String name;

    Account(int account, int balance, String name) {
        this.account = account;
        this.balance = balance;
        this.name = name;
    }

    void setAccount(int account) {
        this.account = account;
    }

    void setBalance(int balance) {
        this.balance = balance;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAccount() {
        return account;
    }

    int getBalance() {
        return balance;
    }

    String getName() {
        return name;
    }

    void deposit(int input) {
        this.balance += input;
    }

    int withdraw(int output) {
        int a = 0;
        if (balance > output) {
            a = balance - output;
        } else {
        }
        return a;
    }

    void display() {
        System.out.println("���¹�ȣ:" + account);
        System.out.println("�ܾ�:" + balance);
        System.out.println("���̸�:" + name);
    }

}

class NormalAccount extends Account {
    protected final int interest;

    NormalAccount(int account, int balance, String name, int interest) {
        super(account, balance, name);
        this.interest = interest;
    }

    void deposit(int input) {
        double realInte = 0.01*interest;
        this.balance += (input*(1+realInte));
    }

    void display() {
        System.out.println("���¹�ȣ:" + account);
        System.out.println("�ܾ�:" + balance);
        System.out.println("���̸�:" + name);
        System.out.println("������:"+interest);
    }

}


class HighCreditAccount extends NormalAccount implements SpecialInterest{
    private String specialInt;
    private int int2;
    HighCreditAccount(int account, int balance, String name, int interest, String specialInt) {
        super(account, balance, name, interest);
        this.specialInt = specialInt;
    }

    public void Special(String it){
        if(it.equals("A")){
            this.int2 = 3;
        } else if(it.equals("B")){
            this.int2 = 2;
        } else if(it.equals("C")){
            this.int2 = 1;
        }
    }

    void deposit(int input) {
        double realInte = 0.01*interest;
        double realSpeInt = 0.01*int2;
        this.balance += (input*(1+realInte)+input*(realInte));
    }

}

class Homework1 {
    public static void main(String[] args) {
    	
    	ArrayList<Account> arr = new ArrayList<Account>();
    	
        Scanner sc = new Scanner(System.in);
        System.out.println("----Menu----");
        
        while(true) {
	        System.out.println("1.���� �輳\n2.�Ա�\n3.���\n4.�������� ��ü���\n5.���α׷� ����");
	        System.out.print("\n����: ");
	        int select = sc.nextInt();
	        
	        if(select==1) {
	        	System.out.println("[������������]\n1.���뿹�ݰ���\n2.�ſ�ŷڰ���");
	        	System.out.print("\n����: ");
	        	int accSel = sc.nextInt();
	        	if(accSel==1) {
	        		System.out.print("����ID: ");
	        		int acc = sc.nextInt();
	        		sc.nextLine();
	        		System.out.print("�̸�: ");
	        		String name = sc.nextLine();
	        		System.out.print("�Աݾ�: ");
	        		int input = sc.nextInt();
	        		System.out.print("������:");
	        		int interest = sc.nextInt();
	        		
	        		arr.add(new NormalAccount(acc, input, name, interest));
	        	} else if(accSel==2) {
	        		System.out.print("����ID: ");
	        		int acc = sc.nextInt();
	        		sc.nextLine();
	        		System.out.print("�̸�: ");
	        		String name = sc.nextLine();
	        		System.out.print("�Աݾ�: ");
	        		int input = sc.nextInt();
	        		System.out.print("������:");
	        		int interest = sc.nextInt();
	        		sc.nextLine();
	        		System.out.print("�ſ���:");
	        		String credit = sc.nextLine();
	        		
	        		arr.add(new HighCreditAccount(acc, input, name, interest, credit));
	        	} 
	        } else if (select==2) {
	        	System.out.println("\n[��   ��]");
				System.out.print("����ID: ");
				int acc=sc.nextInt();
				sc.nextLine();
				System.out.print("�Աݾ�: ");
				int money=sc.nextInt();
				sc.nextLine();
				for(Account n : arr) {
					if(n.getAccount()==acc) {
						n.deposit(money);
					} else {
					System.out.println("��ȿ���� ���� ID�Դϴ�.");
					}
				} 
	        } else if (select==3) {
	        	System.out.println("\n[��   ��]");
				System.out.print("����ID: ");
				int acc=sc.nextInt();
				sc.nextLine();
				System.out.print("��ݾ�: ");
				int money=sc.nextInt();
				sc.nextLine();
				for(Account n : arr) {
					if(n.getAccount()==acc) {
						n.withdraw(money);
					} else {
					System.out.println("��ȿ���� ���� ID�Դϴ�.");
					}
				} 
	        } else if(select==4){
	        	for(Account n : arr) {
	        		System.out.println();
	        		n.display();
	        	}
	        } else if(select==5) {
	        	break;
	        } else {
	        	System.out.println("�߸� �Է��Ͽ����ϴ�.");
	        }
        }
       
    }
}