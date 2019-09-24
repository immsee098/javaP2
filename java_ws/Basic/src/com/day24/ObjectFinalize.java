package com.day24;

class MyName{
	private String objName;
	
	MyName(String objName){
		this.objName = objName;
	}
	
	public void finalize() throws Throwable {
		//super.finalize(); //�ν��Ͻ��� �Ҹ�Ǳ� ���� Ƣ���
		
		System.out.println(objName+"�ν��Ͻ��� �Ҹ�˴ϴ�");
	}
	
	public void showInfo() {
		System.out.println("MyName Ŭ������ �޼���");
	}
	
}

public abstract class ObjectFinalize {

	public static void main(String[] args) {
		MyName obj1 = new MyName("�ν��Ͻ�1");
		MyName obj2 = new MyName("�ν��Ͻ�2");
		
		obj1.showInfo();
		obj2.showInfo();
		//�̶������� obj���� �������� ����Ű�� �־ �Ҹ����� �ƴԤ�
		
		
		//�׷���null�� �Ǹ鼭 �Ҹ����̵�
//		obj1 = null; //�ν��Ͻ�1�� garbage
//		obj2 = null; //�ν��Ͻ�2�� garbage
		
		obj1 = obj2; //1�� �Ҹ���
		obj1 = null;
		
		System.out.println("main����");
		
		//finalize �޼����� �ϔ��� ȣ���� �ʿ��� ��Ȳ������ ���� �� �޼����� ������ ȣ���� �ʿ���
		//System.gc();
		//System.runFinalization();
		 System.gc(); //gc�� ������ �÷��� ����
		 System.runFinalization();

	}

}
