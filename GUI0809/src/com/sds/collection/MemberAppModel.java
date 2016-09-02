package com.sds.collection;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class MemberAppModel extends AbstractTableModel{
	String[] column={"���̵�","�̸�","��й�ȣ"};
	ArrayList data = new ArrayList();
	
	public int getColumnCount() {
		return column.length;
	}
	public String getColumnName(int col) {
		return column[col];
	}
	public int getRowCount() {
		return data.toArray().length;
	}
	public Object getValueAt(int row, int col) {
		Object[] array=data.toArray();
		Object[] arr=(Object[])array[row];
		return arr[col];
	}
	
}
