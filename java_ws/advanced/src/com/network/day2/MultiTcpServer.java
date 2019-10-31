package com.network.day2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MultiTcpServer extends JFrame{
	private JTextArea ta;
	private JScrollPane scrollpane;
	
	private HashMap<String, DataOutputStream> map
		=new HashMap<String, DataOutputStream>();
		
	public MultiTcpServer() {
		super("[ Server ]");
		init();
		addEvent();
	}
	
	private void addEvent() {
		
	}

	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ta=new JTextArea();
		ta.setEditable(false);
		
		scrollpane=new JScrollPane(ta);
		add(scrollpane);
		
		setSize(500, 600);
		setVisible(true);
	}

	public static void main(String[] args) {
		MultiTcpServer f = new MultiTcpServer();
		f.startMain();
	}

	private void startMain() {
		int port=8899;
		ServerSocket serverSocket=null;
		
		try {
			serverSocket=new ServerSocket(port);
			ta.append(TcpServer1.getTime()+"서버가 준비되었습니다.\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			ta.append(TcpServer1.getTime()+"연결요청을 기다립니다.\n");
			try {
				Socket socket=serverSocket.accept();
				ta.append(TcpServer1.getTime()+ socket.getInetAddress() 
					+","+ socket.getPort()+"로부터 연결요청이 들어왔습니다.\n");
				
				ServerReceiver th = new ServerReceiver(socket);
				th.start();
			} catch (IOException e) {
				e.printStackTrace();
			}			
		}//while		
	}

	class ServerReceiver extends Thread{
		Socket socket;
		DataInputStream dis;
		DataOutputStream dos;
		
		ServerReceiver(Socket socket){
			this.socket=socket;
			try {
				dis=new DataInputStream(socket.getInputStream());
				dos=new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public void run() {
			String name="";			
			try {
				name=dis.readUTF();
				map.put(name, dos);
				
				sendToAll(name+"님이 입장했습니다.");
				
				ta.append("현재 접속자수 : "+ map.size()+"\n");
				
				while(dis!=null) {
					sendToAll(dis.readUTF());
				}
			} catch (IOException e) {
				//e.printStackTrace();
			}finally {
				map.remove(name);
				
				ta.append(TcpServer1.getTime()+socket.getInetAddress() 
					+ ","+socket.getPort()+"에서 접속을 종료했습니다.\n");
				ta.append("현재 접속자수는 " +  map.size()+"\n");
				
				sendToAll(name+"님이 나갔습니다.");
			}
			
		}
	}		

	public void sendToAll(String data) {
		Iterator<String> iter=map.keySet().iterator();
		while(iter.hasNext()) {
			String key=iter.next();
			
			DataOutputStream dos=map.get(key);
			try {
				dos.writeUTF(data);
			} catch (IOException e) {
				//e.printStackTrace();
			}
		}		
	}

}
