package com.day19;

import java.util.Scanner;

interface Week{
	int MON=1, TUE=3,WED=3,ThU=4,FRI=5,SAT=6,SUM=7;
}

public class InterfaceConst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ϼ���");
		
		int types = sc.nextInt();
		
		switch (types) {
			case Week.MON:
				System.out.println("�ְ�ȸ��");
				break;
			case Week.TUE:
				System.out.println("����");
			
		}
	}

}
