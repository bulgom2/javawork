package thisisjava;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class BoardWithFileInsertEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;
		
		try {
			// JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");
			// 연결하기
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.111.220:1521/orcl",
					"java",
					"oracle"
					);
			
			// 매개변수화된 SQL 문 작성
			String sql = "" + "INSERT INTO boards (bno, btitle, bcontent, bwriter, bdate, " +
			"bfilename, bfiledata) " + "VALUES(SEQ_BNO.NEXTVAL, ?, ?, ?, SYSDATE, ?, ?)";
//			String sql = new StringBuilder()
//				.append("UPDATE boards SET ")
//				.append("btitle=?, ")
//				.append("bcontent=?, ")
//				.append("bfilename=?, ")
//				.append("bfiledata=? ")
//				.append("WHERE bno=? ")
//				.toString();
	
					
			
		
			
			// PreparedStatement 얻기 및 값 지정
			PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"bno"});
//			PreparedStatement pstmt = conn.prepareStatement(sql);
			Scanner scan = new Scanner(System.in);
			
			System.out.println("TITLE: ");
			String title = scan.nextLine();
//			scan.nextLine();
			
			System.out.println("CONTENT: ");
			String content = scan.nextLine();
//			scan.nextLine();
			
			System.out.println("WRITER: ");
			String writer = scan.nextLine();
//			scan.nextLine();
			
			System.out.println("FILE NAME: ");
			String file = scan.nextLine();
//			scan.nextLine();
			
			
			pstmt.setString(1, title);
			pstmt.setString(2, content);
			pstmt.setString(3, writer);
			pstmt.setString(4, file);
			pstmt.setBlob(5, new FileInputStream("src/thisisjava/images/" + file));
			scan.close();
			
			
			
			
			//sql 문 실행
			int rows = pstmt.executeUpdate();	// pstmt 실행하고 DB에 반영한 행의 개수를 반환
			System.out.println("저장된 행 수: " + rows);
			
			// bno 값 얻기
			if(rows == 1) {
				ResultSet rs = pstmt.getGeneratedKeys();
				if (rs.next()) {
					int bno = rs.getInt(1);
					System.out.println("저장된 bno: " + bno);
				}
			}
			
			pstmt.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결 끊기");
				} catch (SQLException e) {}
			}
		}
	}
}
