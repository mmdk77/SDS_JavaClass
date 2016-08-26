package com.sds.chatting;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatA extends JFrame implements ActionListener, KeyListener{
	JTextArea area;
	JPanel p;
	JTextField txt;
	JButton bt;
	JScrollPane scroll;
	ChatB chatB;
	
	
	public ChatA() {
		area = new JTextArea();
		p = new JPanel();
		txt = new JTextField(15);
		bt = new JButton("��â");
		
		//��ũ���� �����ϰ����ϴ� ������Ʈ�� �μ��� �ѱ��!!
		scroll = new JScrollPane(area);
		
		//���Ϳ�  area ���� 
		add(scroll);
		
		//�гο� txt�� bt������ ���ʿ� �г��� ����!!
		p.add(txt);
		p.add(bt);
		add(p, BorderLayout.SOUTH);
		
		//��ư�� ������ ���� 
		bt.addActionListener(this);
		txt.addKeyListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(100, 200,300,400);
		setVisible(true);	
	}
	
	//��ư������ ChatB ����!!
	public void actionPerformed(ActionEvent e) {
		//��ư�� ������, ��â�� ���鼭 �� �ּҰ��� ��������!!
		chatB=new ChatB(this);
		
		bt.setEnabled(false);//��ư ��Ȱ��ȭ		
	}
	
	public static void main(String[] args) {
		new ChatA();

	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_ENTER){
			//area�� ������ ���
			String msg=txt.getText();
			area.append(msg+"\n");
			
			//�Է¸޼��� �ʱ�ȭ
			txt.setText("");
			
			//ChatB�� area�� ���� ��������!!
			chatB.area.append(msg+"\n");
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}

}





