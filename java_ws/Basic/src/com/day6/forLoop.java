package com.day6;

import java.util.Scanner;

public class forLoop {

	public static void main(String[] args) {
		/*
		 ���ѷ���
		 - �ݵ�� break���� �̿��ؼ� �ݺ����� Ż���ؾ� ��
		 
		 for(;;) {
		 	�ݺ�ó��
		 	
		 	if(���ǽ�) break;
		 }
		 
		 **break���� ����� �� �ִ� ����
		 *[1] switch��
		 *[2] �ݺ���
		 */
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.println("���� ��!!");
			
			System.out.println("����Ͻðڽ��ϱ�?(Y/N)");
			
			String quit = sc.nextLine();
			
			if(quit.equalsIgnoreCase("Y")) {
				break;
			}
		}
		
		
		for(;;) {
			int qq = sc.nextInt();
			for(int i=9; i>0; i--) {
				System.out.println(qq +"*"+ i + "="+qq*i);
			}
			sc.nextLine();//���͸� �Ա� ������ ���Ϳ� ������ �ϳ� �־�־���
			
			String quit = sc.nextLine();
		}

	}

}
