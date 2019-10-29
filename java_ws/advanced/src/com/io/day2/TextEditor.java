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
		// 메뉴에 이벤트 핸들러를 등록한다. 
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
		mFile.addSeparator(); // 메뉴 분리선(separator)을 넣는다. 
		mFile.add(miExit); 

		mb.add(mFile);             // MenuBar에 Menu를 추가한다.
		setMenuBar(mb);            // Frame에 MenuBar를 포함시킨다. 
	}

	// 선택된 파일의 내용을 읽어서 TextArea에 보여주는 메서드 
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

	// TextArea의 내용을 지정된 파일에 저장하는 메서드 
	public void saveAs(String fileName) { 
		FileWriter fw=null; 
		BufferedWriter bw=null; 
		try { 
			fw = new FileWriter(fileName); 
			bw= new BufferedWriter(fw); 
			bw.write(content.getText());  // TextArea의 내용을 파일에 저장한다. 
			
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

	// 메뉴를 클릭했을 때 메뉴별 처리코드 
	class MyHandler implements ActionListener { 
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==miNew) { 
				content.setText(""); 
			} else if(e.getSource()==miOpen) { 
				FileDialog fileOpen = new FileDialog(TextEditor.this, "파일열기"); 
				fileOpen.setVisible(true); 
				fileName = fileOpen.getDirectory() + fileOpen.getFile(); 
				System.out.println(fileName); 
				
				// 선택된 파일의 내용을 TextArea에 보여준다. 
				fileOpen(fileName);
			} else if(e.getSource()==miSaveAs) { 
				FileDialog fileSave = new FileDialog(TextEditor.this,"파일저장",FileDialog.SAVE); 
				fileSave.setVisible(true); 
				fileName = fileSave.getDirectory() + fileSave.getFile(); 
				System.out.println(fileName); 
				
				// 현재 TextArea의 내용을 선택된 파일에 저장한다. 
				saveAs(fileName); 
			} else if(e.getSource()==miExit) { 
				System.exit(0);       // 프로그램을 종료시킨다. 
			} 
		} 
	} // class MyHandler 
}       

