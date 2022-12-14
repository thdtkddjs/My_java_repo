package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass12 {
   public static void main(String[] args) {
      //여기서 전체 회원의 목록이 필요하면
      //getList() 메소드를 호출하는 것 만으로 전체 회원 목록을 얻어낼수 있다.
      List<MemberDto> list=getList();
      for(MemberDto tmp:list) {
         System.out.println(tmp.getNum()+" | "+tmp.getName()+" | "+tmp.getAddr());
      }
   }
   
   //전체 회원의 목록을 리턴해주는 메소드
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
}









