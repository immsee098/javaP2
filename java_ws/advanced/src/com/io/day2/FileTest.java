package com.io.day2;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("text/test.txt");
		
		if(!file.exists()) {
			System.out.println("������ �������� �ʽ��ϴ�.");
			return;
		}
		
		String name=file.getName();
		System.out.println("���ϸ�-"+ name);
		System.out.println("������-"+ file.getAbsolutePath());
		System.out.println("������ �����ִ� ���丮-"+ file.getParent());
		System.out.println("��������� ���ϸ�-"+ file.getPath());
		
		System.out.println("separator - "+ File.separator);
		System.out.println("pathSeparator - "+ File.pathSeparator);
		
		//test.txt
		int idx=name.lastIndexOf(".");
		System.out.println("Ȯ����-"+name.substring(idx+1));
		System.out.println("�������ϸ�-"+name.substring(0,idx));
		
		File f = new File("text/abc.txt");
		try {
			boolean bool=f.createNewFile();
			System.out.println("���� ���� ���� bool="+bool);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(f.exists()) {
			System.out.println("������ ������!");
		}
		
		
	}

}


