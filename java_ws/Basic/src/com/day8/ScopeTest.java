package com.day8;

public class ScopeTest {
	public static int getSum(int count) { //count=>�Ű�����
		int sum = 0; //��������
		//�������� �Ű������� �ش� �޼��尡 ����Ǹ� �Ҹ��
		
		for(int i =1; i<=count; i++) { //i => ��������(��������)
			sum += i;
		} //for
		return sum;
	}
	public static void main(String[] args) {
		int count = 100; //��������
		int sum = getSum(count); //��������
		System.out.println("1~"+count+"������ ��:"+sum);

	}

}