package com.java0905;

import java.util.Scanner;

class rspGame{
	private String result;
	private int user;
	private int com;
	
	rspGame(int user, int com){
		this.user = user;
		this.com = com;
	}
	
	
	public void getuser(int p_user) {
		user = p_user;
	}
	
	public int setuser() {
		return user;
	}
	
	public void getcom(int p_com) {
		com = p_com;
	}
	
	public int setcom() {
		return com;
	}
	
	String verify() {
		int b = (user-com+3)%3;
		
		if (b==1) {
			result = "�̱�";
		} else if(b==2) {
			result="��";
		} else if(b==0) {
			result="���";
		} 
		return result;
	}
}

public class homework1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int user = 0;
		System.out.println("����(0), ����(1), ��(2), Q(quit)");
		String start = sc.nextLine();
		
		if(start.equals("Q") || start.equals("q")) {
			System.out.println("��");
		} else if (start.equals("0")) {
			System.out.println("����� = ����");	
			user = 0;		
		} else if(start.equals("1")) {
			System.out.println("����� = ����");
			user = 1;
		}else if(start.equals("2")) {
			System.out.println
			("����� = ��");
			user =2;
		} 
		
		int computer = (int)(Math.random()*3);
		if (computer==0) {
			System.out.println("��ǻ�� = ����");		
		} else if(computer==1) {
			System.out.println("��ǻ�� = ����");
		}else if(computer==2) {
			System.out.println("��ǻ�� = ��");
		}
		
		rspGame r1 = new rspGame(user, computer);
		System.out.println(r1.verify());

	}

}
