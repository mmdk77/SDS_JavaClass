package com.sds.echo2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Vector;

import javax.swing.JTextArea;

public class ServerThread extends Thread{
	Socket client;//aaa
	BufferedReader buffr;
	BufferedWriter buffw;
	JTextArea area;
	Vector<ServerThread> list;
	boolean flag=true; //������ ����� �����带 ������·� ��������
	//����!! ��  while�� ���߱�!!
	
	public ServerThread(Socket client, JTextArea area, Vector list) {
		this.client=client;	
		this.area=area;
		this.list=list;
		
		try {
			buffr = new BufferedReader(new InputStreamReader(client.getInputStream()));
			buffw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//���
	public void listen(){
		try {
			while(flag){
				String msg=buffr.readLine();
				//����͸�  area�� ���!!
				area.append(msg+"\n");
				
				//������ �������ִ� ��� ServerThread  �ν��Ͻ���
				//sendMsg  �޼��� ȣ��!!
				for(int i=0;i<list.size();i++){
					ServerThread st=list.get(i);
					st.sendMsg(msg);
				}	
			}
		} catch (IOException e) {
			//e.printStackTrace();
			area.append("������ �ųʾ��� �������!\n");
			flag=false; //���ѷ��� ���������� 
			//������ �������� ó��..
			//��ܿ��� ����...
			list.remove(this);
			area.append("��ȭ���� �������ϴ�.���� ��ȭ������ "+list.size()+"��");
		}
	}
	
	//���ϰ�
	public void sendMsg(String msg){
		try {
			buffw.write(msg+"\n");
			buffw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//���������� ������ �ڵ��  run() ���� �ۼ��Ѵ�!
	@Override
	public void run() {
		listen();
	}
	
}













