package com.iot.animal;

public class Dog{
	String name="��Ƽ��";		
	int age;
	String gender="����";

	/**
		��ü �ν��Ͻ� ������ �� �޼���� ������
		ȣ��ǹǷ� �ʱ�ȭ �������� �������!!
	*/
	public Dog(int age, String gender){
		this.age=age;
		this.genger=gender;
	}
	
	public void bark(){
		System.out.print("�۸�");
	}
}

