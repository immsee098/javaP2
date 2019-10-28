package com.awt.day1;

import java.awt.FileDialog;
import java.awt.Frame;

public class FileDialogTest {

	public static void main(String[] args) {
		/*FileDialog - ������ ���ų� ������ �� ���Ǵ� Dialog
		 * 
		������
		FileDialog(Frame parent, String title, int mode)
		mode : FileDialog.LOAD, FileDialog.SAVE �� �ϳ�
		
		FileDialog(Frame parent, String title)
		mode�� �����ϸ� ����Ʈ�� LOAD�� ����*/

		Frame f = new Frame("FileDialog����");
		
		FileDialog fd = new FileDialog(f, "���� ����", FileDialog.SAVE);
		
		f.setSize(400, 300);
		f.setVisible(true);
		
		fd.setDirectory("d:\\lecture");
		fd.setVisible(true);
		
		System.out.println(fd.getDirectory()+fd.getFile());
		//��Ҹ� ������ null�� ��ȯ
	}

}
