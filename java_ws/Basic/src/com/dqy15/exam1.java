package com.dqy15;

import java.util.*;

public class exam1 {

	public static void main(String[] args) {
		
	
		// #���� 2
		float pi = 3.14152f;
		int c = (int)(pi*100);
		float d = (float)c/100;
		System.out.println(d);
		
		// #���� 3
		int num = 17;
		String oe = num%2 == 0 ? "¦��" : "Ȧ��";
		System.out.println(oe);
		
		
		// #����6
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է�");
		int num1 = sc.nextInt();
		int sum = 0;
		for (int i =0; i<num1; i++) {
			int rand = (int)(Math.random()*45+1);
			System.out.println(rand);
			sum += rand;
		}
		System.out.println(sum);
		
		
		// #���� 7
		System.out.println("����, ����, ���� ������ �Է��ϼ���");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		float aver = (float)(kor+eng+math)/3;
		System.out.println("���:" + aver);
		
		if(aver>=70) {
			if(kor>=50&&eng>=50&&math>50) {
				System.out.println("�հݿ���: �հ�");
			} else {
				System.out.println("�հݿ���:����");
			}
		} else {
			System.out.println("�հݿ���:���հ�");
		}
		
		// #���� 8
		String sum1="";
		for(int i = 1; i<11; i++) {
			if(i!= 1) {
				sum1 += ("+"+Integer.toString(i)) ;
			} else {
				sum1 += Integer.toString(i);
			}
			System.out.println(sum1);
		}
		
		//#����9
		int sum2 = 0;
		int count=0;
		int[][] arr = {{10,10,10,10,10}, {20,20,20,20,20}, {30,30,30,30,30}, {50,50,50,50,50}};
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sum2 += arr[i][j];
				count++;
			}
		}
		System.out.println("����:"+sum2);
		System.out.println("���:" +(float)sum2/count);

	}

}
