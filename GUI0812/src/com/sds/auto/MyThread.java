/*
 * �ϳ��� ���μ��������� ���������� ����Ǵ� ���ν������
 * ������� �ϸ� Thread Ŭ������ �����Ѵ� 
 * ����) ������� �ڹ��� ������ �ƴϴ�!! ���� �ϴ� ��κ���
 *         �������α׷��� �����尡 �����ȴ�..
 *         c, c#, javascript(=setTimeout()  ���� ����ϰ� ����)
 * */
package com.sds.auto;

public class MyThread extends Thread{
	int count;
	/*�����ڴ� ���������� �����ϰ� ���� �ڵ尡 �ִٸ�
	 run() �޼��带 �������ϸ� �ȴ�!!
	*/
	public void run() {
		while(true){
			try {
				Thread.sleep(1000); //1�ʵ��� non-runnable ���·�
				//�־��!! 1�� ������ �ٽ� runnable �� ����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			count++;
			System.out.println(count);
		}
	}
}











