//��ȭ������ ó�� ȭ��..
package com.sds.movie.list;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import com.sds.main.AppMain;

public class MovieList extends JPanel implements ActionListener{
	//����
	JPanel p_west;
	ImageIcon icon;
	JLabel la_img;
	Choice ch_genre;
	JTextField t_title, t_movie_id,t_openday, t_showtime;
	JButton bt_img,bt_edit, bt_delete;
	JFileChooser chooser;
	
	//���� 
	JScrollPane scroll;
	JTable table;
	MovieModel movieModel;
	
	//��Ʈ��
	FileInputStream fis;
	FileOutputStream fos;
	
	
	public MovieList() {
		p_west = new JPanel();
		p_west.setBackground(Color.YELLOW);
		p_west.setPreferredSize(new Dimension(150, 500));
		
		//���� ������ ������Ʈ��..
		URL url=this.getClass().getClassLoader().getResource("movie_default.png");
		icon=new ImageIcon(url);
		la_img = new JLabel(icon);
		
		ch_genre =  new Choice();
		getGenre();
		t_title = new JTextField(10);
		t_movie_id = new JTextField(10);
		t_openday = new JTextField(10);
		t_showtime = new JTextField(10);
		
		bt_img = new JButton("�̹��� ���");
		bt_edit = new JButton("����");
		bt_delete = new JButton("����");
		
		chooser = new JFileChooser("C:/Users/student/Downloads");
		
		p_west.add(la_img);
		p_west.add(bt_img);
		p_west.add(ch_genre);
		p_west.add(t_title);
		p_west.add(t_movie_id);
		p_west.add(t_openday);
		p_west.add(t_showtime);
		p_west.add(bt_edit);
		p_west.add(bt_delete);
		
		movieModel = new MovieModel();
		table = new JTable(movieModel);
		scroll = new JScrollPane(table);
		
		setLayout( new BorderLayout());
		add(p_west, BorderLayout.WEST);
		add(scroll);
		
		//��ư�� �����ʿ��� 
		bt_img.addActionListener(this);
		bt_edit.addActionListener(this);
		bt_delete.addActionListener(this);
		
		//���̺�� ���콺�����ʿ� ����!!
		table.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e) {
				int row=table.getSelectedRow();
				
				String genre=(String)table.getValueAt(row, 0);
				String title=(String)table.getValueAt(row, 1);
				String movie_id=(String)table.getValueAt(row, 2);
				String openday=(String)table.getValueAt(row, 3);
				String showtime=(String)table.getValueAt(row, 4);
				String img=(String)table.getValueAt(row, 5);
				
				//������ ���ڵ�� ��ġ�ϴ� �帣�� ���̽� ������Ʈ��
				//���õǾ� �ְ� ó��...
				ch_genre.select(genre);
				
				t_title.setText(title);
				t_movie_id.setText(movie_id);
				t_openday.setText(openday.substring(0,9));
				t_showtime.setText(showtime);
				
				URL url=this.getClass().getClassLoader().getResource(img);
				icon=new ImageIcon(url);
				la_img.setIcon(icon);
			}
		});
	}
	
	//�帣��  db���� �ҷ��� ����!!
	public void getGenre(){
		Connection con=AppMain.getConnection();
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String sql="select * from genre";
		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()){
				ch_genre.add(rs.getString("title"));
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
	
	//���Ϻ��� �� db������Ʈ 
	public void setProfileImg(){
		int result=chooser.showOpenDialog(this);
		
		if(result ==JFileChooser.APPROVE_OPTION){
			//������ ������ ���� ����̺꿡 �ִ� ������, 
			//���� ������Ʈ���� res �� ��������!!
			//������ �������� ���!!
			File file=chooser.getSelectedFile();
			//System.out.println(file.getAbsolutePath());
			
			try {
				fis = new FileInputStream(file);
				String dir="C:/java_workspace/DB0829/res/";
				
				fos = new FileOutputStream(dir+file.getName());
				
				int data;
				byte[] b=new byte[1024];
				while((data=fis.read(b)) !=-1){ //1byte �о����!!
					System.out.println(data);
					fos.write(b);
					fos.flush();
				}
				//db �� ���ϸ���  update
				Connection con=AppMain.getConnection();
				PreparedStatement pstmt=null;
				String sql="update movie set img=? where movie_id=?";
				pstmt=con.prepareStatement(sql);
				pstmt.setString(1, file.getName());
				pstmt.setInt(2, Integer.parseInt(t_movie_id.getText()));
				int updateCount=pstmt.executeUpdate(); //DML �� ���...
				JOptionPane.showMessageDialog(this, updateCount+"���� ���ڵ尡 ����Ǿ����ϴ�.");
				
				//�����ͺ��̽� ��ȸ�� �ٽ� ����Ű��, ���̺� �𵨿�
				//�� ������ �˷��� �Ѵ�!!
				movieModel.selectAll();
				movieModel.fireTableDataChanged();
				table.updateUI();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}catch (SQLException e) {
				e.printStackTrace();
			}finally{
				if(fos !=null){
					try {
						fos.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				if(fis !=null){
					try {
						fis.close();
					} catch (IOException e) {
					e.printStackTrace();
					}
				}
			}
		}
	}
	
	//���ڵ� 1�� ����!!
	public void deleteMovie(){
		Connection con=AppMain.getConnection();
		PreparedStatement pstmt=null;
		
		//���� ����
		String filename=(String)table.getValueAt(table.getSelectedRow(), 5);
		
		File file = new File("C:/java_workspace/DB0829/res/"+filename);
		boolean flag=file.delete(); //���� ����!!
		
		if(flag){
			String sql="delete from movie where movie_id=?";
			try {
				pstmt=con.prepareStatement(sql);
				pstmt.setInt(1, Integer.parseInt(t_movie_id.getText()));
				int result=pstmt.executeUpdate();
				JOptionPane.showMessageDialog(this, result+"���� �����Ǿ����ϴ�.");
	
				//����!!!
				movieModel.selectAll();
				movieModel.fireTableDataChanged();
				table.updateUI();
	
			} catch (SQLException e) {
				e.printStackTrace();
			}finally{
				if(pstmt!=null){
					try {
						pstmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}			
			}
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		if(obj == bt_img){
			setProfileImg();
		}else if(obj == bt_edit){
			
		}else if(obj == bt_delete){
			deleteMovie();
		}
	}
	
}














