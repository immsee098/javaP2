package com.day10;

public class Array2Test {

	public static void main(String[] args) {
		// 2���� �迭
		// [1]
		// �迭 ����
		int[][] arr;
		
		//�޸��Ҵ�
		arr = new int[2][3]; //2�� 3��
		
		//�ʱ�ȭ
		arr[0][0]=10;
		arr[0][1]=30;
		arr[0][2]=24;
		arr[1][0]=50;
		arr[1][1]=60;
		arr[1][2]=88;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.println(arr[i][j]+"\t");
			}
			System.out.println();
		}

		// [2]
		//�迭�Ǽ���� �޸� �Ҵ��� ���ÿ�
		int[][] arr2 = new int[3][2];
		
		//int arr3 [][]; //����
		//int[] arr4[]; //����
		
		// [3] �迭����, �޸��Ҵ�, �ʱ�ȭ�� ��� ���ÿ�
		int[][] arr3 = {{1,3,4}, {3,6,7}, {4,8,3},{3,6,9}}; //4�� 3��
		
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				System.out.println(arr3[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("���� ����: " +arr3.length);
		System.out.println("���� ����: " +arr3[0].length);
	}

}
