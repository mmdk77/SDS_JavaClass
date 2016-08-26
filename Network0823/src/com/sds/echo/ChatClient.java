package com.sds.echo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements ActionListener{
	JPanel p_south;
	JTextArea ta_msg;
	JScrollPane scroll;
	JTextField tf_insert;
	JButton bt_con;
	Socket client; //��ȭ�� ����!!(������=��ȭ��)
	String ip="70.12.112.90";
	int port=8888;
	BufferedReader buffr; //�Է¿� ��Ʈ��
	BufferedWriter buffw; //��¿� ��Ʈ��
	
	public ChatClient() {
		p_south = new JPanel();
		ta_msg = new JTextArea();
		scroll = new JScrollPane(ta_msg);
		tf_insert = new JTextField(15);
		bt_con = new JButton("����");
		
		p_south.add(tf_insert);
		p_south.add(bt_con);
		
		add(scroll);
		add(p_south, BorderLayout.SOUTH);
		
		//��ư�� ������ ����
		bt_con.addActionListener(this);
		
		//�ؽ�Ʈ�ʵ�� �����ʿ��� 
		tf_insert.addKeyListener(new KeyAdapter(){
			public void keyReleased(KeyEvent e) {
				int key=e.getKeyCode();
				
				if(key==KeyEvent.VK_ENTER){
					//������ �޼��� ������!
					sendMsg();
				}
			}
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,400);
		setVisible(true);
	}
	
	//������ �����ϴ� �޼��� ����
	public void connect(){
		//ip�� ��Ʈ��ȣ�� �̿��Ͽ� ������ ����!!!
		try {
			client= new Socket(ip, port);// ������ �߻�!!
			buffr = new BufferedReader(new InputStreamReader(client.getInputStream())); 
			buffw=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
			System.out.println("ip�� Ȯ�����ּ���...");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("��Ʈ��ũ ������ �߻��߾��!!");
		}
	}
	
	//������ �޼��� ���۸޼��� 
	public void sendMsg(){
		String msg=tf_insert.getText();
		
		try {
			//������
			buffw.write(msg+"\n");
			buffw.flush();
			
			//�ް� 
			String data=buffr.readLine();
			ta_msg.append(data+"\n");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		connect();
	}
	
	public static void main(String[] args) {
		new ChatClient();
	}

}




