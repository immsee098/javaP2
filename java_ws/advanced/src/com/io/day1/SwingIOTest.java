package com.io.day1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SwingIOTest extends JFrame implements ActionListener{
	private JButton btByte, btChar;
	private JTextArea ta;
	private JPanel pl;
	private JScrollPane scrollpane;
	
	public SwingIOTest() {
		super("바이트기반/문자기반 비교");
		
		init();
		
		addEvent();
	}
	
	
	private void addEvent() {
		btByte.addActionListener(this);
		btChar.addActionListener(this);		
	}


	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btByte=new JButton("byte기반");
		btChar=new JButton("char기반");
		
		pl=new JPanel();
		pl.add(btByte);
		pl.add(btChar);
		
		ta=new JTextArea();
		scrollpane=new JScrollPane(ta);
		
		add(scrollpane,"Center");
		add(pl,"North");
	}


	public static void main(String[] args) {
		SwingIOTest f = new SwingIOTest();
		f.setSize(500, 600);
		f.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btByte) {
			openByte();
		}else if(e.getSource()==btChar) {
			openChar();
		}
	}


	private void openChar() {
		
		
	}


	private void openByte() {
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		
		try {
			fis=new FileInputStream("text/poetry2.txt");
			bis=new BufferedInputStream(fis);
			
			int data=0;
			String str="";
			while((data=bis.read())!=-1) {
				str+= (char)data;
			}
			
			ta.setText(str);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bis!=null) bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
