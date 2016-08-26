/*
������ �������� �ڹ� ���α׷����� �о�鿩, 
���ϴ� ���丮�� ������Ű��!! = ����

�ڹٿ����� ����°� ���õ� �����  java.io ��Ű��
���� �����Ѵ�
�� ���������� ���� ����� ���� ��� �� ������ ���
���� ��  io ó���� �ǽ��غ���
*/
package com.sds.stream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileCopy{
	FileInputStream fis; //������ ������� �� �Է½�Ʈ��
	FileOutputStream fos; //������ ������� �� ��½�Ʈ��
	String name="C:/java_workspace/GUI0810/res/kim.jpg";
	String dest="C:/java_workspace/GUI0810/res/kim_copy.jpg";

	public FileCopy(){
		//�Ʒ��� �ڵ�� ����� ������ ���ɼ��� �Ȱ��ִ� �ڵ��̴�!!
		//���� �ùٸ��� ���� ��θ� �Ǽ��� ���� ���, ���α׷�
		//�� ���������ᰡ �Ǿ� ������!!
		//����ó���� ����? ������������ ����

		try{
			fis = new FileInputStream(name);
			fos= new FileOutputStream(dest);
			int data; //�о���� �˰��� 1���� �ޱ� ���� ����
			while((data=fis.read()) !=-1){
				System.out.println(data);
				//�о���� ������ �� ���Ͽ� �������!!
				fos.write(data); //1byte ���!!
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
			System.out.println("�������� �ʴ� ��γ׿�!");
		}catch(IOException e){
			System.out.println("���� �б� ����!!");
		}finally{
			/*
			���� ó����  try���̰�, catch���� ����� ����
			������ ó���ؾ� �� ������ �ִٸ� finally����
			�۾����ش�!!
			finally�̶�?  try���̳� catch���� ������ ����δ�
			�ݵ��  finally�� �����ϰ� �Ǿ��ִ�!!���� 
			�ݵ�� ó���ؾ� �� �۾��� ���� �� �ִ�..
			��ǻ� ���� ��κ�  db �ݴ� �۾�,  ��Ʈ�� �ݴ� �۾�
			�� �е������� ���� ����..
			*/
			if(fos!=null){
				try{
					fos.close(); //��Ʈ�� �ݱ�
				}catch(IOException e){
				}
			}
			if(fis!=null){
				try{
					fis.close(); //��Ʈ�� �ݱ�
				}catch(IOException e){
				}
			}

		}
	}

	public static void main(String[] args){
		new FileCopy();	
	}
}
