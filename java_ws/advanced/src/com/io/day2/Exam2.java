package com.io.day2;

import java.io.File;

public class Exam2 {
	public static void main(String[] args){	
		
		String dirName="C:\\Java\\jdk1.8.0_221";
		File dir=new File(dirName);
		if(!dir.exists() || !dir.isDirectory()) {
			System.out.println("존재하지 않거나 디렉토리가 아닙니다.");
			return;
		}
		
		File[] files = dir.listFiles();
		for (File f: files){
			String str=f.getName();	
			
			if (f.isDirectory()){
				System.out.print(str + "\t");
				System.out.println("DIR");
			}else{  //파일인 경우-zip 파일과 txt 파일만 콘솔에 출력
				if (str.endsWith(".zip") || str.endsWith(".txt")){
					double len=f.length()/1000.0;
					len=Math.round(len*100)/100.0;
					
					System.out.println(str + "\t" + len + "KB");
				}
			}//if
		}//for
		
	}
}
