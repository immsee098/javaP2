package com.network.day2;

//�����͸� ������ ��
import java.net.*;
import java.io.*;
//�����͸� �޴� ��

public class UDPServer{
	public static void main(String[] args) throws Exception{
		
		byte[] buffer=new byte[100]; //Ŭ���̾�Ʈ(�۽���)�� ���� �����͸� ����� ����Ʈ �迭�� ����
		DatagramSocket ds=new DatagramSocket(7799);//DatagramSocket ������ Ŭ���̾�Ʈ ��Ʈ ��ȣ�� �Ű������� ����
		
		DatagramPacket dp
			=new DatagramPacket(buffer, buffer.length);//���� �迭�� DatagramPacket ��ü ������ �Ű������� ����
		
		while (true){
			ds.receive(dp);//DatagramSocket�� receive()�޼��带 �̿��Ͽ� ��Ŷ�� �޴´�
			byte bmsg[] =dp.getData();//���� �迭�� ��� �����͸� ���ڿ��� ����� ���
			String msg=new String(bmsg, 0, dp.getLength());
			System.out.println(dp.getAddress() + "�� ����>>" +
			dp.getPort() + "�� ��Ʈ���� �� �޽���: " + msg);
		}//while
	}//main
}//
