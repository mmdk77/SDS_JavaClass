/*
 * ȭ�鿡 ������ ��� ���� ������Ʈ�� �ݵ�� �����ؾ���
 * �޼���� , �ʿ��� �Ӽ��� �����ϱ� ���� �ֻ��� Ŭ���� 
 * */
package com.sds.game;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

abstract public class GameObject {
	int x;
	int y;
	int width;
	int height;
	int velX;
	int velY;
	String name;
	ObjectManager objectManager;
	Rectangle rect;
	
	public GameObject(int x, int y, int width, int height,String name,ObjectManager objectManager) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.name=name;
		this.objectManager=objectManager;
		rect=new Rectangle(x, y, width, height);
	}
	
	abstract public void tick();
	abstract public void render(Graphics g);
	
	//Ŭ�����н��� �����ϴ� �̹�����������  Image ��ü��
	//��ȯ���ִ� �޼���!!
	public Image getImage(String name){
		Image img=null; //���������� �����Ϸ��� �ʱ�ȭ����
		//�����Ƿ�, �ݵ�� �����ڰ� ������� �ʱ�ȭ ����!!!
		
		Class myClass=this.getClass();
		URL url=myClass.getClassLoader().getResource(name);
		try {
			img=ImageIO.read(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return img;
	}
	
	//Rectangle ��ü�� ������ �Ǿ�����, ���� ���������� 
	//�����Ƿ�, ���߽ÿ��� �ð�ȭ ��ų �� �ִ� �޼��� ����..
	//�����Ŀ��� ȣ�� X 
	public void showRect(Graphics g){
		//Graphics �� ��ɿ� 2���� �׷��� ���õ� ����� �� ����..
		Graphics2D g2=(Graphics2D)g;
		g2.setColor(Color.YELLOW);
		g2.draw(rect);
	}

}










