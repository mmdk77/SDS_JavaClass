package com.iot.main;

class UseString2 
{
	public static void main(String[] args){
		int x=1;
		int y=2;
		String s1=new String("apple");
		String s2 = "apple";
		String s3="apple";
		String s4=new String("apple");

		//System.out.println(x==y);
		//System.out.println(s1==s2);

		//String�� ��ü�̹Ƿ�,  s2,s3 �� ���۷��� �����̴�
		//���� �Ʒ��� �ڵ�� ����񱳰� �ƴ� �ּҺ��̴�!!
		//�Ʒ��� �ڵ尡 true �� ������ ������ ���Ǯ�̶�� 
		//������ �����Ǳ� �����̴�. 
		//���Ǯ�� Ư¡  - �ߺ��� ����� �ִٸ�, ���������
		//                      �ʴ´�.
		System.out.println(s2==s3); 
		
		System.out.println(s1==s4);
		
		String s=""; //������ ������ �ϴ� ������ �� ����Ұ�
		//immutable : �Һ�

		for(int i=0;i<10;i++){
			s=s+i; //s0,s1,s2....
		}
		
		//��Ʈ����ü�� �Һ�(=�����Ұ�)�� Ư¡���� ���Ͽ�, �ڹ��� String����
		//�����̶�� ������ �������� �ʴ´�...
		String k="korea";

		for(int i=0;i <10;i++){
			k=k+" fighting";
		}
		System.out.println(k);

		//�ذ�å??  ���� ������ ��ü�� �̿��ϴ°�...
		//����) String Ŭ���� �ƴ�!!
		StringBuffer b = new StringBuffer();
		b.append("korea");
		b.append("fighting"); //���Ӱ� X, ���� b�� ����
		
		//String �� �ƴϱ� ������ toString()�޼���� ��ȯ��Ų��
		//�������!!
		System.out.println(b.toString());
	}
}
