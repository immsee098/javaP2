package com.day8;

import java.util.Scanner;

public class MethodPrac3_3_26 {

	public static float toCm(float a) {
		float cm = (float)(2.54*a);
		return cm;
	}
	
	public static float toInch(float b) {
		float inch = (float) (b/2.54);
		return inch;
	}
	
	public static double triArea(double width, double height) {
		double area = (width*height)/2;
		return area;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��ȯ�Ϸ��� inch�� �Է�");
		float inch = sc.nextFloat();
		float res1 = toCm(inch);
		System.out.println(inch + "=>" + res1);
		
		System.out.println("��ȯ�Ϸ��� cm�� �Է��ϼ���");
		float cm = sc.nextFloat();
		float res2 = toInch(cm);
		System.out.println(cm + "=>" + res2);
		
		System.out.println("======");
		
		System.out.println("�ﰢ�� �غ��� ����, ���̸� �Է��ϼ���");
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		System.out.println(triArea(width, height));
		

	}

}
