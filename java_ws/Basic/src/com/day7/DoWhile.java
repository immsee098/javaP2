package com.day7;

public class DoWhile {

	public static void main(String[] args) {
		/*
		 do ~ while
		 - �� ����, �� ����ó��
		 - ������ �����̴��� �ѹ��� ������
		 
		 do{
		 	�ݺ��� ����
		 } while(���ǽ�);
		*/
		
		int k = 0;
		do {
			System.out.println("k="+k);
			
			k++;
		} while(k>3);

		System.out.println("\n\n===============");
		k = 0;
		do {
			System.out.println(+k);
			
			k++;
		} while(k<3);
	}

}