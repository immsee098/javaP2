package com.day23;

import java.util.Calendar;

public class CalendarAdd {

	public static void main(String[] args) {
		// 100�� ��, 6���� ��
		
		Calendar cal = Calendar.getInstance();
		System.out.println("��������:"+MyCalendarUtil.findDate(cal));

		//100�� ��
		cal.add(Calendar.DAY_OF_MONTH, 100);
		System.out.println("100�� ��:"+MyCalendarUtil.findDate(cal));
		
		//6���� ��
		cal.add(Calendar.MONTH, -6);
		System.out.println("����� ���� ���� 6���� ��:"+MyCalendarUtil.findDate(cal));
		
		//7�� ��
		cal.add(Calendar.YEAR, -7);
		System.out.println("����� ���� ���� 7����:"+MyCalendarUtil.findDate(cal));
		
	}
	
//	public static String findDate(Calendar cal) {
//		return cal.get(Calendar.YEAR) + "-"
//				+ (cal.get(Calendar.MONTH)+1)
//				+ "-" + cal.get(Calendar.DAY_OF_MONTH);
//	}

}
