package com.io.day2;

import java.io.File;
import java.util.Scanner;

public class FileTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("디렉토리명 입력!");
		String path=sc.nextLine();
		
		File f = new File(path);
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("존재하지 않거나 디렉토리가 아닙니다.");
			return;
		}
		
		File[] fileArr=f.listFiles();
		for(File file : fileArr) {
			String fileName=file.getName();
			
			String str=file.isDirectory()?"["+fileName+"]" 
					: fileName+"\t"+ file.length()+"byte"; 
			
			System.out.println(str);
		}
		
		
	}

}
