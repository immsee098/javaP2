package com.network.day2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TcpClientGui extends JFrame implements ActionListener{
	private JScrollPane scrollpane;
	private JTextArea ta;
	private JTextField tf;
	private JButton btSend;
	private JPanel pl;
	
	private DataOutputStream dos;
	private String name;
	
	public TcpClientGui() {
		super("[CLIENT]");
		init();
		addEvent();
	}
	
	private void addEvent() {
		btSend.addActionListener(this);
		tf.addActionListener(this);
	}

	private void init() {
		pl=new JPanel();
		pl.setLayout(new BorderLayout());
		
		ta=new JTextArea();
		scrollpane=new JScrollPane(ta);
		ta.setEditable(false);
		add(scrollpane, "Center");
		
		tf=new JTextField();
		btSend=new JButton("전송");
		pl.add(tf,"Center");
		pl.add(btSend,"East");
		
		add(pl, "South");
		setSize(500, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		name=JOptionPane.showInputDialog("닉네임을 입력하세요");
		setTitle("[Client - "+name +"]");
	}

	public static void main(String[] args) {
		TcpClientGui f = new TcpClientGui();		
		
		f.startMain();
	}

	private void startMain() {
		String host="172.16.146.1";
		int port=8888;
		try {
			Socket socket=new Socket(host, port);
			System.out.println(host+" 서버에 연결합니다.");
			
			dos=new DataOutputStream(socket.getOutputStream());
			
			ClientReceiver th=new ClientReceiver(socket);
			th.start();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	class ClientReceiver extends Thread{
		Socket socket;
		DataInputStream dis;
		
		ClientReceiver(Socket socket){
			this.socket=socket;
			try {
				dis=new DataInputStream(socket.getInputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}					
		}
		
		public void run() {
			while(dis!=null) {
				try {
					ta.append(dis.readUTF()+"\n");
				} catch (IOException e) {
					//e.printStackTrace();
				}				
			}//while			
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tf || e.getSource()==btSend) {
			sendMsg();
		}
	}

	private void sendMsg() {
		if(dos!=null) {
			try {
				dos.writeUTF("["+ name+ "] "+tf.getText());
				tf.setText("");
				tf.requestFocus();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}
	}

}
