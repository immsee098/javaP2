package com.day20;

import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("�ֹι�ȣ�� �Է��ϼ���");
			String num = sc.nextLine();
			
			if(num.length()!=13) {
				throw new Exception("�ֹι�ȣ�� 13�ڸ�");
			}
			
			System.out.println("�ֹι�ȣ: "+num);
		} catch(Exception e) {
			System.out.println("���ܹ߻�: "+e.getMessage());
		}

	}

}
