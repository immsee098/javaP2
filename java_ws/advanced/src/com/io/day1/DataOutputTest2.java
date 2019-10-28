package com.io.day1;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputTest2 {

	public static void main(String[] args) {
		int[] arr= {90,95,77,89,65,100};
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("text/score.dat");
			dos = new DataOutputStream(fos);
			
			for(int i=0; i<arr.length;i++) {
				dos.writeInt(arr[i]);
			}
			System.out.println("저장완료");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
