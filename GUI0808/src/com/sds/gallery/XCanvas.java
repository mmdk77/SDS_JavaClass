/*
  ������Ʈ �� Canvas �� ��ӹ޾� �����ڰ� �ֵ��Ͽ�
  �׸��� �׷������� �Ѵ�!!!
  paint �޼��带 ������ �غ���!!
  */
package com.sds.gallery;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
public class XCanvas extends Canvas{
	Toolkit kit=Toolkit.getDefaultToolkit(); // �߻�Ŭ������!!
	Image[] imgs; //�߻�Ŭ������!!
	String[] path={
			"C:/java_workspace/GUI0808/res/1.jpg",
			"C:/java_workspace/GUI0808/res/2.jpg",
			"C:/java_workspace/GUI0808/res/3.jpg",
			"C:/java_workspace/GUI0808/res/4.jpg",
			"C:/java_workspace/GUI0808/res/5.jpg",
			"C:/java_workspace/GUI0808/res/6.jpg",
			"C:/java_workspace/GUI0808/res/7.jpg",
			"C:/java_workspace/GUI0808/res/8.jpg",
			"C:/java_workspace/GUI0808/res/9.jpg",
			"C:/java_workspace/GUI0808/res/10.jpg"
	};
	
	int count=0;
	
	public XCanvas(){
		imgs = new Image[path.length];
		
		for(int i=0;i< imgs.length;i++){
			imgs[i]=kit.getImage(path[i]);
		}
	}
	
	public void paint(Graphics g) {
		g.drawImage(imgs[count], 0, 0, 700, 600, this);
	}
}












