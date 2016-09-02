package com.sds.movie.list;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import com.sds.main.AppMain;

public class MovieModel extends AbstractTableModel{
	ArrayList<String[]> list = new ArrayList<String[]>();
	
	String[] columnName={
			"�帣",
			"��ȭ����",
			"��ȭ�ڵ�",
			"������",
			"�󿵽ð�",
			"�̹���"
	};
	
	public MovieModel() {
		selectAll();
	}
	
	public int getColumnCount() {
		return columnName.length;
	}
	public String getColumnName(int col) {
		return columnName[col];
	}
	public int getRowCount(){
		return list.size();
	}
	public Object getValueAt(int row, int col){
		String[] record=list.get(row);
		return record[col];
	}
	 
	//��ȭ��� �������� 
	public void selectAll(){
		Connection con=AppMain.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select g.title as genre_title, m.title as movie_title, movie_id, openday,showtime,img from movie m, genre g";
		sql=sql+" where m.genre_id=g.genre_id";
		
		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			//������ list �ȿ� ����ִ� �����͸� ����...
			list.removeAll(list);
			
			while(rs.next()){
				//���ڵ� 1�Ǵ� �������迭 1���� ��ƾ��Ѵ�!!
				String[] record = new String[6];
				
				record[0]=rs.getString("genre_title");
				record[1]=rs.getString("movie_title");
				record[2]=Integer.toString(rs.getInt("movie_id"));
				record[3]=rs.getString("openday");
				record[4]=Integer.toString(rs.getInt("showtime"));
				record[5]=rs.getString("img");
						
				list.add(record);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs !=null){
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt!=null){
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		System.out.println(sql);
	}
	
}












