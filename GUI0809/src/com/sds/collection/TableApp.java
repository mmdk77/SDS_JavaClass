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

public class TableApp extends JFrame implements ItemListener{
	JPanel p_west;
	Choice ch;
	JTable table;
	JScrollPane scroll;
	TableModel model;
	
	public TableApp() {
		p_west = new JPanel();
		ch = new Choice();
		table = new JTable();
		scroll = new JScrollPane(table);
		
		ch.add("���á�");
		ch.add("�ֿϵ���");
		ch.add("ȸ������");
		p_west.add(ch);
		add(p_west, BorderLayout.WEST);
		add(scroll);
		
		ch.addItemListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700,600);
		setVisible(true);
	}

	public void itemStateChanged(ItemEvent e) {
		if(e.getItem().equals("���á�")){
			JOptionPane.showMessageDialog(this, "�������� �����ϼ���");
			return;
		}else if(e.getItem().equals("�ֿϵ���")){
			model = new PetModel(); 
		}else if(e.getItem().equals("ȸ������")){
			model = new MemberModel();
		}
		table.setModel(model);
		table.updateUI();
	}	
	public static void main(String[] args) {
		new TableApp();

	}



}
