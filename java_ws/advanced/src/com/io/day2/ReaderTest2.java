package com.io.day2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderTest2 {

	public static void main(String[] args) {
		FileReader fr=null;
		FileWriter fw=null;
		
		try {
			fr=new FileReader("text/poetry4.txt");
			fw=new FileWriter("text/poetry4.bak");
			
			int cnt=0;
			char[] buf=new char[1024];
			while((cnt=fr.read(buf))!=-1) {
				fw.write(buf, 0, cnt);
			}
			System.out.println("���Ͽ� �����!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fr!=null) fr.close();
				if(fw!=null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		

	}

}
