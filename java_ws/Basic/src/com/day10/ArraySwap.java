package com.day10;

public class ArraySwap {

	public static void main(String[] args) {
		//�迭�� ������ ���縦 �̿��ؼ� �迭 swap
		int[] arr = {70,80,90};
		int[] copy = {1, 5, 8, 3};

		System.out.println("----arr�迭�� ���----");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+"\t");
		}
		
		System.out.println("----copy�迭�� ���----");
		for(int i=0; i<copy.length; i++) {
			System.out.println(copy[i]+"\t");
		}
		
		//swap
		int[] temp = arr;
		arr = copy;
		copy = arr;
		copy = temp;
		
		System.out.println("----swap �� arr�迭�� ���----");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+"\t");
		}
		
		System.out.println("----swap �� 00000000000000copy�迭�� ���----");
		for(int i=0; i<copy.length; i++) {
			System.out.println(copy[i]+"\t");
		}
	}

}
