package com.day8;

import java.util.Scanner;

public class NumberGame_3_30 {

	public static void main(String[] args) {
		// ���� ���߱� ����
		//1~100������ �������� �������� ����
		//����ڰ� �Է��� ���� ���ؼ� �������� üũ
		/*
		public static double random()
		 0.0 <= x <1.0 ������ double ���� ����
		 
		 [1]
		 1~100 ������ ���� ���� ���ϱ�
		 0.0<=x*100<100.0
		 1.0 <x*100+1<101.0
		 1<= (int)(x*100+1)<101
		 
		 [2]
		 1~10������ ���� ���� ���ϱ�
		 0<= (int)(x*11) <11
		 
		 [3]a~z ������ ������ ����(97~122)
		 97('a') <= (int)(x*26+'a') <26+97
		 
		 [4]D~H 
		 68 <= (int)(x*5 + 'D') <5+68
		 
		 *������ ���ϴ� ���
		 -�߻���Ű���� ���� ������ �� ���� ���Ѵ�
		 -���۰��� ���Ѵ�
		 -int�� ����ȯ
		*/
		
		//1. ���� ���ϱ�(1~100������ ������ ����)
		int answer = getRandom('a', 'z');
		boolean TF = false;
		
		//2. ����ڿ��� 4���� ��ȸ�� �ش� => �ݺ������� ó��
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<4; i++) {
			//����ڷκ��� 1~100���� ���� �Է� �ޱ�
			System.out.println("1~100������ ������ �Է��ϼ���");
			System.out.println((char)answer);
			int num = sc.nextInt();
			
			if(num==answer) {
				System.out.println("�����Դϴ�");
				TF = true;
				break;
			} else if(num>answer) {
				if(i<3) {
					System.out.println("�ʹ� Ů�ϴ�.���� ���� ���� �Է��ϼ���");
					continue;
				} else {
					continue;
				}
			} else {
				if(i<3) {
					System.out.println("�ʹ� �۽��ϴ�. �� ū ���� �Է��ϼ���");
					continue;
				} else {
					continue;
				}
				
			}
		}
		if(TF ) {
			System.out.println("�����մϴ�!");
		} else {
			System.out.println("��ȸ�� ���� �����߽��ϴ�. ������" + answer + "�����ϴ�.");
		}
		
		//1~100������ ���� �Է� �ޱ�
		
		//����� �� - if
	}
	
	//public static int getRandom() {
		//return (int)(Math.random()*100+1);
	//}

	public static int getRandom(int start, int end) {
		int count = end-start+1;
		int answer = (int)(Math.random()*count+1);
		return answer;
	}
}
