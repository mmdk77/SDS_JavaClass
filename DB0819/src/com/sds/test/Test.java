package com.sds.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		// 인증을 거친다!! (원격지의 오라클 접속시엔
		// 네트워크가 연결되어있어야 함)
		// java.sql 패키지에서 데이터베이스 관련 클래스지원

		// 데이터베이스에 접속!!
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "java0819";
		String password = "java0819";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// 어떤 데이터베이스 제품을 사용할지 그 드라이버를
		// 먼저 로드해야 한다!!
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로드 성공");

			// 접속 시도!!
			// Connection 인터페이스는 접속 시도시, 성공할 경우
			// 만 메모리에 올라옴..
			con = DriverManager.getConnection(url, user, password);

			if (con != null) {
				System.out.println("접속 성공");

				// 원하는 쿼리문 수행!!
				// 쿼리 수행 인터페이스 사용하여 쿼리문을
				// 네트웍으로 전송한다!!
				String sql = "select * from topcategory";
				pstmt = con.prepareStatement(sql);

				// 쿼리 수행 메서드!!
				rs = pstmt.executeQuery();

				// ResultSet 커서라는 포인터를 지원하므로,
				// 원하는 Record 를 접근하려면, 커서를 옮겨가며
				// 사용해야 한다!!
				rs.next(); // 1 row 전진!!
				rs.next();
				rs.next();
				rs.next();
				String title = rs.getString("title");
				int id = rs.getInt("topcategory_id");

				System.out.println(id + ", " + title);
			} else {
				System.out.println("접속 실패");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패!!");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs!=null){
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(pstmt !=null){
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null){
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}




