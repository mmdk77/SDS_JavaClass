class Dog{
	int b=3;
	{
		for(int i=1;){
		
		}
	}

	String name="�ǹ�";
	/*�ν��Ͻ� �ʱ�ȭ ��!!
		- �� Ŭ�����κ��� �����Ǵ� �ν��Ͻ��� ����������
		  �� ������ �����!!
	*/

	/*Ŭ������ ���ʿ� �ε�Ǿ����� ����!!*/
	static{
		System.out.println("static �ʱ�ȭ ������!");
	}
	
	/*Ŭ�����κ��� �ν��Ͻ��� �����ɶ����� ����*/
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ ������!");
	}

	public static void main(String[] args){
		Dog k =new Dog();
		for(int i=1;i<=3;i++){
			new Dog();
		}
		//�̸��� ������, ���� ���ο��� ���� �Ұ���!!
		
		Dog d=new Dog();
	}

}
