/*
 * ���־� ������Ʈ���� ��κ� sun ���� ������ �������س���
 * ���̱� ������ �����ڰ� �ֵ��Ͽ�, �׷��� ó���� �� �ʿ䰡
 * ����.. ������, ������Ʈ �� �����ڰ� �׷��� ó���� �ֵ��Ͽ�
 * ������ �� �ֵ��� �����ϴ� ������Ʈ�� �ִ�..
 * ���� �� �� ����... --> Canvas, JPanel , JFrame ���..
 *                                �� �˹����� �����̳ʷ��� ��� ����.. 
 
  java.awt  ������ Image Ŭ������ �Ϲ��� �ƴ� �߻�Ŭ�����̴�.
  ���� new �� �� ����!!
  �ذ�å) ��Ģ�� �߻�Ŭ������ �ڽĿ� ���� �ϼ��ǹǷ�, Image��
             ��ӹ޾� �޼��带 ���������� �ڽ� Ŭ������ �ν��Ͻ���
             �ø���, �θ� �ö������,,,�ַ� sun ���� �����ϴ�                                 
             ��ü�� �߻��� ��� �ݵ�� �� ��Ģ��� ������ �ʿ��
             ���� �س��� ��찡 ����..
             �ַ�, �̹� �߻�Ŭ������ �ν��Ͻ��� ���������� ���ϰ�
             ���� �� �ִ� ����� �������ش�..
             awt������ Toolkit �� �̿��Ͽ� �̹����� ������ش�..
 * */
package com.sds.gallery;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class MyCanvas extends Canvas{
	Toolkit kit=Toolkit.getDefaultToolkit();
	
	//������ ��� Toolkit �� �̿��Ͽ� �̹����� ���� �� �ִ�!!
	Image img;
	
	public MyCanvas() {
		//setBackground(Color.YELLOW);
		//img = kit.getImage("http://icon.daumcdn.net/w/icon/1606/30/105915014.png");
		img=kit.getImage("C:/java_workspace/GUI0808/res/bird.png");	
	}
	
	public void paint(Graphics g) {
		g.drawRect(100, 50, 200, 200);
		g.drawString("�� �׸� ��Ʈ��", 100, 100);
		g.drawOval(0, 0, 100, 100);
		g.drawImage(img , 0, 100, this);
	}
	
}




















