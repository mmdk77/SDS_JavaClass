package com.iot.main;

public class UseTV{
	
	public void getInfo(TV tv, int k){
		//�Ű����� tv�� �ν��Ͻ� 1���� �Ѱܼ� �ش� tv�� 
		//������ ����غ���!! = getInfo�� ȣ���غ��ÿ�!!
		tv.printPrice();
	}

	public void test(boolean b, int k){
		System.out.println(b+","+k);
	}

	//�Ʒ��� �޼��忡�� tv������ ���!! 	
	public void showPrice(){
		TV tv = new TV();
		tv.printPrice();
	}

	public static void main(String[] args){
		UseTV ut = new UseTV();
		ut.showPrice();
		ut.test(true,3);

		TV t=new TV();
		t.price=2000;

		ut.getInfo(t , 8);
	}
}
