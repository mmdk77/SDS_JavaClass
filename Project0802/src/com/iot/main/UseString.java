/*
������ ���� Ŭ�����̸� �繰�� ǥ������ ����..
String Ŭ������ ���� �˾ƺ���!!
����) String Ŭ������ �츮�� �������� ���� �ܺ� Ŭ�����̸�
        Ư�� sun ���� �����ϴ�  javaSE�� �⺻ ��ü�̴�. 
		������, ���� Ŭ�����ʹ� ������ ��Ű���� �����ϹǷ� 
		��Ģ�����δ�  import�Ͽ� �� ��ġ�� ����ؾ� �Ѵ�..
		but ���� �ȳ��� ������??
		java.lang ��Ű���� �����ڰ� ������� �ʴ��� �̹� 
		�ý��������� ��ΰ� �νĵǾ��� �ִ�...���� import
		����� �ƴϴ�!!
		java.lang ��Ű���� ���α׷� ��� �ۼ��� ����� ������
		���� ���� ����ϴ� �ֿ� ��ü���� ��Ƴ��� ��Ű���̱�
		������...
*/
package com.iot.main;

class UseString{
	public static void main(String[] args){
		
		//�Ͻ���, ������ (implicit) ������
		String s = "korea";

		//�����  (explicit)������
		String s1= new String("korea");

		//�Ʒ��� �̿��Ͽ�... korea�� ��� ����Ͻÿ�!!
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			System.out.print(c);
		}
	}
	
}
