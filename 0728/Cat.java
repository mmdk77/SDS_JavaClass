/*
1.Cat�̶�� �̸��� �����Ŭ������ �����ϵ�, 
    �̸�, ����, (����-����̰�)�� ����� �����Ͻÿ�..

2.Ư�� ������ ��쿣 static ���� �����Ͻÿ�!~

3.���� Ŭ������ main ����θ� �ε�, 
   ������� �̸�,����,������ ����Ͻÿ�.
*/
class Cat {
	String name="����";
	int age=3;
	static String type="����̰�";

	public static void main(String[] args){
		//System.out.println(name);
		int x=3;
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		Cat.type="�����"; //Cat�̶�� Ŭ������ ������ ����
	}
}
