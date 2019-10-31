package com.network.day2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UrlGUI extends JFrame implements ActionListener{
	private JPanel pl1, pl2;
	private JButton btOk;
	private JLabel lb;
	private JTextField tf;
	private JComboBox<String> cbEncoding;
	private JScrollPane scrollpane;
	private JTextArea ta;
	
	public UrlGUI() {
		super("URL");
		init();
		addEvent();
	}
	
	private void addEvent() {
		btOk.addActionListener(this);
	}

	private void init() {
		pl1=new JPanel();
		pl2=new JPanel();
		pl1.setLayout(new BorderLayout());
		pl2.setLayout(new BorderLayout());
		
		lb=new JLabel("URL : ");
		tf=new JTextField();
		cbEncoding=new JComboBox<String>();
		cbEncoding.addItem("UTF-8");
		cbEncoding.addItem("EUC-KR");
		
		btOk=new JButton("»Æ¿Œ");
		
		pl1.add(lb, "West");
		pl1.add(tf, "Center");
		pl1.add(cbEncoding, "East");
		
		pl2.add(pl1, "Center");
		pl2.add(btOk, "East");
		
		add(pl2, "North");
		
		ta=new JTextArea();
		scrollpane=new JScrollPane(ta);
		
		add(scrollpane, "Center");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 700);
		setVisible(true);
	}

	public static void main(String[] args) {
		new UrlGUI();		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btOk) {
			getWebPage();
		}
	}

	private void getWebPage() {
		BufferedReader br=null;
		BufferedWriter bw=null;
		
		try {
			URL url=new URL(tf.getText());
			InputStream is=url.openStream();
			
			String encoding=cbEncoding.getSelectedItem().toString();
			
			br=new BufferedReader(new InputStreamReader(is, encoding));
			bw=new BufferedWriter(new FileWriter("text/web.txt"));
			
			String line="", str="";
			while((line=br.readLine())!=null) {
				str+=line+"\n";	
				
				bw.write(line);
				bw.newLine();
			}
			ta.setText(str);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				bw.close();				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
