package com.day10;

import java.util.Arrays;
import java.util.Scanner;

public class Lottery {
	
	public static int[] findLotto() {
		int[] num = new int[6];
		
		for(int i=0; i<num.length; i++) {
			num[i]=(int)(Math.random()*45+1); 
			
			for(int k=0; k<i; k++) {
				if(num[i] == num[k]) {
					i--; //i를 감소시켜서 해당 i값을 다시 받아옴
					break;
				}
			}
		}
		return num;
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[6];
		while(true) {
			
			 num = findLotto();
			
				/*
				 i=1, k=0	num[0] == num[1] 비교
				 
				 i=2, k=0	num[0] == num[1] 비교
				 i=2, k=1	num[1] == num[1] 비교
				 .
				 .
				 .
				 */
					
			Arrays.sort(num);
			
			for(int n : num) {
				System.out.print("\n"+n);
			}
			
			System.out.println("\n\n그만하려면 Q");
			String quit = sc.nextLine();
			if(quit.equalsIgnoreCase("Q")) break;
			
		}

	}
	
}

