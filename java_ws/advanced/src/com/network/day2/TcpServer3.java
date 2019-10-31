package com.network.day2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer3 {

	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		
		try {
			serverSocket=new ServerSocket(7777);
			System.out.println(TcpServer1.getTime() + "서버가 준비되었습니다.");			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			System.out.println(TcpServer1.getTime() +"연결요청을 기다립니다.\n");
			
			try {
				Socket socket=serverSocket.accept();
				System.out.println(TcpServer1.getTime()
					+ socket.getInetAddress()+"로부터 연결요청이 들어왔습니다.");
				
				System.out.println("상대 port:"+socket.getPort());
				System.out.println("서버에서 생성된 소켓의 port:"
						+ socket.getLocalPort());
		
				DataOutputStream dos
					=new DataOutputStream(socket.getOutputStream());
				dos.writeUTF("서버에서 데이터 보냅니다.");
		
				DataInputStream dis
					=new DataInputStream(socket.getInputStream());
				System.out.println("클라이언트에서 받은 메시지:"+ dis.readUTF());
				
				dis.close();
				dos.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}//while
		
	}

}
