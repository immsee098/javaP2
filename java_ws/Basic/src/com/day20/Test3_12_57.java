package com.day20;

import java.util.Scanner;

class IdInputException extends Exception {
	public IdInputException() {
		super("��ȿ���� ���� �ֹε�Ϲ�ȣ ");
	}
}

public class Test3_12_57 {
	
	public static String idInput() throws IdInputException{
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹε�Ϲ�ȣ �Է�");
		String id = sc.nextLine();
		
		if(id.length()!=13) {
			throw new IdInputException();
		}
		return id;
	}

	public static void main(String[] args) {
		try {
			String id = idInput();
			System.out.println("�ֹε�Ϲ�ȣ:"+id);
		} catch(IdInputException e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}
		System.out.println("\nnext");

	}

}
