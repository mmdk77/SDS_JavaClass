/*
  JTable  �����⿡ �Ұ��ϱ� ������ ���� �����͸� ������
  ��ü��  TableModel �� �����Ͽ�,  ȸ������ ���α׷���
  �����  JTable �� ������ �����͸� ó���غ���!!
*/
package com.sds.collection;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class MemberModel extends AbstractTableModel{
	String[] column={"ID","Password","Name"};
	//String[][] data=new String[0][0];
	
	//�迭�� �� ũ�Ⱑ �����Ǿ� �����Ƿ�, �÷��� �����ӿ�
	//�� �̿��Ͽ� ����� ��������!!
	ArrayList<String[]> list = new ArrayList<String[]>();
	
	public int getColumnCount(){
		return column.length;
	}
	public String getColumnName(int col) {
		return column[col];
	}
	public int getRowCount() {
		return list.size();
	}
	public Object getValueAt(int row, int col) {
		String[] record=list.get(row);
		return record[col];
	}	
	public boolean isCellEditable(int row, int col) {
		//System.out.println(row+","+col+"�����ұ��?");
		if(col==1){
			return false;
		}else{
			return true;
		}
	}
	@Override
	public void setValueAt(Object v, int row, int col) {
		System.out.println(v+" ���� "+row+","+col+" �� ������!!");
		String[] record=list.get(row);
		record[col]=(String)v;		
	}
}









