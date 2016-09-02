/*
	JTable ���� ������ �����͸� ����������!!
*/
package com.sds.shopping.admin.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import com.sds.shopping.admin.main.AppMain;

public class ProductModel extends AbstractTableModel{
	String[] columns={
			"��ǰ�ڵ�","����ī�װ�","��ǰ��","����","���"
			,"�󼼼���","�̹���"
	};
	ArrayList<String[]> list=new ArrayList<String[]>();
	
	public ProductModel() {
		selectAll();
	}
	
	//��� ���ڵ� ��������
	public void selectAll(){
		Connection con=AppMain.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		//�ֽſ� ��ϵ� ���ڵ带 ���������ְ� �ʹ� = ����
		//�ݴ�� = ����
		String sql="select product_id ,s.title as title ,product_name,price,stock,detail,img from product p, subcategory s ";
		sql=sql+" where p.subcategory_id=s.subcategory_id";
		sql=sql+" order by product_id asc";
		
		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			//����  ArrayList ������ ������ �����!!
			list.removeAll(list);
			
			while(rs.next()){
				//1���� ���ڵ�� 1���� �迭�� ��Ƽ�, list �� ž��
				String[] record = new String[columns.length];
				
				record[0]=Integer.toString(rs.getInt("product_id"));
				record[1]=rs.getString("title");
				record[2]=rs.getString("product_name"); 
				record[3]=Integer.toString(rs.getInt("price"));
				record[4]=Integer.toString(rs.getInt("stock"));
				record[5]=rs.getString("detail");
				record[6]=rs.getString("img");

				list.add(record);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			if(rs!=null){
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
		
	}
	
	//�� ���� �������� ���θ� �����ϴ� �޼���!!
	public boolean isCellEditable(int row, int col) {
		boolean cellFlag=false;
		
		if(col >=2 && col<=5){
			cellFlag=true;
		}else{
			cellFlag=false;
		}
		return cellFlag;
	}
	public int getColumnCount() {
		return columns.length;
	}
	public String getColumnName(int col) {
		return columns[col];
	}
	public int getRowCount() {
		return list.size();
	}
	public Object getValueAt(int row, int col) {
		String[] record=list.get(row);
		return record[col];
	}
	
	//�� ��ǥ(row, col)��  value �� �����ϴ� �޼��� ������!
	public void setValueAt(Object value, int row, int col) {
		String[] record=list.get(row);
		record[col]=(String)value;
		
		//�����Ͱ� ��ȭ�Ǿ����� �˷��ִ� �޼��� ȣ��!!
		fireTableCellUpdated(row, col);
	}
	
}







