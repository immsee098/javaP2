package com.network.day2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TcpServerGui extends JFrame implements ActionListener{
	private JTextArea ta;
	private JScrollPane scrollpane;
	private JTextField tfMsg;
	private JButton btSend;
	private JPanel pl;
	
	private DataOutputStream dos;
	
	public TcpServerGui() {
		super("[SERVER]");
		init();
		addEvent();
	}
	
	private void addEvent() {
		btSend.addActionListener(this);
		tfMsg.addActionListener(this);
	}

	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pl=new JPanel();
		pl.setLayout(new BorderLayout());
		
		ta=new JTextArea();
		scrollpane=new JScrollPane(ta);
		ta.setEditable(false);
		
		add(ta, "Center");
		
		tfMsg=new JTextField();
		btSend=new JButton("전송");
		
		pl.add(tfMsg,"Center");
		pl.add(btSend,"East");
		add(pl, "South");
		
		setSize(500, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		TcpServerGui f =new TcpServerGui();
		
		f.startMain();
	}

	private void startMain() {
		ServerSocket serverSocket=null;
		int port=8888;
		
		try {
			serverSocket=new ServerSocket(port);
			System.out.println(TcpServer1.getTime()+"서버가 준비되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}

		while(true) {
			System.out.println(TcpServer1.getTime()+"연결요청을 기다립니다.");
			
			try {
				Socket socket=serverSocket.accept();
				System.out.println(TcpServer1.getTime()
					+socket.getInetAddress()+", "+ socket.getPort()
					+"로부터 연결요청이 들어왔습니다.");
				
				dos=new DataOutputStream(socket.getOutputStream());
				
				ServerReceiver th=new ServerReceiver(socket);
				th.start();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}//while		
	}

	class ServerReceiver extends Thread{
		DataInputStream dis;
		Socket socket;
		
		ServerReceiver(Socket socket){
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
		if(e.getSource()==tfMsg || e.getSource()==btSend) {
			sendData();
		}
	}

	private void sendData() {
		try {
			if(dos!=null) {
				dos.writeUTF("[Server] "+tfMsg.getText());
				tfMsg.setText("");
				tfMsg.requestFocus();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
