package com.day5;

public class forTest2 {

	public static void main(String[] args) {
		for(int i = 10; i>-7; i-=2) {
			if(i>0) {
				System.out.println(i + " java");
			} else if(i==0) {
				System.out.println(i + " oracle");
			} else {
				System.out.println(i + " spring");
			}
		}

	}

}
