package com.day6;

public class OverlapFor {

	public static void main(String[] args) {
		// ��ø for�� - for �ȿ� for�� �� ��
		/*
		 for(int i =0; i<3; i++) {
		 	for(int j=0; j<2; j++){
		 		�ݺ��� ����
		 	}//���� for
		 }//�ٱ� for
		 
		 =>�ٱ� for���� Ƚ����ŭ ���� for���� �����		 
		 */
		
		for(int i=0; i<3; i++) {
			System.out.println("=========== i="+i);
			
			for(int j=0; j<2; j++) {
				System.out.println("j="+j);
			}//���� for
			System.out.println();
		}//�ٱ� for
		
		for(int dan=2; dan<10; dan++) { 
			for(int j=1; j<10; j++) { 
				System.out.println(dan + " * " + j + " = " + dan*j ); 
				} 
			System.out.println(); 
			}

	}

}
