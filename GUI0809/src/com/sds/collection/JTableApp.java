package com.sds.collection;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class JTableApp extends JFrame implements ItemListener{
	JPanel p_west;
	Choice ch;
	JTable table;
	JScrollPane scroll;
	TableModel model;
	
	public JTableApp() {
		p_west = new JPanel();
		ch = new Choice();
		
		ch.add("�弱��");
		ch.add("�ֿϵ���");
		ch.add("ȸ������");
		
		p_west.add(ch);
		
		table = new JTable();
		scroll = new JScrollPane(table);
		
		add(p_west, BorderLayout.WEST);
		add(scroll);
		
		ch.addItemListener(this);
		
		setVisible(true);
		setSize(700, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void itemStateChanged(ItemEvent e) {
		Object obj=e.getItem();
		
		if(obj.equals("�弱��")){
			JOptionPane.showMessageDialog(this, "���ϴ� ������ �����ϼ���");
			return;
		}else if(obj.equals("�ֿϵ���")){
			table.setModel(model=new PetModel());
		}else if(obj.equals("ȸ������")){
			table.setModel(model=new MemberModel());
		}
		table.updateUI(); //ui  ����~! refresh!!
	}
	
	public static void main(String[] args) {
		new JTableApp();

	}


}





