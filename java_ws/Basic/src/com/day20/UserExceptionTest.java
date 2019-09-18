package com.day20;

class MyException extends Exception{
	private int errorCode=100;
	
	MyException(String msg){
		super(msg); //부모인 Exception클래스의 생성자(매개변수가 문자열인 생성자)를 호출
	}
	
	//public Exception(String message)
	
	public int getCode() {
		return errorCode;
	}
}

public class UserExceptionTest {

	public static void main(String[] args) {
		try {
			throw new MyException("사용자 정의 예외 발생");
		}catch(MyException e) {
			System.out.println("예외 메시지:"+e.getMessage());
			System.out.println("예외코드:"+e.getCode());
		}
		
		System.out.println("\nnext!!");

	}

}
