package com.network.day2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer2 {

	public static void main(String[] args) {
		
		ServerSocket serverSocket=null;
		
		try {
			System.out.println(TcpServer1.getTime() + "서버가 준비되었습니다.");
			
			serverSocket=new ServerSocket(7777);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			System.out.println(TcpServer1.getTime()+"연결요청을 기다립니다.\n");
			
			try {
				Socket socket=serverSocket.accept();
				
				System.out.println(TcpServer1.getTime()
					+ socket.getInetAddress()+"로부터 연결요청이 들어왔습니다.");
				
				DataOutputStream dos
					=new DataOutputStream(socket.getOutputStream());
				
				dos.writeUTF("서버입니다.");
				
				InputStream is=socket.getInputStream();
				DataInputStream dis=new DataInputStream(is);
				
				System.out.println("클라이언트에서 받은 메시지:"+ dis.readUTF());
				
				dos.close();
				dis.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}//while
		
	}

}
