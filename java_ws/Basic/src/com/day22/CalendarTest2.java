package com.day22;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {
		String[] week = {"", "��", "��", "ȭ", "��", "��","��","��"};
		Calendar cal = Calendar.getInstance();
		int day = cal.DAY_OF_WEEK;
		System.out.println("����:"+ week[day-1]);
		
		//�� ��¥ ������ ���� ���ϱ�
		//�����Ϸκ��� �󸶳� ��������

	}

}
