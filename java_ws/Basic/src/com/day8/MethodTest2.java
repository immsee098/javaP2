package com.day8;

public class MethodTest2 {
	/*
	 ���� ������ ��ȯŸ�� �޼��� �̸�(�Ű�����) {
	 	�޼��� ����
	 	return �����;
	 }
	 
	 �Է°� - �Ű�����, �μ�, ����, �Ķ����
	 ������� Ÿ�� - ��ȯ��, ��ȯŸ��(����Ÿ��)
	 */
	public static double calcInterest(int money) {
		double interest = money*0.016;
		return interest;
		
	}

	public static void main(String[] args) {
		int m =10000;
		double d = calcInterest(m);
		System.out.println(d);
		/*
		 �޼��� ȣ��
			[1] static�޼��� ȣ��
				Ŭ������.�޼����();
				��, ���� Ŭ������ �ִ� �޼��带 ȣ���� ���� Ŭ������ ���� ����
				�޼����()
				
			[2] instance�޼��� ȣ��(static�� �� ����)
				��������.�޼����();
		 */
	}

}