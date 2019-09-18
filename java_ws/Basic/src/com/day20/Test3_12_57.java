package com.day20;

import java.util.Scanner;

class IdInputException extends Exception {
	public IdInputException() {
		super("유효하지 않은 주민등록번호 ");
	}
}

public class Test3_12_57 {
	
	public static String idInput() throws IdInputException{
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호 입력");
		String id = sc.nextLine();
		
		if(id.length()!=13) {
			throw new IdInputException();
		}
		return id;
	}

	public static void main(String[] args) {
		try {
			String id = idInput();
			System.out.println("주민등록번호:"+id);
		} catch(IdInputException e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		System.out.println("\nnext");

	}

}
