/*
 * �ڹ��� ��� gui ������Ʈ�� ������ �׸��� ��ü�� �Ǿ�
 * �����θ� �׸���. �̶� �׸� �׸��� ������ paint �޼���� ǥ��
 * �Ǹ�, �� paint �޼����� �Ű������� �ȷ�Ʈ������ ��ü�� 
 * Graphics  ��ü�� �μ��� ���޵Ǿ� ����..
 * ex) ��ư�� ������ �׸��� ����..
 * */
package com.sds.gallery;
import java.awt.Canvas;//�ƹ��͵� �׷��� ���� ��ȭ�� �˹���

import javax.swing.JFrame;
public class ImageTest extends JFrame{
	MyButton bt;
	MyCanvas can;
	
	public ImageTest() {
		bt = new MyButton("Ŀ���� ��ư");
		can = new MyCanvas();
		add(can);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ImageTest();
	}

}






