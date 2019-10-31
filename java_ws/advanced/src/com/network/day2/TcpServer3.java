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
			System.out.println(TcpServer1.getTime() + "������ �غ�Ǿ����ϴ�.");			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			System.out.println(TcpServer1.getTime() +"�����û�� ��ٸ��ϴ�.\n");
			
			try {
				Socket socket=serverSocket.accept();
				System.out.println(TcpServer1.getTime()
					+ socket.getInetAddress()+"�κ��� �����û�� ���Խ��ϴ�.");
				
				System.out.println("��� port:"+socket.getPort());
				System.out.println("�������� ������ ������ port:"
						+ socket.getLocalPort());
		
				DataOutputStream dos
					=new DataOutputStream(socket.getOutputStream());
				dos.writeUTF("�������� ������ �����ϴ�.");
		
				DataInputStream dis
					=new DataInputStream(socket.getInputStream());
				System.out.println("Ŭ���̾�Ʈ���� ���� �޽���:"+ dis.readUTF());
				
				dis.close();
				dos.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}//while
		
	}

}
