package com.day22;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {
		String[] week = {"", "��", "��", "ȭ", "��", "��","��","��"};
		Calendar cal = Calendar.getInstance();
		int idx = cal.DAY_OF_WEEK;
		System.out.println("����:"+ week[idx]);
		
		//�� ��¥ ������ ���� ���ϱ�
		//�����Ϸκ��� �󸶳� ��������
		Calendar startDay = Calendar.getInstance();
		startDay.set(2019, 7, 20);
		
		long gap = (cal.getTimeInMillis()-startDay.getTimeInMillis()/1000);
		gap = gap/(24*60*60);
		System.out.println("�����Ϸκ��� "+gap+"�����");

	}

}
