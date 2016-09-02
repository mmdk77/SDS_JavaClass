package com.sds.gallery;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Gallery extends JFrame implements ActionListener{
	XCanvas can;
	JPanel p;
	JButton bt_prev;
	JButton bt_next;
	JTextField txt;
	
	public Gallery() {
		can = new XCanvas();
		p = new JPanel();
		bt_prev = new JButton("����");
		bt_next = new JButton("����");
		txt = new JTextField(30);
		
		add(can);
		p.add(bt_prev);
		p.add(txt);
		p.add(bt_next);
		
		add(p, BorderLayout.SOUTH);
		
		//�����ʿ� ��ư ���� 
		bt_prev.addActionListener(this);
		bt_next.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700,650);
		setVisible(true);
	}
	
	//���� �̹��� �����ֱ�
	public void prev(){
		can.count--;
		can.repaint();
	}
	
	//���� �̹��� �����ֱ�
	public void next(){
		//JOptionPane.showMessageDialog(this, "���� �̹���!");
		//XCanvas�� ������ count ������ 1����!!
		can.count++;
		//�ٽ� �׷����� ��û~~ 
		//repaint() --> update() ȭ������ -->paint() �ٽ� �׸�
		can.repaint();
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource(); //�̺�Ʈ�� ����Ų ������Ʈ ��ȯ!!
		
		if(obj.equals(bt_prev)){ //���� ��ư�̶��...
			prev();
		}else if(obj == bt_next){ //���� ��ư�̶��..
			next();
		}
	}
	
	public static void main(String[] args) {
		new Gallery();
	}

}







