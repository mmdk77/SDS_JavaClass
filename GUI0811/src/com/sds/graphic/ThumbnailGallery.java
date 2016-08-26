package com.sds.graphic;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ThumbnailGallery extends JFrame {
	JPanel p_left, p_right;
	Image currentImg; //������ ���� ������ ������� �̹���!
	String[] url={
			"C:/java_workspace/GUI0811/res/1.jpg",
			"C:/java_workspace/GUI0811/res/2.jpg",
			"C:/java_workspace/GUI0811/res/3.jpg",
			"C:/java_workspace/GUI0811/res/4.jpg",
			"C:/java_workspace/GUI0811/res/5.jpg",
			"C:/java_workspace/GUI0811/res/6.jpg",
			"C:/java_workspace/GUI0811/res/7.jpg",
			"C:/java_workspace/GUI0811/res/8.jpg",
			"C:/java_workspace/GUI0811/res/9.jpg",
			"C:/java_workspace/GUI0811/res/10.jpg"
	};
	MyCanvas[] can = new MyCanvas[url.length];
	
	public ThumbnailGallery(){
		p_left = new JPanel();
		
		
		for(int i=0;i<can.length;i++){
			can[i] = new MyCanvas(url[i], this);
			can[i].setPreferredSize(new Dimension(50, 50));
			p_left.add(can[i]);	
		}

		//ū �̹��� ���� 
		currentImg=can[0].img;
		
		p_right = new JPanel(){
			public void paint(Graphics g) {
				g.drawImage(currentImg, 0, 0, 400, 350, this);
			}	
		};
		p_right.setPreferredSize(new Dimension(380, 380));
		
		//���� ���� 
		p_left.setBackground(Color.GREEN);
		p_right.setBackground(Color.YELLOW);
		
		//GridLayout ���� 
		setLayout( new GridLayout(1,2));
		
		add(p_left); //������ ����
		add(p_right);//������ ����
	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,600);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ThumbnailGallery();
	}

}





