package com.sds.echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	ServerSocket server; //��ȭ�� X,  ���� ������O
	BufferedReader buffr;
	BufferedWriter buffw;
	
	
	public EchoServer() {
		try {
			server = new ServerSocket(8888); //���� ����!!
			System.out.println("���� ����!");
			
			//������ ����!! ( ��ȭ�ޱ�)
			//�����̶�? ��Ʈ��ũ�� ������ ����� �߻�ȭ�� ��ü 
			//               ���� �����ڴ� ��Ʈ��ũ�� ������ ���
			//               �Ǹ�, ��� �÷��������� ������ �� �� �ִ�.  
			Socket client=server.accept();
			
			String ip=client.getInetAddress().getHostAddress();
			System.out.println(ip+"�� ��	��!!");
			
			//�Է°� ����� ���ѷ����� ó��!!
			buffr = new BufferedReader(new InputStreamReader(client.getInputStream())); 
			buffw=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));  
			
			String data=null;
			while(true){
				data=buffr.readLine(); //Ŭ���̾�Ʈ�� �޼��� �ޱ�!!(�Է�)
				System.out.println(data); //���� �ֿܼ� ����ϱ�!!
				
				//Ŭ���̾�Ʈ���� �ٽ� ������!!
				buffw.write(data+"\n"); //������ ������ �˷��ش�!
				buffw.flush();
			}			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new EchoServer();
	}

}
