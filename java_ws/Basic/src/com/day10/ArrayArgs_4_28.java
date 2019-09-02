package com.day10;

import java.util.Scanner;

public class ArrayArgs_4_28 {
	
	public static void pringAvg(int[] score) {
		int sum=0; 
		for (int i=0;i<score.length ;i++ ) 
		{
			sum+=score[i]; 
		}
		
		int avg = sum/score.length;
		System.out.println("총점:"+sum +", 평균:"+avg);
		score[0]+=5; //1. 여기의 영향으로
		
	}
	
	public static int add(int a, int b) {
		int c =a+b; //a에 a대입 b대입 후 c를 만든다. c가 만들어진 후 a가 다시 대입됨!! a500이 위로 올라가면 영향받음
		a=500;
		
		return c;
	}

	public static void main(String[] args) {
		//call by reference
		//=>매개변수로 주소를 넘기는 것(매개변수가 참조형)
		//=>매서드에서 매개변수의 값을 변경하면 호출한 곳에서도 영향 받는다 ~> 주소를 넘기면.... 같은 곳을 가르킬 가능성 높음
		Scanner sc = new Scanner(System.in); 
		System.out.println("국어, 영어, 수학 점수를 입력하세요"); 
		int[] subject = new int[3]; 
		for (int i=0;i<subject.length ;i++ ) 
		{ subject[i]=sc.nextInt(); 
		}
		
		pringAvg(subject); 
		
		System.out.println("subject[0] : " + subject[0]); //2.이부분의 subject[0]값이 내가 넣은 것보다 +5더 찍힘.. 같은 값의 배열이 바뀌엇기때문
		
		
		//call by value
		//=>매개변수에 값을 넘겨주는 것
		int n1=10, n2=20;
		int res = add(n1, n2);
		System.out.println("두 수의 합 : "+res);
		//매서드에서 매개변수의 값을 변경해도 main에서 영향 안받음(a를 500으로 변경해도 add(n1, n2)값은 30됨)
	}

}
