/*
String Ŭ������ Ư¡ 
- �Һ��̴�.. ���� String ���� ����ϸ� 
	 �޸��� ȿ������ ��������..
- ���� �� ������ Constant Pool �� ��ü�� ����
	���� �ߺ��� ��Ʈ���� �ִٸ�, ��Ȱ���Ѵ�..
	String a="korea";
*/
/*
�ڹ��� ��� Ŭ������ (�����ڰ� ������ Ŭ�����̰�
sun�� �����ϴ� api �̰� ��� Object ��� �ֻ���
��ü�� ��ӹ޴´�!!!  
*/
package main;
class StringTest{
	public void test(){
		boolean b=this.equals("���ѹα�");
	}

	public static void main(String[] args){
		String a="���ѹα�";
		String b="���ѹα�";

		System.out.println(a.equals(b));
	}
}
