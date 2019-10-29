package com.io.day2;

import java.awt.FileDialog;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea; 

public class TextEditor extends JFrame { 
	String fileName; 
	JTextArea content; 
	MenuBar mb; 
	Menu mFile; 
	MenuItem miNew, miOpen, miSaveAs, miExit; 
	JScrollPane scrollpane;

	public TextEditor(String title) { 
		super(title); 

		init();
		addEvent();
	} 

	private void addEvent() {
		// �޴��� �̺�Ʈ �ڵ鷯�� ����Ѵ�. 
		MyHandler handler = new MyHandler(); 
		miNew.addActionListener(handler); 
		miOpen.addActionListener(handler); 
		miSaveAs.addActionListener(handler); 
		miExit.addActionListener(handler); 
	}

	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		content = new JTextArea(); 
		scrollpane=new JScrollPane(content);		
		add(scrollpane); 

		mb	= new MenuBar(); 
		mFile	= new Menu("File"); 

		miNew   = new MenuItem("New"); 
		miOpen  = new MenuItem("Open"); 
		miSaveAs = new MenuItem("Save As..."); 
		miExit   = new MenuItem("Exit"); 

		mFile.add(miNew); 
		mFile.add(miOpen); 
		mFile.add(miSaveAs); 
		mFile.addSeparator(); // �޴� �и���(separator)�� �ִ´�. 
		mFile.add(miExit); 

		mb.add(mFile);             // MenuBar�� Menu�� �߰��Ѵ�.
		setMenuBar(mb);            // Frame�� MenuBar�� ���Խ�Ų��. 
	}

	// ���õ� ������ ������ �о TextArea�� �����ִ� �޼��� 
	public void fileOpen(String fileName) { 
		FileReader fr=null; 
		BufferedReader br=null; 
		
		try { 
			fr = new FileReader(fileName); 
			br= new BufferedReader(fr); 
			String str="";

			int ch = 0; 
			while ((ch=br.read())!=-1) { 
				str+=(char)ch;                   
			} 
			
			content.setText(str); 
		} catch(IOException e) { 
			e.printStackTrace();             
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	} 

	// TextArea�� ������ ������ ���Ͽ� �����ϴ� �޼��� 
	public void saveAs(String fileName) { 
		FileWriter fw=null; 
		BufferedWriter bw=null; 
		try { 
			fw = new FileWriter(fileName); 
			bw= new BufferedWriter(fw); 
			bw.write(content.getText());  // TextArea�� ������ ���Ͽ� �����Ѵ�. 
			
		} catch (IOException e) { 
			e.printStackTrace(); 
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
	} 
	
	public static void main(String args[]) { 
		TextEditor f = new TextEditor("Editor"); 
		f.setSize(500, 600); 
		f.setVisible(true); 
	}        

	// �޴��� Ŭ������ �� �޴��� ó���ڵ� 
	class MyHandler implements ActionListener { 
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==miNew) { 
				content.setText(""); 
			} else if(e.getSource()==miOpen) { 
				FileDialog fileOpen = new FileDialog(TextEditor.this, "���Ͽ���"); 
				fileOpen.setVisible(true); 
				fileName = fileOpen.getDirectory() + fileOpen.getFile(); 
				System.out.println(fileName); 
				
				// ���õ� ������ ������ TextArea�� �����ش�. 
				fileOpen(fileName);
			} else if(e.getSource()==miSaveAs) { 
				FileDialog fileSave = new FileDialog(TextEditor.this,"��������",FileDialog.SAVE); 
				fileSave.setVisible(true); 
				fileName = fileSave.getDirectory() + fileSave.getFile(); 
				System.out.println(fileName); 
				
				// ���� TextArea�� ������ ���õ� ���Ͽ� �����Ѵ�. 
				saveAs(fileName); 
			} else if(e.getSource()==miExit) { 
				System.exit(0);       // ���α׷��� �����Ų��. 
			} 
		} 
	} // class MyHandler 
}       

