/*
 * JTable �� ������ ������ �� , ȸ�����õ� �����͸� 
 * ó���ϴ� TableModel
 * 
 * ����) TableModel �� ������ ���~~�޼���� �����ڰ�
 * ȣ���ϴ°��� �ƴ϶�, JTable�� ȭ�鿡 �������� ������
 * ȣ���Ѵ�!! �� �ý����� ȣ���Ѵ�!!
 * */
package com.sds.collection;

import javax.swing.table.AbstractTableModel;

public class MemberModel extends AbstractTableModel{
	String[] column={"��ȣ","�̸�","��й�ȣ","�̸���"};
	String[][] data={
			{"1","��浿","0000","kim@naver.com"},
			{"2","ȫ�浿","1111","hong@naver.com"},
			{"3","�̱浿","2222","lee@naver.com"}
	};
	@Override
	public String getColumnName(int col) {
		System.out.println(col+"��° ������ "+column[col]);
		return column[col];
	}
	public int getColumnCount() {
		return column.length;
	}
	public int getRowCount() {
		return data.length;
	}
	public Object getValueAt(int row, int col) {
		//System.out.println(row+","+col+" ȣ��~~"+data[row][col]);
		return data[row][col];
	}
}





