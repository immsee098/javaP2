package com.network.day1;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLTest {

	public static void main(String[] args) {
		BufferedReader br =null;
		
		try {
			URL url 
				= new URL("http://www.yes24.com/24/category/bestseller?Gcode=100_012");
			
			System.out.println("protocol : "+url.getProtocol());
			System.out.println("host : "+url.getHost());
			System.out.println("path : "+url.getPath());
			System.out.println("file : "+url.getFile());
			
			URLConnection urlCon=url.openConnection();
			System.out.println("length : "+urlCon.getContentLength());
			System.out.println("contentType : "+urlCon.getContentType());
			
			InputStream is=urlCon.getInputStream();
			//InputStream is2=url.openStream();
			
			br= new BufferedReader(new InputStreamReader(is));
			
			String line="";
			while((line=br.readLine())!=null) {
				//System.out.println(line);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
