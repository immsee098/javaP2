package com.day20;

import java.util.Scanner;

class AgeInputException extends Exception{
	AgeInputException(){
		super("유효하지 않은 나이가 입력됨");
	}
	
}

public class UserExceptionTest2 {
	public static int readAge() throws AgeInputException{
		Scanner sc = new Scanner(System.in);
		System.out.println("나이 입력!!");
		
		int age = sc.nextInt();
		
		if(age<0 || age>150) {
			throw new AgeInputException();
		}
		return age;
	}

	public static void main(String[] args) {
		try {
			int age = readAge();
			System.out.println("나이:"+age);
		} catch(AgeInputException e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		System.out.println("\nnext");
	}

}
