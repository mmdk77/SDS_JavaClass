/*
 * JTable�� ������ ������ �� , �ְ߰��� �����͸� ó���ϴ�
 * TableModel 
 * */
package com.sds.collection;

import javax.swing.table.AbstractTableModel;

public class PetModel extends AbstractTableModel{
	//�Ʒ��� ���~~ �޼���� �����ڸ� ���Ѱ� �ƴ϶�!!
	//JTable�� ȣ���ϴ� �޼����̴�!!
	String[] column={"�̸�","����","����"};
	String[][] data={
			{"�ǹ�","��Ƽ��","��"},
			{"�Ʒ���","��Ƽ��","��"},
			{"�о�","ġ�Ϳ�","��"}
	};
	
	public int getColumnCount() {
		return column.length;
	}
	@Override
	public String getColumnName(int col) {
		return column[col];
	}
	public int getRowCount() {
		return data.length;
	}
	public Object getValueAt(int row , int col) {
		return data[row][col];
	}
}














