package com.java0918;

import java.util.Scanner;


public class TestTest2 {
	static int showBonus(String score){
		switch(score){
			case "1": 
				return 3; 
			case "2": 
				return 2; 
			case "3": 
				return 1; 
			case "4": 
				return -1;
			default:
				return 0;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		String score = sc.nextLine();
		
		int a = showBonus(score);
		System.out.println(a+"Á¡ ");
	}

}
