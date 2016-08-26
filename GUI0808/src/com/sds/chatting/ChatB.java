package com.sds.chatting;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatB extends JFrame implements KeyListener{
	JTextArea area;
	JPanel p;
	JTextField txt;
	JScrollPane scroll;
	ChatA chatA;
	
	//�����ڵ� �޼��� �̹Ƿ� �Ʒ��� �ڵ�� ����� �����ϴ�!!
	//�� �����ڸ� ȣ���ϴ� �ڴ� ChatA �� �ν��Ͻ��� �Ѱܾ� �Ѵ�
	public ChatB(ChatA chatA) {
		this.chatA=chatA;
		area = new JTextArea();
		p = new JPanel();
		txt = new JTextField(15);

		// ��ũ���� �����ϰ����ϴ� ������Ʈ�� �μ��� �ѱ��!!
		scroll = new JScrollPane(area);

		// ���Ϳ� area ����
		add(scroll);

		// �гο� txt�� bt������ ���ʿ� �г��� ����!!
		p.add(txt);
		add(p, BorderLayout.SOUTH);
		
		//txt�� �����ʿ��� ���� 
		txt.addKeyListener(this);
		
		setBounds(400, 200,300,400);
		setVisible(true);
	}

	public void keyPressed(KeyEvent arg0) {
	}
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_ENTER){
			//���� chatA�� area�� ���!!
			String msg=txt.getText();
			area.append(msg+"\n"); //���� area
			chatA.area.append(msg+"\n"); //chatA�� area
			txt.setText("");
		}
	}
	public void keyTyped(KeyEvent arg0) {
	}

}





