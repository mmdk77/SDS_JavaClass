package com.iot.main;

class UseAccount{
	public static void main(String[] args){
		//������ �ܰ� ����ϱ�!!
		Account acc = new Account();
		System.out.println(acc.getTotal());
		
		acc.setTotal(780000);
		System.out.println(acc.getTotal());

	}
}
