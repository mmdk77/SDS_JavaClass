package com.iot.main;

class MainTest{
	public void test(String[] k){
		for(int i=0;i<k.length;i++){
			System.out.println(k[i]);
		}
		k[0]="����";
	}
	public static void main(String[] args){
		MainTest mt = new MainTest();
		String[] arr = new String[3];
		arr[0]="���";
		arr[1]="����";
		arr[2]="������";

		mt.test(arr);
		System.out.println(arr[0]);
	}
}
