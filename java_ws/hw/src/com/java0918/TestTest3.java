package com.java0918;

public class TestTest3 {
	
	static int sumFF() {
		int sum = 0;
		for(int i=0; i<41; i++) {
			if(i%4==0 && i%5==0) {
				sum += i;
			} else if (i%4==0) {
				sum+=i;
			} else if (i%5==0) {
				sum += i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(sumFF());

	}

}
