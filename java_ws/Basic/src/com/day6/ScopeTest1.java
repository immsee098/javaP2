package com.day6;

public class ScopeTest1 {

	public static void main(String[] args) {
		int a =10; //�������� - main�� ����Ǹ� �Ҹ��
		
		//for(int a =0; a<3; a++) {}  ~>������
		
		for(int i=0;i<3;i++) {
			System.out.println("i="+i);
			System.out.println("a="+a);
		}
		
		for(int i=0; i<2; i++) {
			int n=20;
			System.out.println(i);
			System.out.println("n="+n);
		}
		//System.out.println("n="+n);
		//System.out.println("i="+i);
		System.out.println("a="+a);		
		

	}

}