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
					i--; //i�� ���ҽ��Ѽ� �ش� i���� �ٽ� �޾ƿ�
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
				 i=1, k=0	num[0] == num[1] ��
				 
				 i=2, k=0	num[0] == num[1] ��
				 i=2, k=1	num[1] == num[1] ��
				 .
				 .
				 .
				 */
					
			Arrays.sort(num);
			
			for(int n : num) {
				System.out.print("\n"+n);
			}
			
			System.out.println("\n\n�׸��Ϸ��� Q");
			String quit = sc.nextLine();
			if(quit.equalsIgnoreCase("Q")) break;
			
		}

	}
	
}

