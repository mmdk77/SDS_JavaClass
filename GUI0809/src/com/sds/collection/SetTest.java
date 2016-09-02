/*
 �������� ���ִ� ��ü�� ǥ���� Set �� ���� �н��Ѵ�
 Set�� ���� ��ü �� HashSet�� �н�����!!
 */
package com.sds.collection;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.JButton;
public class SetTest {
	public static void main(String[] args) {
		//Generic Type : �÷��� �����ӿ��� ä���� ����������
		//�������� �� �ִ�
		HashSet<JButton> set = new HashSet<JButton>();
		
		//auto boxing 
		int x=3;
		Integer i = new Integer(3);
		
		//set.add(x); //���� �������� �Ѵ�!!
		//�ٵ� �� �ȳ���??  �÷��� �����ӿ��� �޼����μ���
		//int �� ������ �⺻ �ڷ����� ����ϸ� �ڵ����� Wrapper
		//��ü�� ��ȯ�Ǿ�����..��?? �������� �ǵ��� �ľ��Ͽ�
		//���ŷ��� �ʰ� ���ذ�..
		
		//set.add("���"); //String ��ü�� �� 
		set.add(new JButton("����ư")); //JButton �� ��
		set.add(new JButton("�ʹ�ư"));
		set.add(new JButton("���ư"));
		
		//��� ��ü�� ������ �ٲٽÿ�!!
		Iterator it=set.iterator();
		
		while(it.hasNext()){
			JButton bt=(JButton)it.next();
			System.out.println(bt.getText());
		}
		
		
	}

}









