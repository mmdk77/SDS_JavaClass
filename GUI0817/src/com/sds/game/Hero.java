//���ΰ��� �����Ѵ�!!!
package com.sds.game;
import java.awt.Color;
import java.awt.Graphics;

public class Hero extends GameObject{

	public Hero(int x, int y, int width, int height, String name) {
		super(x, y, width, height, name);
	}

	//������ �������� ��ȭ���� �����ϴ� �޼���!!
	public void tick(){	
		x+=velX;
		y+=velY;
	}
	
	//�ڽ��� ��� �׷����������� �����ϴ� �޼���!!
	public void render(Graphics g){
		//���������� ������ �׷��� �׸��� ���������! (���찳)
		g.setColor(Color.BLACK);
		g.fillRect(0,0, GamePanel.WIDTH, GamePanel.HEIGHT);
		
		//���ΰ� �׸���!
		g.setColor(Color.YELLOW);
		g.drawRect(x, y, 50,50);		
	}
	
}






