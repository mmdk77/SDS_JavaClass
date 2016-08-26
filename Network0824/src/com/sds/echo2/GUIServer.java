/*
	1.Echo �ý���
	   ���� - ���� 1���� �����ڸ� ó���� �� �ִ�!! 
	    
	2.Unicating 
	
	3.MultiCasting(ä��)
	
	���ڼ�����  GUI�� ��������!!
*/
package com.sds.echo2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIServer extends JFrame implements ActionListener, Runnable{
	JPanel p_north;
	JTextField t_port;
	JButton bt;
	JTextArea area;
	JScrollPane scroll;
	ServerSocket server;//���� ������ ����!!! ��ȭ��X 
	Thread acceptTread; //������ ������ ������
	BufferedReader buffr;
	BufferedWriter buffw;
	Vector<ServerThread> list=new Vector<ServerThread>(); //ArrayList�� ����� �����ϳ�, ���ü� ������
	//�־�� ����ȭ�� �������ֹǷ�,�����忡 �����ϴ�..
	
	public GUIServer() {
		p_north = new JPanel();
		t_port = new JTextField("8888",7);
		bt =  new JButton("����");
		area  = new JTextArea();
		scroll = new JScrollPane(area);
		
		area.setBackground(Color.YELLOW);
		p_north.add(t_port);
		p_north.add(bt);
		add(p_north, BorderLayout.NORTH);
		add(scroll);
		
		//��ư�� ������ ���� 
		bt.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(600, 100, 300, 400);
		setVisible(true);
	}
	
	//���� ���� �޼��� 
	public void startServer(){
		String port=t_port.getText();
		
		try {
			server = new ServerSocket(Integer.parseInt(port));
			area.append("���� �����Ϸ�!!\n");
			
			while(true){
				Socket client=server.accept(); //���Ѵ�⿡ ������!!
				String ip=client.getInetAddress().getHostAddress();
				
				area.append(ip+"�� ����!!\n");
				
				//Ŭ���̾�Ʈ�� ������ �����Ǹ�, ������ ��
				//������ ���ƾ� �Ѵ�!!
				ServerThread ct = new ServerThread(client,area,list);
				ct.start();		
				
				//������ �����带 ������ ��ܿ� �߰�!!
				list.add(ct);
				area.append("���� "+list.size()+"�� ������..\n");
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this,"��Ʈ��ȣ�� ���ڷ� ��������!!");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void run() {
		startServer();
	}
	
	public void actionPerformed(ActionEvent e) {
		//������ �����ϱ� ���� ����!!
		acceptTread = new Thread(this);
		acceptTread.start();
		
		//��ư ��Ȱ��ȭ
		bt.setEnabled(false);
	}
	public static void main(String[] args) {
		new GUIServer();

	}

}






