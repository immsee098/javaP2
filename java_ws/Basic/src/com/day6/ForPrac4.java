package com.day6;

public class ForPrac4 {

	public static void main(String[] args) {
		for (int i=1; i<200; i++) {
			if(i%7==0 && i%9==0) {
				System.out.println(i + "  ");
			} else if (i%7==0) {
				if(i%3 == 0) {
					System.out.println(i + "  ");
				} else {
					System.out.print(i + "  ");
				}
				//sum = sum + (i + "  ");
			} else if (i%9==0) {
				if(i%7 ==0) {
					System.out.println(i + "  ");
				}else {
					System.out.print(i + "  ");
				}
			} 
			
		}
		
		/*
		 int cnt = 0;
		 해서 줄바꿈 하는 식으로도 가능함
		 
		 for(int i = 1; i<=99; i++) {
		 	if(i%7==0 || i%9==0) {
		 		System.out.print(i + "\t");
		 		
		 		if(++cnt % 5 == 0) System.out.println();
		 	}
		 }
		 
		*/

	}

}
