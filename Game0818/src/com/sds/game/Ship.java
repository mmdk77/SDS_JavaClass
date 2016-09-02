package com.sds.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public class Ship extends GameObject {
	Image img;
	int t;
	
	public Ship(int x, int y, int width, int height, String name,ObjectManager objectManager) {
		super(x, y, width, height, name, objectManager);
		
		//URL �̶� �ڿ��� ��ġ�� �ǹ��Ѵ�!!web--> http://~
		//����--> �ý��۳������� �ڿ��� ��ġ!!
		img=getImage("spaceship.png");
	}

	public void tick() {
		x+=velX;
		y+=velY;
		
		//�ǽð� �簢���� ��ġ�� �ٲ�� �Ѵ�!~~~
		//�׷��� ���ΰ��� ����ٴϴϱ�...�׷��� �浹�˻簡 ����..
		rect.setBounds(x, y, width, height);
	}

	public void render(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);
		g.drawImage(img, x, y, width, height, null);
		
		showRect(g);
	}
	
	//�Ѿ� �߻�!!
	public void fire(){
		Bullet bullet  = new Bullet(x+width, y+(height/2), 50, 15, "Bullet", objectManager);
		objectManager.addObject(bullet);
	}
	


}











