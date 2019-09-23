package com.day23;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n날짜를 입력하세요: ");
		String dd = sc.nextLine();
		
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date date = df.parse(dd);
			System.out.println((date.getYear()+1900)+"년 "+(date.getMonth()+1)+"월 "+date.getDate()+"일");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		
	}

}
