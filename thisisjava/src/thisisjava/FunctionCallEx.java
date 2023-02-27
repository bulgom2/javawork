package thisisjava;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class FunctionCallEx {

   public static void main(String[] args) {
      Connection conn = null;
      try {
         Class.forName("oracle.jdbc.OracleDriver");
         conn = DriverManager.getConnection(
               "jdbc:oracle:thin:@192.168.111.220:1521/orcl",
               "java",
               "oracle"
               );
         
         String sql = "{? = call user_login(?, ?)}";
         CallableStatement cstmt = conn.prepareCall(sql);
         
         cstmt.registerOutParameter(1,  Types.INTEGER);
         cstmt.setString(2, "winter");
         cstmt.setString(3, "12345");
         
         cstmt.execute();
         int result = cstmt.getInt(1);
         cstmt.close();
         
         String message = "";
         
         switch(result) {
            case 0: message += "로그인 성공"; break;
            case 1: message += "비밀번호가 틀림";   break;      
            default: message += "아이디가 존재하지 않음";
         }
         
         System.out.println(message);
      } catch (Exception e) {
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