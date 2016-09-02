/*
	�Ʒ��� ��Ģ�� �� �������(=�ȵ���̵� ���߽� ����)
	1.�˸´� ������ ���� 
	2.�������� �޼��� ������ 
	3.�̺�Ʈ �ҽ�(=�̺�Ʈ�� ����Ų ������Ʈ)�� �����ʿ� ����
*/
package com.sds.gui;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class EventTest extends JFrame implements ActionListener, KeyListener, WindowListener{
	JTextField txt;
	JButton bt;
	
	public EventTest() {
		txt = new JTextField(15);
		bt = new JButton("����ư");
		
		setLayout( new FlowLayout());
		
		add(txt);
		add(bt);
		
		//��ư�� �����ʿ� ����!!
		bt.addActionListener(this);
		
		//�ؽ�Ʈ�ʵ�� �����ʿ���
		txt.addKeyListener(this);
		
		//������� �����ʿ��� ����
		this.addWindowListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300,400);
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("�� ������?");
	}
	
	//Ű�����ʰ� ������ �޼��� �������̵�!!
	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//System.out.println("Ű�ƾ�??");
		
		int key=e.getKeyCode();
		
		if(key == KeyEvent.VK_ENTER){
			System.out.println("�����ƾ�?");	
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	public void windowActivated(WindowEvent arg0) {
		System.out.println("windowActivated ȣ��");
	}
	public void windowClosed(WindowEvent arg0) {
		System.out.println("windowClosed ȣ��");
	}
	public void windowClosing(WindowEvent arg0) {
		System.out.println("windowClosing ȣ��");
	}
	public void windowDeactivated(WindowEvent arg0) {
		System.out.println("windowDeactivated ȣ��");
	}
	public void windowDeiconified(WindowEvent arg0) {
		System.out.println("windowDeiconified ȣ��");
	}
	public void windowIconified(WindowEvent arg0) {
		System.out.println("windowIconified ȣ��");
	}
	public void windowOpened(WindowEvent arg0) {
		System.out.println("windowOpened ȣ��");
	}
	
	public static void main(String[] args) {
		new EventTest();
	}

}



