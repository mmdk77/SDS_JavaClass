class UseComputer{
	public static void main(String[] args){
		Computer c  = new Computer();

		//��ǻ���� �޸𸮸� ����ϰ�,
		int m=c.memory;
		System.out.println("�޸𸮴� "+m);

		//��ǻ�͸� �ѽÿ�!!
		c.turnOn();
	}
}
