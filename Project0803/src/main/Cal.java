/*
java.exe ����� ������ ������ �� �����͸��Ѱ�
�� �μ��� ���� ���ϴ� ���α׷�..

�Ϲ������� �ڹپ��� �⺻�ڷ���(����,����,����)��
���� ����ȯ��  ��ü���� ����ȯ�� �����ϰ� �ִ�.
������, �⺻�ڷ����� ��ü�ڷ������� ����ȯ�� �����ұ�?
�����ϳ�...��, �⺻�ڷ������� ��ȯ�� �� �ִ� ��� ����.

"true" --> true (String --> boolean)
"2"  --> 2			(String ---> int)
Dog --> 2 (Dog �� �⺻�ڷ������� ������ �� ���ɼ�����
                 �Ұ�)
"3" --> '3' (String --> char)

�ڹپ����� ��� �⺻�ڷ��� ���� 1:1 �� �����ϴ� 
Wrapper Ŭ������ ���� ��ü�ڷ����� �⺻�ڷ�������
����ȯ�� �����ϰ� �ִ�..

����
byte		: Byte
short		: Short
int			: Integer
long		: Long
-----------------------------
�Ǽ� 
float		: Float
double	: Double
------------------------------
����
boolean	:Boolean
*/
package main;
class Cal{
	static int k;
	static public void test(){
	}
	public static void main(String[] args){
		Cal.k
		Cal.test();
		String n1=args[0]; //"1" -->1 
		String n2=args[1]; // "2"
		
		int a=Integer.parseInt(n1); //���ڿ��� ����ȭ��Ŵ
		int b=Integer.parseInt(n2); 

		System.out.println("�μ��� ����"+(a+b));

	}
}
