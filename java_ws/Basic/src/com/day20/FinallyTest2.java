package com.day20;

public class FinallyTest2 {
	public static boolean divider(int n1, int n2) {
		try {
			int res = n1/n2;
			System.out.println("나눗셈 결과:"+res);
			
			return true;
		}catch(Exception e) {
			System.out.println("예외발생:" +e.getMessage());
			return false;
		}finally {
			System.out.println("finally 절!!!");
		}
	}

	public static void main(String[] args) {
		if(divider(50,3)) {
			System.out.println("연산 성공");
		} else {
			System.out.println("연산 실패");
		}
		
		boolean bool = divider(60,0);
		if(bool) {
			System.out.println("연산성공!");
		} else {
			System.out.println("연산실패!");
		}
	}

}
