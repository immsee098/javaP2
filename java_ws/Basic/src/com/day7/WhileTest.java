package com.day7;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		/*
		 #while��
		 - Ƚ���� �������� �� �ַ� ���
		 
		 while(���ǽ�) {
		 	�ݺ��� ����
		 }
		 => ���ǽ��� ���ε��� �ݺ��� ������ �ݺ� ó��
		 	������ �Ǹ� while���� �������´�
		 */
		
		String str = "\n\n������ �ϳ� �� \n\n��\n\n";
		Scanner sc = new Scanner(str);
		//returns true if this scanner has another token is input
		while(sc.hasNext()) {
			String s = sc.nextLine();
			/*
			 \n
			 \n
			 ������ �Ͼ� ���
			 */
			System.out.println("��� :" + s);
		}//while
		
		String s2 = sc.nextLine();
		System.out.println("while Ż�� �� 1 :"+s2); //error
		
		//s2 = sc.nextLine();
		//System.out.println("while Ż�� �� 2 :"+s2); //error
		
		//next�̿�
		System.out.println("n==========next()�̿�======================");
		Scanner sc2 =new Scanner(str);
		while(sc2.hasNext()) {
			String s = sc2.next(); //�ܾ� ���� ����������� ������
			System.out.println("���"+s);
			/*
			 ��°�����
			����ϳ�
			��µ�
			��¶�
			 */
		}
		
		s2=sc2.nextLine();
		System.out.println("while Ż�� �� 1 "+s2);
		
		s2=sc2.nextLine();
		System.out.println("while Ż�� �� 2 "+s2);
		
		//s2=sc2.nextLine();
		//System.out.println("while Ż�� �� 3 "+s2);
		
		System.out.println("\n\n=========nextInt()============");
		str = "\n\n123 80 77 \n\n50\n\n";
		Scanner sc3 = new Scanner(str);
		
		while(sc3.hasNext()) {
			int n = sc3.nextInt();
			System.out.println("��� : "+n);
		}
		
		s2 = sc3.nextLine();
		System.out.println("whileŻ�� �� 1: "+s2);
		
		s2 = sc3.nextLine();
		System.out.println("whileŻ�� �� 2: "+s2);
	}

}