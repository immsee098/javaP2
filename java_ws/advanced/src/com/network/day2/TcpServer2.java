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
			System.out.println(TcpServer1.getTime() + "������ �غ�Ǿ����ϴ�.");
			
			serverSocket=new ServerSocket(7777);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			System.out.println(TcpServer1.getTime()+"�����û�� ��ٸ��ϴ�.\n");
			
			try {
				Socket socket=serverSocket.accept();
				
				System.out.println(TcpServer1.getTime()
					+ socket.getInetAddress()+"�κ��� �����û�� ���Խ��ϴ�.");
				
				DataOutputStream dos
					=new DataOutputStream(socket.getOutputStream());
				
				dos.writeUTF("�����Դϴ�.");
				
				InputStream is=socket.getInputStream();
				DataInputStream dis=new DataInputStream(is);
				
				System.out.println("Ŭ���̾�Ʈ���� ���� �޽���:"+ dis.readUTF());
				
				dos.close();
				dis.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}//while
		
	}

}
