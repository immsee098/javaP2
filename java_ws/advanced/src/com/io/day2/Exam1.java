package com.io.day2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exam1 {

	public static void main(String[] args) {
		FileReader fr=null;
		FileWriter fw=null;
		BufferedReader br=null;
		BufferedWriter bw=null;
		
		try {
			fr=new FileReader("text/poetry.txt");
			fw=new FileWriter("text/poetry.bak");
			
			br=new BufferedReader(fr);
			bw=new BufferedWriter(fw);
			
			String line="";
			while((line=br.readLine())!=null) {
				//System.out.println(line);
				bw.write(line);				
				bw.newLine();
			}
			System.out.println("ภ๚ภๅตส!");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(br!=null)br.close();
				if(bw!=null)bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
