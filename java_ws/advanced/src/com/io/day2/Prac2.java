package com.io.day2;

import java.io.File;

public class Prac2 {

	public static void main(String[] args) {
		File f = new File("C:\\java\\jdk1.8.0_221");
		
		File[] fileArr = f.listFiles();
		for(File file : fileArr) {
			String fileName = file.getName();
			String str="";
			if(file.isDirectory()) {
				str = fileName+" DIR";
			} else {
				if(fileName.endsWith("txt")||fileName.endsWith("zip")) {
					str = fileName+" "+file.length()+"byte";
				}
			}
			
			System.out.println(str);
		}

	}

}
