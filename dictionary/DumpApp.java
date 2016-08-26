/*
	������ �о�鿩, �ݷ��� �������� ���ʰ� �������� 
	������ ������ Ű�����, ������ �������� �����
 db�� insert ��Ų��!

*/
import java.io.*;

class DumpApp{
	String path="C:/java_workspace/dictionary/AtoZ.txt";
	String target="C:/java_workspace/dictionary/sql.txt";

	FileInputStream fis;
	FileOutputStream fos;
	InputStreamReader reader;
	BufferedReader buffr;
	BufferedWriter buffw;

	public DumpApp(){
		try{
			fis = new FileInputStream(path);
			fos=new FileOutputStream(target);
			buffr = new BufferedReader(new InputStreamReader(fis));
			buffw = new BufferedWriter(new OutputStreamWriter(fos));
			System.out.println("success");
			
			String data=null;

			while(true){
				data=buffr.readLine();
				if(data==null)break;
				String[] word=data.split(":");
				System.out.println(word[0]);
				buffw.write("insert into dictonary(word,description) values('"+word[0]+"','"+word[1]+"');\n");
				buffw.flush();
			}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){

		}finally{
			try{
				buffw.close();
				buffr.close();
			}catch(IOException e){
			}
		}
	}

	public static void main(String[] args){
		new DumpApp();
	}
}
