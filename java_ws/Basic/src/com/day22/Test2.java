package com.day22;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		String str = "�ȳ��ϼ���\r\n ���� ȫ�浿�Դϴ�.";
		
		String str2 = str.replace("\r\n", "<br>");
		System.out.println(str2);
		
		
		String str3 ="c:\\shop\\upload\\test.txt";
		int dot = str3.lastIndexOf(".");
		int dollor = str3.lastIndexOf("\\");
		String folder = str3.substring(0, dollor);
		String name = str3.substring(dollor+1, dot);
		String type = str3.substring(dot+1);
		System.out.println("����:"+folder);
		System.out.println("���ϸ�:"+name);
		System.out.println("Ȯ����:"+type);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ �Է�(������x)");
		
		String num = sc.nextLine();
		String ge = num.substring(6, 7);
		String year = num.substring(0,2);
		String month = num.substring(2,4);
		String day = num.substring(4,6);
		
		String ge2 = "";
		String year2 ="";
//		
//		if(ge.equals("1")||ge.equals("3")) {
//			ge2="��";
//		} else if(ge.equals("2")||ge.equals("4")) {
//			ge2="��";
//		}
//		
//		if(ge.equals("1")||ge.equals("2")) {
//			year2 = "19"+year;
//		} else if(ge.equals("3")||ge.equals("4")) {
//			year2 = "20"+year;
//		}
//		
		switch(ge) {
			case "1":
				ge2="��";
				year2 = "19"+year;
				break;
			case "2":
				ge2="��";
				year2 = "19"+year;
				break;
			case "3":
				ge2="��";
				year2 = "20"+year;
				break;
			case "4":
				ge2="��";
				year2 = "20"+year;
				break;
		}
		
		System.out.println(year2+"�� "+month+"�� "+day+"�� ,"+ge2);

	}

}
