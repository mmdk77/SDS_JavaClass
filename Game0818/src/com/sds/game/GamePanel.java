package com.sds.game;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	public static final int WIDTH=1024;
	public static final int HEIGHT=768;
	Thread gameThread;
	boolean running=true;	
	Ship ship;
	ObjectManager objectManager;
	
	
	public GamePanel() {
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		objectManager = new ObjectManager();
		createShip();
		createEnemy();
		createBlock();
	}
	
	//���ΰ� ���� �޼��� 
	public void createShip(){
		ship = new Ship(0, 0, 100,40, "Ship",objectManager);
		objectManager.objectList.add(ship);
	}
	
	//���� ���� �޼��� 
	public void createEnemy(){
		Random random = new Random();
		
		for(int i=0;i<7;i++){
			int n=random.nextInt(9);
			Enemy enemy = new Enemy(WIDTH-100 , n*50 , 100, 85, "Enemy", objectManager);
			objectManager.addObject(enemy);
		}
	}
	
	//�� ���� �޼���
	public void createBlock(){
		//����
		for(int i=0;i<20;i++){
			Block block  = new Block(i*50, 0, 50, 50, "Block", objectManager);
			objectManager.addObject(block);
		}
		
		//�Ʒ���
		for(int i=0;i<20;i++){
			Block block  = new Block(i*50, HEIGHT-50, 50, 50, "Block", objectManager);
			objectManager.addObject(block);
		}
		
	}
	
	protected void paintComponent(Graphics g) {
		/*		
		try {
			Image img=ImageIO.read(this.getClass().getClassLoader().getResource("space.jpg"));
			g.drawImage(img, 0, 0, WIDTH, HEIGHT, this);
		} catch (IOException e) {
			e.printStackTrace();
		}
 		*/
		//��� ���� ������Ʈ��  tick(), render() ȣ��
		for(int i=0;i<objectManager.objectList.size();i++){
			GameObject obj=objectManager.objectList.get(i);
			obj.tick();
			obj.render(g);
		}
		
	}
	
	//���ӽ��� (������ ���� �� ����) 
	public void startGame(){
		if(gameThread!=null){
			return;
		}
		running=true;
		gameThread = new Thread(this);
		gameThread.start(); //Runnable �������� ���Խ�Ű��!!
	}
	//���� ���� ( ������ ���� ) 
	public void pauseGame(){
		running=false;
		gameThread=null;
	}
	
	//���� ���� ( ���μ��� ����)
	public void exitGame(){
		System.exit(0);
	}
	
	public void run() {
		while(running){
			//���⼭ ������ ��� ��ü�� �۵�!!! tick(), render()
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//��� ������Ʈ���� ������� tick(), render()
			repaint(); //update() --> paint()
		}
	}
}










