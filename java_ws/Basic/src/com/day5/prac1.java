package com.day5;

public class prac1 {

	public static void main(String[] args) {
		int i =200;
		char ch = 'a';
		boolean powerOn = false;
		String str = "yes";
		
		if(i>100 && i<300) {
			System.out.println("1번"+true);
		}
		
		if(ch != ' ' || ch != '\t') {
			System.out.println("2번"+true);
		}
		
		if(ch=='x' || ch=='X') {
			System.out.println("3번"+true);
		}
		
		if(powerOn==false) {
			System.out.println("4번"+true);
		}
		
		if(str.equals("yes")) {
			System.out.println("5번"+true);
		}
		
		if(ch >= 0 && ch <=9) {
			System.out.println("6번"+true);
		}
		
		if((ch>=65 && ch <=90) || (ch>=97 && ch <=122)) {
			System.out.println("7번"+true);
		}
		
	}

}
