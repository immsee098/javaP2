package com.day13;

class AAA {
	static int[] arr = new int[10]; //����� �ʱ�ȭ
	//=> ����� �ʱ�ȭ�� �̿��� ���� 10���� ���� �迭 ����
	
	//static �ʱ�ȭ �� - static ������ ������ �ʱ�ȭ�� ����
	//=> �ش� Ŭ������ �޸𸮿� �ε��� �� static ������ �����ǰ�, static �ʱ�ȭ �� ȣ��
	//=> ÷�� �� ���� ȣ��
	
	static {
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10+1);
		}//for
	}
}

public class StaticBlock {

	public static void main(String[] args) {
		System.out.println("static �迭�� ���� : "+AAA.arr.length);
		
		for(int i=0; i<AAA.arr.length;i++) {
			System.out.println(AAA.arr[i]);
		}

	}

}
