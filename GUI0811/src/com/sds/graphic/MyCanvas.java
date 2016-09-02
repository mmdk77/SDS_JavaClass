/*
  ����Ͽ� ���� �˹����̸�, ����� ���� �ν��Ͻ���
  ����ǹǷ� �� ���뼺�� �����Ƿ� �����͸��ٴ�
  .java �ҽ��� ������ �����Ű��!!
 * */
package com.sds.graphic;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyCanvas extends Canvas implements MouseListener{
	Toolkit kit;
	Image img;
	ThumbnailGallery gallery;
	
	public MyCanvas(String url, ThumbnailGallery gallery) {
		this.gallery=gallery;
		
		kit=Toolkit.getDefaultToolkit();
		img=kit.getImage(url);
		
		//���� �˹��� ��ü�� ���콺 ������ ����!!
		this.addMouseListener(this);
	}

	public void paint(Graphics g) {
		g.drawImage(img, 0,0,50, 50, this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("���콺 ������?");
		
		//�����찡 ������� ū �̹����� ���� �˹����� �̹�����
		//��ü����!!
		gallery.currentImg=img;
		gallery.p_right.repaint();
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
}
