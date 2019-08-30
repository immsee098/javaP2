package com.day9.array;

public class ArrayTest {

	public static void main(String[] args) {
		/*
		 �迭 - ������ Ÿ���� ������ �������� �����ϱ� ���� �����
		 cf. ���� - ������ �ϳ��� �����ϱ� ���� �����
		 	-index�� �̿��� �迭��ҿ� ����
		 	-�������� ���� ���� ���Ǹ� ����
		 	-�ݺ����� �̿��ؼ� ������ �ڵ� ������ ������ �� �ִ�
		 	-�迭�� ������, �迭�̸��� ������(�ּҰ�)�� ��
		 */

		//[1]
		//�迭 ����
		int[] arr;
		
		//�޸� �Ҵ�
		arr=new int[3]; //heap 3���� ������ ������ ������ �Ҵ��
		
		//�ʱ�ȭ
		//index�� 0���� ����
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		//[2] �迭 ����� �޸� �Ҵ��� ���ÿ�
		int[] arr2 = new int[4];
		
		//[3] �迭 ����, �޸� �Ҵ�, �ʱ�ȭ�� ��� ���ÿ�
		int[] arr3 = {100, 200, 300, 400};
		
		int[] arr4 = new int[] {88, 9, 4, 5,6};
		//int[] arr5 = new int[3] {6,9,7}; //error
		
		//
		int[] arr6;
		arr6 = new int[] {77,99,55,66,44,23};
		
		//int[] arr7;
		//arr7 = {10, 50, 73}; //error
		
		//�迭 ��� ���
		for(int i =0; i<3; i++) {
			System.out.println(arr[i]);
		}
		
		for(int i =0; i<arr2.length; i++) {
			System.out.println("arr2�� �迭 ��� : " +arr2[i]);
		}
		
		for(int i =0; i<arr3.length; i++) {
			System.out.println(arr3[i]+"\t");
		}
		
		System.out.println("\n\narr �迭 ����� ����:"+arr.length);
		System.out.println("arr�迭�� �ּ�:"+arr);
	}

}
