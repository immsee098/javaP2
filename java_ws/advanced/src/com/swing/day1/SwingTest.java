package com.swing.day1;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class SwingTest extends JFrame implements ActionListener{
	JButton bt1, bt2, bt3, bt4;
	
	public SwingTest() {
		super("Swing 연습");
		
		init();	
		
		addEvent();
	}
	
	private void addEvent() {
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);		
	}

	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icon1 = new ImageIcon("img/input.JPG");
		ImageIcon icon2 = new ImageIcon("img/open.JPG");
		ImageIcon icon3 = new ImageIcon("img/confirm.JPG");
		
		bt1 = new JButton("버튼");
		bt2=new JButton("INPUT", icon1);
		bt3=new JButton("OPEN", icon2);
		bt4=new JButton("CONFIRM", icon3);
		
		bt2.setVerticalTextPosition(JButton.BOTTOM);
		bt2.setHorizontalTextPosition(JButton.CENTER);
		
		bt3.setVerticalTextPosition(JButton.TOP);
		bt3.setHorizontalTextPosition(JButton.CENTER);
		bt3.setToolTipText("풍선 도움말");
		
		ImageIcon icon4 = new ImageIcon("img/exit.JPG");
		bt4.setPressedIcon(icon4);
		bt4.setMnemonic('C'); //단축키 alt+C
		
		bt1.setBorder(new LineBorder(Color.green, 5));
		bt2.setBorder(new TitledBorder("테두리에 제목주기"));
		bt3.setBorder(new BevelBorder(BevelBorder.RAISED));
		bt4.setBorder(new EtchedBorder());
		
		setLayout(new GridLayout(1, 0));
		add(bt1);
		add(bt2);
		add(bt3);
		add(bt4);		
	}

	public static void main(String[] args) {
		SwingTest f = new SwingTest();
		f.setSize(600, 200);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt1) {
			JOptionPane.showMessageDialog(this, "환영합니다.");
		}else if(e.getSource()==bt2) {
			JOptionPane.showMessageDialog(this, "누르지 마세요","경고",
					JOptionPane.WARNING_MESSAGE);
			/*public static void showMessageDialog(Component parentComponent,
            Object message, String title,  int messageType) */
		}else if(e.getSource()==bt3) {
			String name=JOptionPane.showInputDialog(this, "이름을 입력하세요");
			System.out.println("name="+name);
		}else if(e.getSource()==bt4) {
			int result=JOptionPane.showConfirmDialog(this, "종료하시겠습니까?", 
					"종료", JOptionPane.YES_NO_OPTION);
			//public static int showConfirmDialog(Component parentComponent,
            //Object message, String title, int optionType)

			System.out.println("result="+result);
			//예=>0, 아니오=>1
			
			if(result==JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}		
		
	}

}
