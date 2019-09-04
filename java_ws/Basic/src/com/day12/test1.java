package com.day12;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ют╥б");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		ScoreTest st = new ScoreTest(a,b,c);
		System.out.println(st.average());

	}

}
