package com.io.day1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest1 {

	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("text/poetry.txt");
			fw = new FileWriter("text/poetry.bak");
			
			int data = 0;
			while((data=fr.read())!=-1) {
				if(data!='\t' && data!='\n' && data !=' ' && data!='\r') {
					fw.write(data);
				}
			}
			System.out.println("ภ๚ภๅตส");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
				try {
					if(fr!=null) fr.close();
					if(fw!=null) fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
