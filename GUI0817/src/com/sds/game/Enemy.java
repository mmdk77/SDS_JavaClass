/*
 * ������ �����Ѵ�!!
 * */
package com.sds.game;

import java.awt.Graphics;

public class Enemy extends GameObject{
	//������ �¾�� ������ ������ !!!
	public Enemy(int x, int y, int width,int height, String name){
		super(x, y, width, height, name);
	}
	
	public void tick(){
		x+=velX;
		y+=velY;
	}
	
	//������ ��� �׷����� ����
	public void render(Graphics g) {
		g.drawOval(x, y, width, height);
	}
	
}




