package mlist;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connex {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(
					"jdbc:mysql://@222.119.100.81:3382/matvengers",
					"matvengers",
					"@codehows213"
					);
			System.out.println("연결 성공");
		}
		catch (ClassNotFoundException e){
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결 끊기");
				}
				catch (SQLException e) {}
			}
		}
	}
}