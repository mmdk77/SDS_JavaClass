/*
���Ϻ��� 
*/
package com.sds.stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class FileCopy{
	FileInputStream fis;
	FileOutputStream fos;
	InputStreamReader reader;
	OutputStreamWriter writer;
	BufferedReader buffr;
	
	
	String ori="C:/java_workspace/Network0823/res/data.txt";
	String dest="C:/java_workspace/Network0823/res/data_copy.txt";
	public FileCopy(){
		
		
		try {
			fis= new  FileInputStream(ori);	
			fos = new FileOutputStream(dest);
			
			reader = new InputStreamReader(fis);
			writer = new OutputStreamWriter(fos);
			
			buffr = new BufferedReader(reader);
			
			String data=null;
			int count=0;
			
			while(true){
				data=buffr.readLine(); //���̸��ñ�
				if(data==null)break;
				writer.write(data);//�����!!
				System.out.println(data);
				//writer.flush(); //��½�Ʈ�� ����
				count++;
				System.out.println("read ȸ���� "+count);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

	public static void main(String[] args){
		new FileCopy();
	}
}
