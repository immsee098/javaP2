package com.day20;

public class FinallyTest2 {
	public static boolean divider(int n1, int n2) {
		try {
			int res = n1/n2;
			System.out.println("������ ���:"+res);
			
			return true;
		}catch(Exception e) {
			System.out.println("���ܹ߻�:" +e.getMessage());
			return false;
		}finally {
			System.out.println("finally ��!!!");
		}
	}

	public static void main(String[] args) {
		if(divider(50,3)) {
			System.out.println("���� ����");
		} else {
			System.out.println("���� ����");
		}
		
		boolean bool = divider(60,0);
		if(bool) {
			System.out.println("���꼺��!");
		} else {
			System.out.println("�������!");
		}
	}

}
