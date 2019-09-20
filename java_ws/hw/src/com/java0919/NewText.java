package com.java0919;
import java.io.*;
import java.util.*;

public class NewText {

	public static void main(String[] args) {
		Properties prop1 = new Properties();

		String inputFile = "test/abc.txt";

		try {
			prop1.load(new FileInputStream(inputFile));

		} catch(IOException e) {
			System.out.println("������ ������ ã�� �� �����ϴ�.");
			return;
		}

		String name = prop1.getProperty("name");
		String data = prop1.getProperty("data");	
		String fifa = prop1.getProperty("fifa");

		System.out.println("�̸� :" + name);		
		System.out.println("data :" + data);
		System.out.println("fifa : "+fifa);

	}

}
