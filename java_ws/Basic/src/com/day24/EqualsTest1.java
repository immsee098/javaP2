package com.day24;

class Test{
	private int value;
	Test(int value){
		this.value = value;
	}
}

public class EqualsTest1 {

	public static void main(String[] args) {
		Test t = new Test(10);
		Test t2 = new Test(10);
		
		if(t==t2) {
			System.out.println("t�� t2�� �ּҴ� ����");
		} else {
			System.out.println("t�� t2�� �ּҴ� �ٸ���");
		}
		
		
		if(t.equals(t2)) {
			System.out.println("t�� t2�� �����ּ�");
		} else {
			System.out.println("t�� t2�� �ٸ� �ּ�");
		}
		
		t=t2;
		if(t.equals(t2)) {
			System.out.println("t�� t2�� ���� �ּ��̴�");
		}
	}

}
