/*
ȸ�� 1���� �����ϴ� ������ Ŭ���� ����!!
*/
package com.sds.client.chatting;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Item extends JPanel{
	JLabel la_profile;
	JLabel la_status;
	ImageIcon icon;

	//��ü ������ �̹��� ��ο� ���¸޼����� �Ѱܹ���!!
	public Item(String path, String status){
		URL url=this.getClass().getClassLoader().getResource(path);
		icon = new ImageIcon(url);
		la_profile = new JLabel(icon);
		la_status = new JLabel(status);
		
		la_status.setAlignmentX(RIGHT_ALIGNMENT);
		setLayout(new BorderLayout());
		add(la_profile, BorderLayout.WEST); //���ʿ� ����
		add(la_status);//���Ϳ� ����
		setPreferredSize(new Dimension(400, 60));
	}
}













