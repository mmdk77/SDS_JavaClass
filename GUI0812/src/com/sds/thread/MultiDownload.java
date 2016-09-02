package com.sds.thread;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class MultiDownload extends JFrame{
	JButton bt;
	MyBar bar1,bar2,bar3;
	Thread t1,t2,t3;
	
	public MultiDownload() {
		setLayout(new FlowLayout());
		bt = new JButton("�ٿ�ε�");
		bar1 = new MyBar(1000);
		bar2 = new MyBar(500);
		bar3 = new MyBar(1500);
		
		add(bt);
		add(bar1);
		add(bar2);
		add(bar3);
		//Runnalble ��  run �޼��带 �������� ��� 
		//Thread ������  Runnable ��ü�� �μ��� �־�� 
		//Runnable �� run �޼��尡 �����ϰ� �ȴ�!!
		//��������? Thread Ŭ������ ��ӹ޾� �ڵ��ۼ��Ϸ��� 
		//������, �̹� �ٸ� Ŭ������ �ڽ��� Ŭ�����ΰ�� ����
		//����� �Ұ����ϹǷ�, �̶� �������̽���  Runnable  ��
		//�̿��� �� �ִ�.
		t1 = new Thread(bar1);
		t2 = new Thread(bar2);
		t3 = new Thread(bar3);

		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.start();
				t2.start();
				t3.start();
			}
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MultiDownload();
	}
}








