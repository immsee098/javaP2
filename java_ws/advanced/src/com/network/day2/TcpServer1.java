package com.network.day2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TcpServer1 {

	public static void main(String[] args) {
		ServerSocket serverSocket=null;
		
		try {
			//���������� �����Ͽ� 7777�� ��Ʈ�� ����(bind)��Ų��
			serverSocket=new ServerSocket(7777);
			System.out.println(getTime()+"������ �غ�Ǿ����ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
		while(true) {
			try {
				System.out.println(getTime()+"�����û�� ��ٸ��ϴ�.\n");
				
				Socket socket=serverSocket.accept();
				// ���������� Ŭ���̾�Ʈ�� �����û�� �� ������ ������ ���߰� ��� ��ٸ���.
                // Ŭ���̾�Ʈ�� �����û�� ���� Ŭ���̾�Ʈ ���ϰ� ����� 
				//���ο� ������ �����Ѵ�.
				System.out.println(getTime()+ socket.getInetAddress()
					+"�κ��� �����û�� ���Խ��ϴ�.");
				
				//������ ��½�Ʈ���� ��´�
				OutputStream os=socket.getOutputStream();
				DataOutputStream dos=new DataOutputStream(os);
				
				//���ݼ��Ͽ� �����͸� ������
				dos.writeUTF("�������� �����͸� �����ϴ�.");
				
				//��Ʈ���� ������ �ݾ��ش�
				dos.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}//while
	}

	public static String getTime() {
		SimpleDateFormat sdf=new SimpleDateFormat("[HH:mm:ss] ");
		Date d = new Date();
		
		return sdf.format(d);
	}

}
