package com.day21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest2 {

	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
			prop.load(new FileInputStream("text/input.txt"));
			
			String name = prop.getProperty("name");
			String data = prop.getProperty("data");
			
			System.out.println("name : "+name);
			System.out.println("data : "+data);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
