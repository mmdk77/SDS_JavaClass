package com.sds.thread;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class AnimationTest extends JFrame implements KeyListener{
	Canvas can;
	int x;
	
	public AnimationTest() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		can = new Canvas(){
			public void paint(Graphics g) {
				g.drawOval(x, 100, 50, 50);
			}
		};
		
		//������� ������ ���� 
		this.addKeyListener(this);
		
		//�˹��� ����!!
		can.setBackground(Color.YELLOW);
		add(can);
		
		//�����츦 ����� ũ��� ������� �׻� ��� ����!!
		
		setSize(800,400);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_SPACE){
			//������ �Ѱ��� �����Ͽ� �۵�!!
			/*			
			Thread thread = new Thread(){
				public void run() {
					while(true){
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						x+=5;	
						can.repaint();
					}
				}
			};
			thread.start();
 			*/
			Bullet bullet=new Bullet(can);
			bullet.start();
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	public static void main(String[] args) {
		new AnimationTest();

	}



}
