package com.java0923;

import java.util.Date;

public class DateTest1 {

	public static void main(String[] args) {
		//Date date = new Date();  //���� ��¥
//		System.out.println("���� ��¥:"+date); 
//		System.out.println("���� ��¥:" +date.toLocaleString() );
//		int year = date.getYear(); 
//		int month = date.getMonth(); //0~11 
//		int day = date.getDate(); 
//		int hours = date.getHours(); 
//		int minutes = date.getMinutes(); 
//		int seconds = date.getSeconds(); 
//		System.out.println("year : " + (year+1900)); 
//		System.out.println("month : " + (month+1));  // month+1 �ؾ� �� 
//		System.out.println("day : " + day); 
//		System.out.println("hours : " + hours); 
//		System.out.println("minutes : " + minutes); 
//		System.out.println("seconds : " + seconds); 
//		System.out.println("���� : " + date.getDay()); //0:�Ͽ���
		//������ �ð��� 1970�� 1��1�� 0�� 0�� 0�ʸ� �������� �и��� ������ ȯ�� 
		Date date = new Date();
		date.setYear(2017-1900);
		date.setMonth(9);
		date.setDate(19);
		date.setHours(14);
		date.setMinutes(26);
		date.setSeconds(17);
		long diff = date.getTime()/1000; 
		diff = diff/(24*60*60);  
		System.out.println("1970-01-01���� ���ñ��� ����� �� �� : " + diff +"��");
		
		

	}

}
