package com.day11;

public class CommandArgs2 {

	public static void main(String[] args) {
		// ����� �μ��� ��, ��, �� ���� �Է¹޾� ����, ��� ���ϱ�
		
		if(args.length<3) {
			System.out.println("��, ��, �� ������ �Է��ϼ���");
			return;
		}
		
		int lang = Integer.parseInt(args[0]);
		int eng = Integer.parseInt(args[1]);
		int math = Integer.parseInt(args[2]);
		int sum = lang+eng+math;
		float avg = (float)(sum/3.0);
		
		System.out.println("���� :" + sum + ", ���:"+avg);

	}

}
