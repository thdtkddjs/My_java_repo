package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * JDBC( java Database Connectivity)
 * 
 * Database에 연결해서 Select, insert, updata, delete 작업하기
 * 
 * oracle에 연결하기 위해서는 드라이버 클래스가 들어있는 ojdbc6.jar파일을
 * 사용할 수 있도록 설정해야한다.
 */
public class MainClass01 {
	public static void main(String[] args) {
		   //DB 연결객체를 담을 지역 변수 만들기
	      Connection conn=null;
	      
	      try {
	         //오라클 드라이버 로딩
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         //접속할 DB 의 정보 @아이피주소:port번호:db이름
	         String url="jdbc:oracle:thin:@localhost:1521:xe";
	         //계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
	         conn=DriverManager.getConnection(url, "scott", "tiger");
	         //예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
	         System.out.println("Oracle DB 접속 성공");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      //select 작업을 위한 객체의 참조값을 담을 지역 변수 미리 만들기
	      PreparedStatement pstmt=null;
	      ResultSet rs=null;
	      
	      try {
	    	  //실행할 sql문
	    	  String sql="Select num,name,addr from member";
	    	  //preparedStatement 객체의 참조값 얻어오기
	    	  pstmt=conn.prepareStatement(sql);
	    	  //PreparedStatement객체를 이용해서
	    	  //ResultSet 객체로 받아오기
	    	  rs=pstmt.executeQuery();
	    	  //result.next는 cursor밑에 row가 있는지를 확인하여
	    	  //존재하면 true 리턴 후 커서를 한 칸 내린다.
	    	  //존재하지 않다면 false를 리턴한다.
	    	  while(rs.next()) {
	    		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
	    	  }
	      }catch(Exception e) {
	    	  e.printStackTrace();
	      
	      }
	}
}
