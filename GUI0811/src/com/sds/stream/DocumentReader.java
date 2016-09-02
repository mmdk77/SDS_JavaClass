/*
��Ʈ���� ���� 
1.���⼺ - �Է�, ��� 

2.�������� ���� - ���ڱ��(2 byte �� ��� ������ �� �ִ� ��Ʈ��)
                    - ����Ʈ���(1byte ���� ������ �� �ִ� ��Ʈ��)
*/
package com.sds.stream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DocumentReader {
	FileInputStream fis;
	FileOutputStream fos;
	FileReader reader;
	FileWriter writer;
	BufferedReader buffr; //���� ó���� ���ڱ�� �Է½�Ʈ��
	BufferedWriter buffw; //����ó���� ���ڱ���� ��½�Ʈ��
	
	String ori="C:/java_workspace/GUI0811/res/memo.txt";
	String dest="C:/java_workspace/GUI0811/res/memo2.txt";
	
	public DocumentReader() {
		try {
			//fis = new FileInputStream(ori);
			//fos = new FileOutputStream(dest);
			reader = new FileReader(ori);
			writer = new FileWriter(dest);
			
			buffr = new BufferedReader(reader);
			buffw= new BufferedWriter(writer);
			
			String data=null;
			while((data=buffr.readLine()) !=null){
				System.out.print(data);
				buffw.write(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new DocumentReader();
	}

}





