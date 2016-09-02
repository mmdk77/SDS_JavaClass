package com.sds.thread;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//�����带 ��ӹ޾� ����Ϸ��Ҷ�, �̹� �������� �ڽ� Ŭ�������, Runnable  
//�������̽��� �̿��� �� �ִ� 
//Runnable �� run �޼��带 �߻�޼���� ������ �������̽��̴�!!
public class CounterApp extends JFrame implements Runnable{
	JButton bt;
	JLabel la_count;
	int count;
	MyThread thread;
	CounterApp app;
	Thread thread2; //�����͸�����...
	Thread thread3; //Runnable �� �����尡 �ƴϹǷ�, run �޼��带
	//�������Ͽ��� �ϴ��� �����尡 �����ؾ� �Ѵ�!!
	
	public CounterApp() {
		app=this;
		bt  =new JButton("����");
		la_count = new JLabel("0");
		
		setLayout( new FlowLayout());
		
		la_count.setPreferredSize(new Dimension(250, 300));
		la_count.setFont(new Font("arial black", Font.BOLD, 100));
		
		add(bt);
		add(la_count);
		
		thread2= new Thread(){
			public void run(){
				while(true){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					count++;
					la_count.setText(Integer.toString(count));
				}
			}
		};
		
		thread3=new Thread(this);	
		
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//thread = new MyThread(app);
				//thread.start();
				//thread2.start();
				thread3.start();
			}
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,400);
		setVisible(true);
	}
	
	//�� run�޼����  Runnable �������̽� ����!!
	public void run() {
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			count++;
			la_count.setText(Integer.toString(count));
		}		
	}
	
	public static void main(String[] args) {
		new CounterApp();
	}

}





