package com.day23;

import java.util.Date;

public class DateDiff {

	public static void main(String[] args) {
		//2019-12-31���� ��ĥ ���Ҵ���
		Date today = new Date();
		Date baseDay = new Date(2019-1900,11,31);
		
		long gap = (baseDay.getTime() - today.getTime())/1000;
		gap = gap/(24*60*60);
		
		System.out.println("���� ������ ������ "+gap+"�� ���д�");

	}

}
