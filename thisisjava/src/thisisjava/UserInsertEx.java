package thisisjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserInsertEx {
	public static void main(String[] args) {
		
		Connection conn = null;
		
		try {
			// JDBC Driver 등록
			Class.forName("oracle.jdbc.OracleDriver");
			// 연결하기
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521/xe",
					"java",
					"oracle"
					);
			// 매개변수화된 SQL 문 작성
			String sql = "" + "INSERT INTO users (userid, username, userpassword, userage, "
						+ "useremail)" + "VALUES(?, ?, ?, ?, ?)";
			// PreparedStatement 얻기 및 값 저장
			PreparedStatement pstmt = conn.prepareStatement(sql);
			Scanner scan = new Scanner(System.in);
			
			System.out.println("ID: ");
			String id = scan.nextLine();
//			scan.nextLine();
			
			System.out.println("NAME: ");
			String name = scan.nextLine();
//			scan.nextLine();
			
			System.out.println("PW: ");
			String pw = scan.nextLine();
//			scan.nextLine();
			
			System.out.println("AGE: ");
			int age = scan.nextInt();
			scan.nextLine();
			
			System.out.println("EMAIL: ");
			String email = scan.nextLine();
//			scan.nextLine();
			
			
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, pw);
			pstmt.setInt(4, age);
			pstmt.setString(5, email);
			scan.close();
			//sql 문 실행
			int rows = pstmt.executeUpdate();	// pstmt 실행하고 DB에 반영한 행의 개수를 반환
			System.out.println("저장된 행 수: " + rows);
			
			pstmt.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e){
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
