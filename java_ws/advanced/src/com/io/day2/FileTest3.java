package com.io.day2;

import java.io.File;

public class FileTest3 {

	public static void main(String[] args) {
		File f1 = new File("text/test.txt");
		File f2 = new File("text", "test1.txt");
		File f3 = new File("D:\\lecture\\java\\1028\\text\\poetry.txt");
		File f4 = new File("text" + File.separator + "test1.txt");
		
		System.out.println("f1-"+ f1.getName());
		System.out.println("f2-"+ f2.getName());
		System.out.println("f3-"+ f3.getName());
		System.out.println("f4-"+ f4.getName());
		
		System.out.println("f1-"+ f1.getAbsolutePath());
		System.out.println("f2-"+ f2.getAbsolutePath());
		System.out.println("f3-"+ f3.getAbsolutePath());
		System.out.println("f4-"+ f4.getAbsolutePath());
		
		System.out.println("f1 크기-"+f1.length()+"byte");
		System.out.println("f1 존재여부-"+f1.exists());
		System.out.println("f1 read여부-"+f1.canRead());
		System.out.println("f1 write여부-"+f1.canWrite());
		
		File file = new File("rain");
		boolean bool=file.mkdir();
		System.out.println("rain 디렉토리 생성 여부-"+ bool);
		
		File file2 = new File("sun","moon");
		bool=file2.mkdirs();
		System.out.println("sun\\moon 디렉토리 생성 여부-"+ bool);
		
		
		bool=file.renameTo(new File("star")); //rain => star로 이름변경
		System.out.println("이름변경 여부-"+ bool);
		
		if(file2.exists()) {
			bool=file2.delete();
			System.out.println("파일삭제 여부:"+ bool);
		}
		
		
	}

}
