package com.day20;

import java.util.*;

public class MultiCatch {

	public static void main(String[] args) {
		/*
		 *	다중 catch문
		 *	-예외의 종류에 따라 catch문을 여러 개 사용
		 *	-예외의 종류에 따라 서로 다른 처리를 할 수 있다
		 *
		 *	catch의 순서는 반드시 자식부터 부모순으로 해야함(그외엔 에러)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("정수 입력");
			int n = sc.nextInt();
					
			int res = 100/n;
			System.out.println("res="+res);
		} catch(ArithmeticException e) {
			System.out.println("예외-잘못된 연산:"+e.getMessage());
		} catch(InputMismatchException e) {
			System.out.println("예외-입력오류:"+e);
		} catch(Exception e) {
			System.out.println("예외발생:"+e.getMessage());
			e.printStackTrace();
		}

	}

}
