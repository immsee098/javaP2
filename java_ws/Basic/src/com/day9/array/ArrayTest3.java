package com.day9.array;

public class ArrayTest3 {

	public static void main(String[] args) {
		int [] score = {99, 78, 85, 60, 59, 100, 97};
		
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]+"\t");
		}
		
		System.out.println("\n\n==========5점 가산 후 점수=============");
		
		int a = 90;
		a += 5;
		System.out.println("a="+a);
		
		for(int i =0; i<score.length; i++) {
			if(score[i]>95) {
				score[i] = 100;
				System.out.println(score[i]+"\t");
			} else {
				score[i] += 5;
				System.out.println(score[i]+"\t");
			}
		}
 
	}

}
