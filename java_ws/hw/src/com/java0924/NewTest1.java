package com.java0924;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class NewTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("날짜를 입력하세요"); 
		String str = sc.nextLine();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd/hh/mm/ss"); 
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		try {
		Date date = df.parse(str);
		System.out.println(df2.format(date)); 
		} catch(ParseException e) { 
			e.printStackTrace(); }

//		double num = sc.nextDouble();
//		
//		DecimalFormat df = new DecimalFormat("#,####");
//		System.out.println(df.format(num));
	}

}
