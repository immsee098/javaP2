package com.day4;

public class AssginOp {

	public static void main(String[] args) {
		//대입 연산자 - 오른쪽에서 왼쪽으로 진행
		/*
		 =, +=, -=, *=, /=, %=
		 
		 a+=7; //a=a+7
		*/
		
		int a =7, b=3;
		System.out.println("a="+a+", b="+b);
		a+=b; //a=a+b; => a=10
		System.out.println("a+=b 이후 a=" +a);
		
		a/=b; //a=a/b => 3
		System.out.println("a/=b 이후 a=" + a);
		
		a*=b; //a=a*b => 9
		System.out.println("a*=b 이후 a="+a);
		
		//sum+=i; => sum=sum+i
	}

}
