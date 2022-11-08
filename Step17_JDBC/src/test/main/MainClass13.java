package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass13 {
	public static void main(String[] args) {
		int num = 1;
		
		MemberDto a= new MemberDto();
		a = getData(num);
		if(a!=null) {
		System.out.println(a.getNum()+"|"+a.getName()+"|"+a.getAddr());
		} else {
			System.out.println("회원 정보가 존재하지 않습니다. 회원 가입창으로 이동합니다.");
		}
	}
	
	public static MemberDto getData(int num) {
		  List<MemberDto> tmplist=new ArrayList<>();
		  MemberDto dto=new MemberDto();
	      Connection conn=null;
	      PreparedStatement pstmt=null;
	      ResultSet rs=null;
	      try {
	         //Connection 객체의 참조값 얻어오기
	         conn=new DBConnect().getConn();
	         //실행할 미완성의 sql 문
	         String sql="Select num,name,addr"
	         		+ " from member"
	         		+ " where num = ?";
	         //PreparedStatement 객체의 참조값 얻어오기
	         pstmt=conn.prepareStatement(sql);
	         //? 에 값 바인딩
	         pstmt.setInt(1, num);
	         rs=pstmt.executeQuery();
	         if (rs.next()) {
	        	 System.out.println("값이 존재합니다!");
	        	 dto.setNum(rs.getInt("num"));
		         dto.setName(rs.getString("name"));
		         dto.setAddr(rs.getString("addr"));
	         }else {
	        	 System.out.println("값이 없습니다.");
	        	 dto=null;
	         }
	         
	         
	      }catch(Exception e) {
	         e.printStackTrace();
	      }finally {
	         try {
	        	 if(rs!=null)rs.close();
	            if(pstmt!=null)pstmt.close();
	            if(conn!=null)conn.close();
	         }catch(Exception e) {}
	      }      
	      
	      //모든 회원의 정보가 누적된 ArrayList 객체의 참조값 리턴해주기.
	      return dto;
	 }
}
