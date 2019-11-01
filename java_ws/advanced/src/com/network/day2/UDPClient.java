package com.network.day2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

//데이터를 보내는 측
public class UDPClient {

	public static void main(String[] args) {
		try {
			InetAddress inetAddr=InetAddress.getByName("172.16.146.29");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("보낼 데이터 입력!");
			
			DatagramPacket packet=null;
			DatagramSocket socket=new DatagramSocket();
			
			String data="";
			while((data=sc.nextLine())!=null) {
				if(data.equalsIgnoreCase("X")) break;
				
				byte[] arr=data.getBytes();
				packet=new DatagramPacket(arr, arr.length, inetAddr, 7799);
				
				socket.send(packet);
				System.out.println("보낼 내용 입력!");
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
