/*
�޸����� �����θ� ��������...ù���̴ϱ�..
*/
package gui;
import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.TextArea;

class  Memo{
	public static void main(String[] args){
		//�޸��� ������ ���� 
		Frame frame=new Frame();

		//�޴��� ����
		MenuBar bar = new MenuBar();
		
		//�޴���...
		String[] menuTitle={"����","����","����","����","����"};
		Menu[] menus = new Menu[5];

		for(int i=0;i<menus.length;i++){
			menus[i]=new Menu(menuTitle[i]);
			bar.add(menus[i]); //�޴��ٿ� ����!!
		}
		//�����쿡 �޴��� ����!!
		frame.setMenuBar(bar);

		//�޴������۵�...

		//TextArea ����!!
		TextArea area = new TextArea(30,40);
		frame.add(area);

		//������ ũ��,���̰��ϱ�..
		frame.setSize(600,500);
		frame.setVisible(true);
	}
}
