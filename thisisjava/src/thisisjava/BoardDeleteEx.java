package thisisjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDeleteEx {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			// JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@192.168.111.220/orcl";
			String user = "java";
			String passwd = "oracle";
			
			// 연결하기
			conn = DriverManager.getConnection(url, user, passwd);
		
			// 매개변수화된 SQL 문 작성
			String sql = "DELETE FROM boards WHERE bwriter=?";
			
			// PreparedStatement
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  "winter");
			
			// SQL 실행
			int rows = pstmt.executeUpdate();
			System.out.println("삭제한 행 수: " + rows);
			
			// PreparedStatement 닫기
			pstmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					// 연결 끊기
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
}
