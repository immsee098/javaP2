package com.day9.array;

public class MaxTest_4_14 {

	public static void main(String[] args) {
		// �ִ밫 ���ϱ�
		int[] arr = {10, 57, 19, 35, 77, 26};
		int max=arr[0]; //10
		int min=arr[0]; 
		
		for(int i=1; i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			} else if(arr[i]<min) {
				min = arr[i];
			}
		}//for
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]+"\t");
		}
		System.out.println("\n\n�ִ밪 : " + max);
		System.out.println("\n�ּҰ�: " + min);
	}

}
