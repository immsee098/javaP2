package com.java0830;

import java.util.Scanner;

public class hw3_29 {
	
	public static float calc(int a, int b) {
		float money = 0;
		if(a>=200) {
			money = (float)(a*b*0.3);
		} else if(a>=100) {
			money = (float)(a*b*0.2);
		} else {
			money = (float)(a*b*0.1);
		}
		return money;
	}
	
	public static boolean verify(String a) {
		 boolean k = true;
	        
	     for(int i =0; i<a.length(); i++) {
	    	 char b = a.charAt(i);
	    	 if (!(b>=48 && b<=57)) {
	    		 k = false;
	    	 }
	     }
	     
	     return k;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ǹż���, �Ǹűݾ� �Է�");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("������ : " + calc(a,b));
		
		
		System.out.println("=====");
		System.out.println("���� �Է��ϼ���");
		sc.nextLine();
		String c = sc.nextLine();
		boolean k = verify(c);
		
        if (k) {
            System.out.println(c+"�� �����Դϴ�");
        } else {
            System.out.println(c+"�� ���ڰ� �ƴմϴ�");
        }

	}

}
