package com.network.day2;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient1 {

	public static void main(String[] args) {
		String ip="127.0.0.1";
		
		System.out.println("������ �������Դϴ�. ���� ip="+ip);
		
		try {
			// ������ �����Ͽ� ������ ��û�Ѵ�.
			Socket socket=new Socket(ip, 7777);
			
			//������ �Է½�Ʈ���� ��´�
			InputStream is=socket.getInputStream();
			DataInputStream dis=new DataInputStream(is);
			
			//�������κ��� ���� �����͸� ����Ѵ�
			System.out.println("�����κ��� ���� �޽��� : "+dis.readUTF());
			System.out.println("������ �����մϴ�.");
			
			//��Ʈ���� ������ �ݴ´�
			dis.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
