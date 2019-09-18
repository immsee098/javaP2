package com.day20;

import java.util.Scanner;

class AgeInputException extends Exception{
	AgeInputException(){
		super("��ȿ���� ���� ���̰� �Էµ�");
	}
	
}

public class UserExceptionTest2 {
	public static int readAge() throws AgeInputException{
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է�!!");
		
		int age = sc.nextInt();
		
		if(age<0 || age>150) {
			throw new AgeInputException();
		}
		return age;
	}

	public static void main(String[] args) {
		try {
			int age = readAge();
			System.out.println("����:"+age);
		} catch(AgeInputException e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
		System.out.println("\nnext");
	}

}
