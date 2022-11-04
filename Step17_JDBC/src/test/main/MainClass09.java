package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;

import test.dto.MemberDto;
import test.mypac.Member;
import test.util.DBConnect;

public class MainClass09 {
	
	public static void main(String[] args) {
		//추가할 회원의 정보
		String name="주뎅이";
		String addr="봉천동";
		
		//회원의 정보를 담을 MemberDto 객체를 만들어서
		//setter를 이용해 정보를 담는다.
		MemberDto dto=new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		
		//메소드를 호출하고 회원 정보를 담은 객체를 전달한다.
		insert(dto);
	}
	//회원 한 명의 정보를 추가하는 메소드를 만들기
	public static void insert(MemberDto dto) {
		PreparedStatement pstmt=null;
		Connection conn = null;
		try {
	         //Connection 객체의 참조값 얻어오기
	         conn=new DBConnect().getConn();
	         //실행할 미완성의 sql 문
	         String sql="INSERT INTO member"
	               + " (num, name, addr)"
	               + " VALUES(member_seq.NEXTVAL, ?, ?)";
	         //PreparedStatement 객체의 참조값 얻어오기
	         pstmt=conn.prepareStatement(sql);
	         pstmt.setString(1, (String)dto.getName());
	         pstmt.setString(2, (String)dto.getAddr());
	         //sql 문 실행하기
	           pstmt.executeUpdate();
	           System.out.println("회원 정보를 추가했습니다.");
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
