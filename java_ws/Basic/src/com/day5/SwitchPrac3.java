package com.day5;

import java.io.IOException;

public class SwitchPrac3  {

	public static void main(String[] args) throws IOException {
		System.out.println("������ �Է��ϼ���");
		char job = (char) System.in.read();
		
		String result = "";
		
		switch(Character.toUpperCase(job)) {
			case 'A':
				result = "ȸ����̽ñ���";
				break;
			case 'B':
				result = "�л��̽ñ���";
				break;
			case 'C':
				result = "�ֺ��̽ñ���";
				break;
			case 'D':
				result = "��Ÿ�� �����޾��";
				break;
			default:
				result = "�߸� �Է��߾��";	
		}
		
		System.out.println(result);
		
		
	}

}
