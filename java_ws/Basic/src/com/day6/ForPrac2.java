package com.day6;

public class ForPrac2 {

	public static void main(String[] args) {
		char al;
		for(int i=97; i<123; i++) {
			al = (char)i;
			if(i<122) {
				System.out.print(al+", ");
			} else {
				System.out.print(al);
				System.out.println();
			}
		//for(char ch='a'; ch<='z'; ch++) 식으로도 가능하다
		}
		int count = 0;
		for (int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				count++;
				int multi = i*j;
				
				if(count%9 == 0) {
					System.out.println(i+"*"+j+"="+multi);
				} else {
					System.out.print(i+"*"+j+"="+multi+ "\t");
				}
			}
		}

	}

}
