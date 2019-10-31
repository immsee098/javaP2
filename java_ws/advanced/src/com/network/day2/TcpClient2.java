package com.network.day2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient2 {

	public static void main(String[] args) {
		String host="172.16.146.1";
		int port=7777;
		
		try {
			Socket socket=new Socket(host, port);
			System.out.println(host+" 서버에 연결요청합니다.");
			
			DataInputStream dis
				=new DataInputStream(socket.getInputStream());
			
			System.out.println("서버에서 받은 메시지:"+ dis.readUTF());
			
			OutputStream os=socket.getOutputStream();
			DataOutputStream dos=new DataOutputStream(os);
			
			dos.writeUTF("클라이언트에서 데이터를 보냅니다.");
			
			dis.close();
			dos.close();
			socket.close();			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
