package com.io.day2;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("text/test.txt");
		
		if(!file.exists()) {
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		
		String name=file.getName();
		System.out.println("파일명-"+ name);
		System.out.println("절대경로-"+ file.getAbsolutePath());
		System.out.println("파일이 속해있는 디렉토리-"+ file.getParent());
		System.out.println("경로포함한 파일명-"+ file.getPath());
		
		System.out.println("separator - "+ File.separator);
		System.out.println("pathSeparator - "+ File.pathSeparator);
		
		//test.txt
		int idx=name.lastIndexOf(".");
		System.out.println("확장자-"+name.substring(idx+1));
		System.out.println("순수파일명-"+name.substring(0,idx));
		
		File f = new File("text/abc.txt");
		try {
			boolean bool=f.createNewFile();
			System.out.println("파일 생성 여부 bool="+bool);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(f.exists()) {
			System.out.println("파일이 생성됨!");
		}
		
		
	}

}


