package com.network.day2;

//데이터를 보내는 측
import java.net.*;
import java.io.*;
//데이터를 받는 측

public class UDPServer{
	public static void main(String[] args) throws Exception{
		
		byte[] buffer=new byte[100]; //클라이언트(송신자)가 보낸 데이터를 담아줄 바이트 배열을 생성
		DatagramSocket ds=new DatagramSocket(7799);//DatagramSocket 생성시 클라이언트 포트 번호를 매개변수로 지정
		
		DatagramPacket dp
			=new DatagramPacket(buffer, buffer.length);//버퍼 배열을 DatagramPacket 객체 생성시 매개변수로 지정
		
		while (true){
			ds.receive(dp);//DatagramSocket의 receive()메서드를 이용하여 패킷을 받는다
			byte bmsg[] =dp.getData();//버퍼 배열에 담긴 데이터를 문자열로 만들어 출력
			String msg=new String(bmsg, 0, dp.getLength());
			System.out.println(dp.getAddress() + "로 부터>>" +
			dp.getPort() + "번 포트에서 온 메시지: " + msg);
		}//while
	}//main
}//
