package thisisjava;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;



public class BoardUpdateEx {

   public static void main(String[] args) throws FileNotFoundException {
Connection conn = null;
      
      try {
         
         //jdbc driver 등록
         Class.forName("oracle.jdbc.OracleDriver");
         // 연결하기
         conn = DriverManager.getConnection(
               "jdbc:oracle:thin:@192.168.111.220:1521/orcl",
               "java",
               "oracle"
               );
         //매개변수화된 sql문 작성
      String sql = new StringBuilder()
            .append("UPDATE boards SET ")
            .append("btitle=?,")
            .append("bcontent=?,")
            .append("bfilename=?,")
            .append("bfiledata=?")
            .append("WHERE bno=?")
            .toString();
      
//      String sql = "" +
//         "INSERT INTO boards (bno, btitle, bcontent, bwriter, bdate, "
//    		  + "bfilename,bfiledata)" +
//            "VALUES(SEQ_BNO.NEXTVAL,?,?,?,SYSDATE,?,?)";
//      
      // PreparedStatement 얻기 및 갑 지정
      PreparedStatement pstmt = conn.prepareStatement(sql);
      
      pstmt.setString(1, "눈살암");
      pstmt.setString(2, "눈으로 만든 물");
      pstmt.setString(3, "snowman.jpg");
        pstmt.setBlob(4, new FileInputStream("src/thisisjava/images/snowman.jpg"));
      pstmt.setInt(5,1);
      
      //sql문 실행
      int rows = pstmt.executeUpdate(); //pstmt 실행하고 DB에 반영한 행의 개수를 반환
      System.out.println("저장된 행 수:" + rows);
      
      //preparedSratement  닫기
      pstmt.close();
         
      }catch(ClassNotFoundException e) {
         e.printStackTrace();
      }catch(SQLException e) {
         e.printStackTrace();
      }finally {
         if(conn != null) {
            try {
               conn.close();
               System.out.println("연결 끊기");
            }catch(SQLException e) {}
         }
      }

   }

}