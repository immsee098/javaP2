package com.day5;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		/*
		��ø if
		- if�� �ȿ� if���� �� ��
		- �ٱ� if���� ���̾�� ���� if���� ����� 
		
		if(���ǽ�1) {
			if(���ǽ�2){
				����1
			}
		}
		=>���ǽ�1�� ���̸� ���� if���� ����
		   �����̸� ���� �������� �Ѿ (���� if���� ������� ����)
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ȸ�����θ� �Է��ϼ���(1.ȸ��  2.��ȸ��");
		int type = sc.nextInt();
		String result = "";
		
		if(type==1) {
			System.out.println("���űݾ��� �Է��ϼ���");
			int price = sc.nextInt();
			if(price >= 1000000) {
				result = "�����ϵ�";
			} else if (price >= 500000) {
				result = "����Ŀ";
			} else if (price >= 100000) {
				result = "���콺";
			} else {
				result = "10���� �̸��� ����ǰ�� �����ϴ�";
			}
		} else {
			result ="��ȸ���� ����ǰ ���� �Ұ�!";
		}
		
		System.out.println(result);

	}

}
