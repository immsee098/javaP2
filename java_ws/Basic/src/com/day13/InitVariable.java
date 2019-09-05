package com.day13;

/*
 [1] static ������ �ʱ�ȭ ����
 	�ش� Ŭ������ �޸𸮿� �ε��� �� �� �� �� �ʱ�ȭ��
 [2] �ν��Ͻ� ������ �ʱ�ȭ ����
 	�ν��Ͻ��� ������ ������ �� �ν��Ͻ� ���� ���� �ν��Ͻ� ������ �����ǰ� �ʱ�ȭ��
 	
 * �ʱ�ȭ ����
 [1] static ����
 default�� => ����� �ʱ�ȭ => static�ʱ�ȭ ��
 
 [2] instance ����
 default��=> ����� �ʱ�ȭ => �ν��Ͻ� �ʱ�ȭ �� => ������
 */

class BBB{
	static int cv =1; //static ����
	int iv = 10; //�ν��Ͻ� ����
	
	//static �ʱ�ȭ ��
	static {
		cv =2 ;
		System.out.println("static �ʱ�ȭ �� ȣ�� " + cv);
	}
	
	//�ν��Ͻ��ʱ�ȭ ��
	{
		iv = 20;
		System.out.println("�ν��Ͻ� �ʱ�ȭ �� ȣ�� " +iv);
	}
	
	BBB(){
		iv=30;
		System.out.println("������ ȣ�� " + iv);
	}
	
}

public class InitVariable {

	public static void main(String[] args) {
		System.out.println("main ����");
		System.out.println("BBB�� static ���� cv="+BBB.cv);
		
		BBB b = new BBB();
		System.out.println("main - �ν��Ͻ� ���� iv="+b.iv);

	}

}
