package com.network.day1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlTest2 {

	public static void main(String[] args) {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			URL url;
			url = new URL("http://www.yes24.com/24/category/bestseller?Gcode=100_012");
			InputStream is = url.openStream();
			bis = new BufferedInputStream(is);
			
			
			bos = new BufferedOutputStream(new FileOutputStream("text/yes24.txt"));
			int data = 0;
			while((data=bis.read())!=-1) {
				bos.write(data);;
			}
			System.out.println("ภ๚ภๅตส");
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
