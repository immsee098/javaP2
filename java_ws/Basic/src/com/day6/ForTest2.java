package com.day6;

public class ForTest2 {

	public static void main(String[] args) {
		//1~3���� �հ� ���ϱ�(����)
		
		int sum = 0; //0���� �ʱ�ȭ
		
		for(int i=0; i<3; i++) {
			sum+=i; // sum =sum+i
			System.out.println("i="+i+", sum="+sum);
		} //for�� �ȿ��� ����ϸ� ������ ��� ��µ�
		System.out.println("1~3���� �հ�:" + sum);//for�� �ۿ��� ����ϸ� �ϳ��� ��µ�
		
		
		//1~10���� ¦���� �� ���ϱ�
		int sum2 = 0;
		
		for(int i=0; i<11; i+=2) {
			sum2 += i;
		}
		System.out.println("¦���� ���� "+sum2);
		
		//1~10���� Ȧ���� �� ���ϱ�
		int sum3 = 0;
		
		for(int i=1; i<10; i+=2) {
			sum3 += i;
		}
		System.out.println("Ȧ���� ���� "+sum3);
		
		//for������ ������ i�� ���������̹Ƿ� for���� ����� �Ҹ���

	}
	
}