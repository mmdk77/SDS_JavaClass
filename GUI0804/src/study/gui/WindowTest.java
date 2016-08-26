/*�ڹٸ� �����ؼ� ��κ��� �������α׷������� 
 * GUI ������Ʈ�� �����쿡 �÷������� ��ġ����� ��������
 * �� �ִ� ����� �����Ѵ�...
 * �ڹٴ� LayoutManager��� ��ü�� �����ϰ� ����������
 * ������ �˸´� ��ġ������(LayoutManager)�� �����ؼ�
 * ����ϸ� �ȴ�..
  
  1.BorderLayout( ��,��,��,��,������ ������ �����Ǵ� ��ġ
                          ������)
  
  2.FlowLayout (������Ʈ���� �������� ũ�� ������ ���� 
                        �帣���� ó���ϴ� ��ġ������) 
  3.GridLayout (����(�׸���) ������� ������Ʈ�� ��ġ�ϴ�
                         ��ġ������)
  4.GridBagLayout ( GridLayout�� ����� ���� ����������
                             ó���ϴ� ��ġ������) 
   5.CardLayout (ȭ�鿡 ������ ������Ʈ�� ���� 1���� 
                        �����Ű�� ��ġ������)
  */
package study.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class WindowTest {
	
	public static void main(String[] args) {
		Frame f=new Frame();

		Label la_id=new Label("ID");
		Label  la_pw=new Label("PW");
		TextField t_id=new TextField(15);
		TextField t_pw=new TextField(15);
		Button bt=new Button("�α���");
		
		//�����ӿ� FlowLayout�� ��������!!
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		f.add(la_id); //�����쿡 ID ���� ����!!
		f.add(t_id); //�����쿡 id  �ؽ�Ʈ�ʵ� ����!!
		f.add(la_pw); //�����쿡 PW ���� ����!!
		f.add(t_pw); //�����쿡 Pw �ؽ�Ʈ�ʵ� ����!!
		f.add(bt);
			
		//�������� ũ�� ���� �� ���̰� �ϱ�!!
		f.setSize(200,120);
		f.setVisible(true);
	}
}










