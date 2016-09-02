package com.sds.json;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ProfileApp {
	FileReader reader; //������ ������� �� �Է½�Ʈ��
	BufferedReader buffr;
	String path="C:/java_workspace/GUI0811/res/member.json";
	
	public ProfileApp() {
		try {
			reader = new FileReader(path);
			buffr  = new BufferedReader(reader);
			
			//immutable �Һ�
			String data=null;
			StringBuffer sb = new StringBuffer();
			
			while((data=buffr.readLine()) !=null){
				//System.out.println(data);
				sb.append(data); //sb �� ����!!
			}
			System.out.println("sb �� ���� "+sb.toString());
			
			//�Ľ̽���!!
			JSONParser jsonParser=new JSONParser();
			JSONObject jsonObject=(JSONObject)jsonParser.parse(sb.toString());
			
			JSONArray jsonArray=(JSONArray)jsonObject.get("members");
			
			System.out.println(jsonArray.size());
			for(int i=0;i<jsonArray.size();i++){
				JSONObject member=(JSONObject)jsonArray.get(i);
				
				System.out.println(member.get("name")+","+member.get("gender")+","+member.get("age")+","+member.get("photo"));   
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("json���� �� ������!!");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ProfileApp();
	}

}




