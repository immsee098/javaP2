package com.day22;

public class StringTest {

	public static void main(String[] args) {
		String str = "Hellow java, Hi java!";
		
		char ch = str.charAt(4);
		System.out.println("index 4 ��ġ�� ����:"+ch);
		
		int idx = str.indexOf("java");// ������ -1����
		System.out.println("�տ������� ã�� �ڹ��� ��ġ"+idx);
		System.out.println("�ڿ������� ã�� �ڹ�����ġ"+str.lastIndexOf("java"));
		
		idx = str.indexOf("1");
		System.out.println("1�� ��ġ"+idx);
		
		String sub = str.substring(12, 14);
		System.out.println("12~13���� ���ڿ� ����:"+sub);
		
		System.out.println("15���� ������ ���ڿ� ����:"+str.substring(15));
		
		str="www.nate.com";
		if(str.startsWith("www")){
			System.out.println("www�� ������!");
		}
		
		if(str.endsWith("com")) {
			System.out.println("com���� ����");
		}
		
		String email = "hong@email.com";
		
		if(email.indexOf("@")!= -1 &&email.indexOf(".")!=-1 &&email.indexOf("@")<email.indexOf(".")) {
			System.out.println("��ȿ�� �̸����Դϴ�.");
		} else {
			System.out.println("��ȿ���� ���� �̸����Դϴ�");
		}
		
		
		//kim@hanmail.net
		String email1 = "kim@hanmail.net";
		//hong�� ����
		int a = email1.indexOf("@");
		int b = email1.indexOf(".");
		System.out.println(email1.substring(0, a));
		
		//gmail�� ����
		
		System.out.println(email1.substring(a+1,b));
		
		//com�� ����
		System.out.println(email1.substring(b+1));
		
		
		String s = "    java,      android     ";
		System.out.println("\n["+s+"]");
		System.out.println("���ڿ��� ����:"+s.length());
		String s2 = s.trim();
		System.out.println("\n["+s2+"]");
		System.out.println("���� ���� �� ����:"+s2.length());
		
		int n = 10;
		double d = 3.14;
		
		System.out.println("\n������ ��:"+(n+d));
		
		String ss1 = String.valueOf(n);
		String ss2 = Double.toString(d);
		
		System.out.println(ss1+ss2);
	}

}
