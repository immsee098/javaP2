package com.day6;

public class ForPrac7 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i =1; i<21; i++) {
			if (i%2 != 0 && i%3 !=0) {
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println();
		
		int sum2 = 0;
		int add = 0;
		for(int i=1; i<11; i++) {
			add += i;
			sum2 += add;
		}
		System.out.println(sum2);
		

	}

}