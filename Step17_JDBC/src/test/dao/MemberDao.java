package test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

/*
 * Data Access Object 만들어보기
 * 
 * -DB에 insert update delete select를 대신해주는 객체를
 * 생성할 클래스를 생성하기
 * 
 * 
 */
public class MemberDao {
	
	//회원의 정보를 저장하고 작업의 성공 여부를 리턴해주는 메소드
	
	public boolean insert(MemberDto dto) {
		PreparedStatement pstmt=null;
		Connection conn = null;
		int rowCount=0;
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
	         //sql 문 실행하고 변화된(추가,수정,삭제) row의 갯수를 리턴 받기
	         rowCount = pstmt.executeUpdate();
	      }catch(Exception e) {
	         e.printStackTrace();
	      }finally {
	         try {
	            if(pstmt!=null)pstmt.close();
	            if(conn!=null)conn.close();
	         }catch(Exception e) {}
	      }
		if(rowCount>0) return true;
		else return false;
	}
	public boolean update(MemberDto dto) {
		PreparedStatement pstmt=null;
		Connection conn = null;
		int rowCount=0;
		try {
	         //Connection 객체의 참조값 얻어오기
	         conn=new DBConnect().getConn();
	         //실행할 미완성의 sql 문
	         String sql="update member"
	               + " set name=?, addr=?"
	               + " where num=?";
	         //PreparedStatement 객체의 참조값 얻어오기
	         pstmt=conn.prepareStatement(sql);
	         pstmt.setString(1, (String)dto.getName());
	         pstmt.setString(2, (String)dto.getAddr());
	         pstmt.setInt(3, dto.getNum());
	         //sql 문 실행하고 변화된(추가,수정,삭제) row의 갯수를 리턴 받기
	         rowCount = pstmt.executeUpdate();
	      }catch(Exception e) {
	         e.printStackTrace();
	      }finally {
	         try {
	            if(pstmt!=null)pstmt.close();
	            if(conn!=null)conn.close();
	         }catch(Exception e) {}
	      }
		if(rowCount>0) return true;
		else return false;
	}
	
	public boolean delete(int num) {
		PreparedStatement pstmt=null;
		Connection conn = null;
		int rowCount=0;
		try {
	         //Connection 객체의 참조값 얻어오기
	         conn=new DBConnect().getConn();
	         //실행할 미완성의 sql 문
	         String sql="delete from member"
	               + " where num=?";
	         //PreparedStatement 객체의 참조값 얻어오기
	         pstmt=conn.prepareStatement(sql);
	         pstmt.setInt(1,num);
	         //sql 문 실행하고 변화된(추가,수정,삭제) row의 갯수를 리턴 받기
	         rowCount = pstmt.executeUpdate();
	      }catch(Exception e) {
	         e.printStackTrace();
	      }finally {
	         try {
	            if(pstmt!=null)pstmt.close();
	            if(conn!=null)conn.close();
	         }catch(Exception e) {}
	      }
		if(rowCount>0) return true;
		else return false;
	}
	
	public static List<MemberDto> getList(){
		   //회원 전체 목록을 담을 ArrayList 객체를 미리 생성해둔다.
		   List<MemberDto> tmplist=new ArrayList<>();
		   
	      Connection conn=null;
	      PreparedStatement pstmt=null;
	      ResultSet rs=null;
	      try {
	         //Connection 객체의 참조값 얻어오기
	         conn=new DBConnect().getConn();
	         //실행할 미완성의 sql 문
	         String sql="Select num,name,addr from member order by num asc";
	         //PreparedStatement 객체의 참조값 얻어오기
	         pstmt=conn.prepareStatement(sql);
	         //? 에 값 바인딩
	         rs=pstmt.executeQuery();
	         while(rs.next()) {
	            //커서가 위치한 곳의 정보를 MemberDto에 담고
	        	//그것을 List에 차곡차곡 쌓은 다음 최종값을 리턴한다.
	        	 MemberDto dto=new MemberDto();
	        	 dto.setNum(rs.getInt("num"));
	        	 dto.setName(rs.getString("name"));
	        	 dto.setAddr(rs.getString("addr"));
	        	 //회원 한명의 정보가 담긴 MemberDto 객체의 참조값을
	        	 //Arraylist에 누적시키기
	        	 tmplist.add(dto);
	        	 
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
	      return tmplist;
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
