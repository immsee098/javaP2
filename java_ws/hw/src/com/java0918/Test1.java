package com.java0918;

import java.util.Scanner;

class Exchange{
	double wonToDollor(double won) {
		final double dr = 1136.50;
		
		double dollor = 1/dr*won;
		return dollor;
	}
	
	double dollorToWon(double dollor) {
		final double dr = 1136.50;
		double won = dr*dollor;
		return won;
	}
}

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("<1>원->달러  <2>달러->원 선택");
		int select = sc.nextInt();
		
		Exchange ex = new Exchange();
		if(select==1) {
			System.out.println("환전할 원을 입력");
			double won = sc.nextDouble();
			double exC1 = ex.wonToDollor(won);
			System.out.println(Math.round(exC1*1000)/1000.0);
		} else if(select==2) {
			System.out.println("환전할 달러를 입력");
			double dollor = sc.nextDouble();
			double exC2 = ex.dollorToWon(dollor);
			System.out.println(Math.round(exC2/1000)/1000.0);
		} else {
			System.out.println("잘못입력");
		}

	}

}
