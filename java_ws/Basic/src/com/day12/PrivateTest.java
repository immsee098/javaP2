package com.day12;


class AAA {
	
	/*
	 ~���� ������~
	 1) private - �� Ŭ���� ��������
	 2) default - ����Ű��
	 3) protected - ��Ű���� �޶� �� ����̶�� ����
	 4) public - ��𼭳�
	 
	 private<defalt<protected<public
	 */
	
	private int age;
	String name;
	//protected address2;
	String num;
	
	public void showInfo() {
		System.out.println(age);
		System.out.println(name);
	}
}

public class PrivateTest {

	public static void main(String[] args) {
		// obj.age = 20 ~> ����. private�̹��� ���ٺҰ�
		//System.out.println(); ~>����
		
		BBB b = new BBB();

	}

}
