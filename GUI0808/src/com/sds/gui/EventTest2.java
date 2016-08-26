package com.sds.gui;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class EventTest2 extends JFrame{
	JButton bt;
	JTextField txt;
	MyListener ms;
	
	public EventTest2() {
		bt = new JButton("����ư");
		txt = new JTextField(15);
		
		setLayout( new FlowLayout());
		add(bt);
		add(txt);
		
		//��ư�� �����ʿ��� ����!
		bt.addActionListener(ms=new MyListener());
		
		System.out.println("setEt() �޼��� ȣ���� ���ּҰ�"+this);
		ms.setEt(this); //call by reference
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,400);
		setVisible(true); 
	}
			
	public static void main(String[] args) {
		new EventTest2();	
	}

}




