package com.io.day2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
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

public class Test  extends JFrame implements ActionListener{
		private JLabel lb;
		private JTextField tfUrl;
		private JButton btOk;
		private JTextArea taResult;
		private JScrollPane scrollPane;
		private JPanel pnl, pnl2;
		private JComboBox<String> cbEncoding;	
		public Test() {
			super("URL - GUI 이용");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			pnl=new JPanel(new BorderLayout());
			pnl2=new JPanel(new BorderLayout());
			
			lb=new JLabel("URL : ");
			tfUrl=new JTextField(15);
			btOk=new JButton("확인");
			cbEncoding = new JComboBox<String>();
			cbEncoding.addItem("EUC-KR");
			cbEncoding.addItem("UTF-8");
			
			pnl2.add(tfUrl,"Center");
			pnl2.add(cbEncoding,"East");
			
			pnl.add(lb,"West");
			pnl.add(pnl2,"Center");
			pnl.add(btOk,"East");
			taResult=new JTextArea();
			scrollPane=new JScrollPane(taResult);
			
			add(scrollPane,"Center");
			add(pnl,"North");
			
			setSize(700, 700);
			setVisible(true);
			
			btOk.addActionListener(this);
			tfUrl.addActionListener(this);
		}
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btOk || e.getSource()==tfUrl){
				readUrl();
			}
		}
		private void readUrl() {
			//url을 읽어서 해당 웹페이지 정보를 TextArea에 출력하고, file에도 출력
			BufferedReader br=null;
			BufferedWriter bw=null;
			//StringWriter sw=null;
			try {
				URL url = new URL(tfUrl.getText());
				InputStream in = url.openStream();
							
				br=new BufferedReader(new InputStreamReader(in, 
						cbEncoding.getSelectedItem().toString()));
				bw=new BufferedWriter(new FileWriter("text/url.txt"));
				//sw=new StringWriter(); 
				String line="", str="";
				while((line=br.readLine())!=null){
					bw.write(line);
					bw.newLine();
					
					str+=line+"\n";				
				}			
				taResult.setText(str);			
			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				try {
					if(br!=null) br.close();
					if(bw!=null) bw.close();
					//if(sw!=null) sw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}		
		}
		public static void main(String[] args) {
			new Test();
		}
	}
