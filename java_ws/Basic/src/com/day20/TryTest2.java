package com.day20;

import java.util.Scanner;

public class TryTest2 {

	public static void main(String[] args) {
		// for�� �ȿ� try~catch������ �ִ� ���
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			try {System.out.println("����2���Է�");
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			
			int res = n1/n2;
			
			System.out.println("������ ���:"+res);}
			catch(Exception e ) {
				e.printStackTrace();
				i--;
			}
		}
		System.out.println("\nnext");

	}

}
