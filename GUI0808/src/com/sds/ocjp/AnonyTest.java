/*
 * Ŭ�����ȿ� Ŭ������ �� �� �ִ°�? �ִ�..
 * */
package com.sds.ocjp;

import java.awt.Canvas;
import java.awt.FlowLayout;
import java.awt.Graphics;import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonyTest extends JFrame{
	Canvas can;
	JButton bt1,bt2;
	
	public AnonyTest() {
		add(can=new Canvas(){
			public void paint(Graphics g) {
				g.drawLine(0, 0, 300, 400);
			}
		}); //�������� ���Ϳ� ĵ���� ����!!
		
		bt1 = new JButton("��ư1");
		
		
		setLayout(new FlowLayout());
		add(bt1);
		
		add(bt2=new JButton(){
			public void paint(Graphics g) {
				g.drawString("����ư2", 0,0);
			}
		});
		
		bt1.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("�� ��ư1");
			}
		});
		
		bt2.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("�� ��ư2");
			}
		});
		
		
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new AnonyTest();
	}
}









