package com.sds.json;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Profile extends JPanel {
	JPanel p_west; // �˹����� ������ ���� ����
	JPanel p_center; // �׸��尡 ����� ���� �г�
	Toolkit kit;
	Image img;
	Canvas can;
	JLabel la_name, la_gender, la_age;

	public Profile(String url) {
		p_west = new JPanel();
		p_center = new JPanel();

		kit = Toolkit.getDefaultToolkit();
		img = kit.getImage(url);
		
		can = new Canvas() {
			public void paint(Graphics g) {
				g.drawImage(img,0, 0, 100, 100, this);	
			}
		};
		can.setPreferredSize(new Dimension(100, 100));
		
		la_name = new JLabel("�̸�");
		la_gender = new JLabel("����");
		la_age = new JLabel("����");
		
		p_west.setPreferredSize(new Dimension(120, 120));
		//p_west.setBackground(Color.GREEN);
		p_center.setLayout(new GridLayout(3, 1));

		p_west.add(can);

		p_center.add(la_name);
		p_center.add(la_gender);
		p_center.add(la_age);

		setLayout(new BorderLayout());
		add(p_west, BorderLayout.WEST);
		add(p_center);

		setBackground(Color.CYAN);
		setPreferredSize(new Dimension(680, 110));
	}

}
