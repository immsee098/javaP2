package com.day14;

public class ClassArray {

	public static void main(String[] args) {
		//3�� ��Ҹ� ���� int�迭 ����, �ʱ�ȭ, ���
		int[] arr;
		arr = new int[3];
		for(int n : arr) {
			System.out.println(n);
		}
		String[] arr1 = {"a", "b", "c", "d"};
		for(String n1 : arr1) {
			System.out.println(n1);
		}
		
		//Ŭ���� �迭
		int a = 10;
		int[] arr2 = new int[3];
		arr2[0] = 10;
		arr2[1] = 20;
		
		//
		Account acc = new Account("1000-02-3000", 100000); //����-��ü ����
		acc.display();
		
		
		Account[] accList = new Account[3];
		accList[0] = new Account("2000-03-44000", 200000);
		accList[1] = new Account("3000-04-50000", 120000);
		Account acc3 = new Account("3000-04-50000", 420000);
		accList[2] = acc3; //�迭��Ұ� �߰��� �鰨
		
		accList[1].display();
		
		for(Account n: accList) {
			n.display();
		}
	}

}
