/*
������ �ڵ����� ����� ����� ������
*/
package com.iot.main;
/* Ŭ������ ������ ������ ��ü�ڷ����� ���
	Car has a Wheel : has a ����
*/
public class Car{
	//����; 
	private Wheel w; //�� ��
	private Engine e; //���۷��� ������ �������� ���� null
	private Handle h;
	private int price; //0

	//�����ڸ� �����Ͽ� �ʱ�ȭ �۾��� �����غ���!!
	public Car(){
		w=new Wheel();
		e= new Engine();
		h=new Handle();
		price=200;
	}

	public void go(){
		w.roll();
	}
}
