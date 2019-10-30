package com.network.day1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddrTest {

	public static void main(String[] args) {
		try {
			InetAddress inet=InetAddress.getByName("www.naver.com");
			System.out.println(inet);
			
			System.out.println("ip: "+inet.getHostAddress());
			System.out.println("host: "+inet.getHostName());
			
			InetAddress localInet=InetAddress.getLocalHost();
			System.out.println("\nlocal ip: "+ localInet.getHostAddress());
			System.out.println("local host: "+localInet.getHostName());
			
			System.out.println("\n===============");
			InetAddress[] inetArr
				=InetAddress.getAllByName("www.naver.com");
			for(int i=0;i<inetArr.length;i++) {
				System.out.println("ip - " 
						+ inetArr[i].getHostAddress());
				System.out.println("host - " 
						+ inetArr[i].getHostName()+"\n");
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
