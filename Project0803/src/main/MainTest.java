/*
main() �޼����� �μ��� args�� ����غ���
��?? �Ӹ���������...
main �����ڰ� ���Ҷ� ������� ȣ���� �� �ִ�
�޼��尡 �ƴ϶�, ���ø����̼��� ���۵ɶ�
���� �ѹ� ȣ��Ǵ¸޼����̴�..
java.exe  ���Ͽ� ���� �ڵ�ȣ��...

�ٳ��� ���� ����
String[] arr = new String[3];
arr[0]="�ٳ���";
arr[1]="����";
arr[2]="����";
*/
package main;
class  MainTest{
	public static void main(String[] args){
		System.out.println("���α׷� ����� �Ѱܹ��� �μ��� ������ "+args.length);
		
		for(int i=0; i<args.length;i++){
			System.out.println(args[i]);
		}
	}
}
