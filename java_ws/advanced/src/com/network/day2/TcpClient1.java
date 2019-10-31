package com.network.day2;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient1 {

	public static void main(String[] args) {
		String ip="127.0.0.1";
		
		System.out.println("서버에 연결중입니다. 서버 ip="+ip);
		
		try {
			// 소켓을 생성하여 연결을 요청한다.
			Socket socket=new Socket(ip, 7777);
			
			//소켓의 입력스트림을 얻는다
			InputStream is=socket.getInputStream();
			DataInputStream dis=new DataInputStream(is);
			
			//소켓으로부터 받은 데이터를 출력한다
			System.out.println("서버로부터 받은 메시지 : "+dis.readUTF());
			System.out.println("연결을 종료합니다.");
			
			//스트림과 소켓을 닫는다
			dis.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
