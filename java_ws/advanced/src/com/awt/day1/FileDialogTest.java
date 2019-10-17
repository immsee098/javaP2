package com.awt.day1;

import java.awt.FileDialog;
import java.awt.Frame;

public class FileDialogTest {

	public static void main(String[] args) {
		/*
		  FileDialog - 파일을 열거나 저장할 때 사용되는
			Dialog
		 생성자
		 FileDialog(Frame parent, String title, int mode)
		 mode : FileDialog.LOAD, FileDialog.SAVE 중 하나
		 FileDialog(Frame parent, String title)
		 mode를 생략하면 디폴트로 LOAD가 사용됨
		 */
		
		Frame f = new Frame("Filedialog 연습");
		
		FileDialog fd = new FileDialog(f, "파일열기", FileDialog.LOAD);
		
		f.setSize(400,300);
		f.setVisible(true);
		 fd.setDirectory("d:\\lecture");
		 fd.setVisible(true);
		 
		 System.out.println(fd.getDirectory()+fd.getFiles());

	}

}
