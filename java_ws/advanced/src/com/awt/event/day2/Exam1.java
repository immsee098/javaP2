package com.awt.event.day2;

import java.awt.*;
import java.awt.event.*;

public class Exam1  extends Frame {
	Label q1;
	Label q2;
	Label score;
	Checkbox q1cb1, q1cb2, q1cb3, q1cb4;
	Checkbox q2cb1, q2cb2, q2cb3, q2cb4;
	CheckboxGroup group;
	Button end;

	public  Exam1(String title) {
		super(title); // Frame(String title)�� ȣ���Ѵ�.

		init();

		addEvent();
	}

	private void addEvent() {
		end.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float totalScore=0;
				//String str="";

				if(q1cb1.getState()){	
					totalScore += 12.5;
					//str = q1cb1.getLabel();
				}

				if(q1cb2.getState())	totalScore += 12.5;
				if(q1cb3.getState())	totalScore += 12.5;
				if(q1cb4.getState())	totalScore += 12.5;
				if(q2cb3.getState())	totalScore += 50;

				score.setText("* ��� : ����� ������ " + totalScore + "�� �Դϴ�.");
			}
		});
	}

	private void init() {
		setLayout(new GridLayout(13,1));

		q1 = new Label("1. ������ ActionEvent�� actionPerformed�޼��尡 ȣ��Ǵ� ����? (��� ��������.)");
		q1cb1 = new Checkbox("Button�� ��������");
		q1cb2 = new Checkbox("TextField���� EnterŰ�� ��������");
		q1cb3 = new Checkbox("MenuItem�� Ŭ��������");
		q1cb4 = new Checkbox("List���� ����Ŭ������ item�� ����������");

		q2 = new Label("2. Frame�� �⺻ LayoutManager��? (�ϳ��� ��������.)");
		group = new CheckboxGroup();
		q2cb1 = new Checkbox("FlowLayout", group, false); 
		q2cb2 = new Checkbox("GridLayout", group, false); 
		q2cb3 = new Checkbox("BorderLayout", group, false); 
		q2cb4 = new Checkbox("CardLayout", group, false); 

		score = new Label("* ��� :");
		end = new Button("�� ��ư�� �����ø� ����� �˼� �ֽ��ϴ�.");

		add(q1);
		add(q1cb1);	add(q1cb2);	add(q1cb3);	add(q1cb4);
		add(new Label("")); // ������ ���̿� �� ���� �ϳ� �����ϱ� ���� ���
		add(q2);
		add(q2cb1);	add(q2cb2);	add(q2cb3);	add(q2cb4);
		add(end);
		add(score);

		setSize(500, 300);
		setVisible(true);
	}

	public static void main(String args[]) {
		Exam1 mainWin = new Exam1("Exam1 - Quiz");
	}       
}