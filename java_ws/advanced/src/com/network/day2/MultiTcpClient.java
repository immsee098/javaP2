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

import com.network.day2.TcpClientGui.ClientReceiver;

public class MultiTcpClient extends JFrame implements ActionListener{
	private JScrollPane scrollpane;
	private JTextArea ta;
	private JTextField tf;
	private JButton btSend;
	private JPanel pl;
	
	private DataOutputStream dos;
	private String name;
	
	public MultiTcpClient() {
		super("[Client]");
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
		
		tf=new JTextField();
		btSend=new JButton("전송");
		
		pl.add(tf, "Center");
		pl.add(btSend, "East");
		
		add(pl, "South");
		
		ta=new JTextArea();
		scrollpane=new JScrollPane(ta);
		add(scrollpane, "Center");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,600);
		setVisible(true);		
	}

	public static void main(String[] args) {
		MultiTcpClient f = new MultiTcpClient();
		f.startMain();		
	}

	private void startMain() {
		name=JOptionPane.showInputDialog("닉네임을 입력하세요");
		setTitle("[ Client - "+ name+" ]");
		
		String host="172.16.146.1";
		int port=8899;
		
		try {
			Socket socket=new Socket(host, port);
			dos=new DataOutputStream(socket.getOutputStream());
			
			dos.writeUTF(name);
			
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
			try {
				while(dis!=null) {
						ta.append(dis.readUTF()+"\n");
				}
			} catch (IOException e) {
				//e.printStackTrace();
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btSend || e.getSource()==tf) {
			sendMsg();
		}
	}

	private void sendMsg() {
		try {
			if(dos!=null) {
				dos.writeUTF("["+name+"] "+tf.getText());
				tf.setText("");
				tf.requestFocus();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
