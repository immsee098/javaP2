package com.day20;

import java.util.Scanner;

public class ThrowTest {

	public static void main(String[] args) {
		/*
		 * throw - �����ڰ� ������ ���ܸ� �߻���ų �� ���
		 * throw new Exception("���ƿ� �޽���:);
		 * 
		 * �ڹ� ����ӽ��� �ν��� �� ���� ���ܻ�Ȳ������,
		 * �����ڰ� ������ ������ ���
		 * throw�� ��뤾�� ������ ���ܸ� �߻���Ŵ
		 */
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("���� �Է�");
			int age = sc.nextInt();
			
			if(age<0) {
				throw new Exception("���̴� ������� �մϴ�");
			}
			
			System.out.println("����:"+age);
		} catch(Exception e) {
			System.out.println("���ܹ߻�:"+e.getMessage());
		}

	}

}
