package com.day5;

import java.util.Scanner;

public class SwitchPrac2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է��ϼ��� ");
		int month = sc.nextInt();
		String result = "";
		
		switch(month) {
			case 1:
			case 2:
			case 3:
				result = month+"���� 1��б��Դϴ�";
				break;
			case 4:
			case 5:
			case 6:
				result = month+"���� 2��б��Դϴ�";
				break;
			case 7:
			case 8:
			case 9:
				result = month+"���� 3��б��Դϴ�";
				break;
			case 10:
			case 11:
			case 12:
				result = month+"���� 4��б��Դϴ�";
				break;
			default:
				result = "�߸� �����߾��";	
		}
		System.out.println(result);
	}

}
