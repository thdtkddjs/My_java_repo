package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass10 {
	public static void main(String[] args) {
		//수정할 회원의 정보
		int num=1;
		String name="호빵";
		String addr="분식집";
		
		MemberDto mem=new MemberDto();
		mem.setNum(num);
		mem.setName(name);
		mem.setAddr(addr);
		
		update(mem);
		
	}
	
	public static void update(MemberDto dto) {
		PreparedStatement pstmt=null;
		Connection conn = null;
		try {
	         //Connection 객체의 참조값 얻어오기
	         conn=new DBConnect().getConn();
	         //실행할 미완성의 sql 문
	         String sql="update member"
	               + " set name = ?, addr = ?"
	               + " where num = ?";
	         //PreparedStatement 객체의 참조값 얻어오기
	         pstmt=conn.prepareStatement(sql);
	         pstmt.setString(1, (String)dto.getName());
	         pstmt.setString(2, (String)dto.getAddr());
	         pstmt.setInt(3, dto.getNum());
	         //sql 문 실행하기
	           pstmt.executeUpdate();
	           System.out.println("회원 정보를 변경했습니다.");
	      }catch(Exception e) {
	         e.printStackTrace();
	      }finally {
	         try {
	            if(pstmt!=null)pstmt.close();
	            if(conn!=null)conn.close();
	         }catch(Exception e) {}
	      }
	}
}
